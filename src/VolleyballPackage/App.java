/* Volleyball Game
 * Objective: Simulate a volleyball game between two teams.
 * Implemented by Lucas deArruda
 * Created in 10/03/2023
 * v1.0
 */

package VolleyballPackage;

// Import libraries.
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Declare variables.
        BuildMatch game = new BuildMatch();
        String msg;

        // Set game.
        JOptionPane.showMessageDialog(null, "Define Teams");
        msg = "Enter the team's name: ";
        game.team_0.name = JOptionPane.showInputDialog(msg);
        game.team_1.name = JOptionPane.showInputDialog(msg);

        // Game.
        msg = "Game Start\n" + game.teams[0].name + " x " + game.teams[1].name;
        JOptionPane.showMessageDialog(null, msg);

        // Display initial score.
        Methods.Display_Score(game.teams);

        while (game.winner.isEmpty()) {
            // Compute point.
            Methods.Compute_Point(game.teams);

            // Display score.
            Methods.Display_Score(game.teams);

            // Check if the set ended.
            Methods.Check_Set(game);

            // Check if the match ended.
            Methods.Check_Match(game);
        }

        msg = "Game Over\n" + "Winner: " + game.winner;
        JOptionPane.showMessageDialog(null, msg);
    }
}
