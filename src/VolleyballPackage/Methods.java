/*
 * Volleyball Methods
 * Objective: Define the methods necessary to simulate a volleyball match.
 * Implemented by Lucas deArruda
 * Created in 10/03/2023
 * v1.0
 */

package VolleyballPackage;

// Import libraries.
import javax.swing.JOptionPane;

public class Methods {

    static void Display_Score(BuildTeam[] squads) {
        // Display the current game's score.
        String msg;

        msg = "Scoreboard\n"
                + squads[0].name + ": Sets: " + squads[0].set + ", Points: " + squads[0].score
                + "\n"
                + squads[1].name + ": Sets: " + squads[1].set + ", Points: " + squads[1].score;
        JOptionPane.showMessageDialog(null, msg);
    }

    static void Compute_Point(BuildTeam[] squads) {
        // Compute point to a team.
        String squad_name;

        squad_name = JOptionPane.showInputDialog("Who scored? ");

        if (squad_name.equals(squads[0].name)) {
            squads[0].score += 1;
        } else if (squad_name.equals(squads[1].name)) {
            squads[1].score += 1;
        }
    }

    static void Check_Set(BuildMatch match) {
        // Check if the set ended and reset score if necessary.

        // Check if last point is a set point case.
        if ((match.set_point == match.teams[0].score) || (match.set_point == match.teams[1].score)) {
            // If difference in score is greater than 2: Set ended.
            if (Math.abs(match.teams[0].score - match.teams[1].score) >= 2) {
                // Compute set.
                if (match.teams[0].score == match.set_point) {
                    match.teams[0].set += 1;
                } else if (match.teams[1].score == match.set_point) {
                    match.teams[1].set += 1;
                }

                // Reset scores.
                match.teams[0].score = 0;
                match.teams[1].score = 0;

                // Update set number.
                match.set_number += 1;

                JOptionPane.showMessageDialog(null, "End Set");

                // Return set point to default value.
                if (match.set_number == (match.set_number_ref - 1)) {
                    // Set point is set to 15.
                    match.set_point = match.set_point_last_set;
                } else {
                    // Set point is set to 25.
                    match.set_point = match.set_point_ref;
                }

                // Display set score.
                Display_Score(match.teams);
            }
            // If difference in score is less than 2: Increase set point.
            else {
                match.set_point += 1;
            }
        }
    }

    static void Check_Match(BuildMatch match) {
        // Check if the match ended.

        if ((Math.abs(match.teams[0].set - match.teams[1].set) >= 2) || (match.set_number == match.set_number_ref)) {
            // End game.
            if (match.teams[0].set > match.teams[1].set) {
                match.winner = match.teams[0].name;
            } else {
                match.winner = match.teams[1].name;
            }
        }
    }

}
