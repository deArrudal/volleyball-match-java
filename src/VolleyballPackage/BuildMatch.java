/*
 * Volleyball Classes
 * Objective: Build a match object.
 * Implemented by Lucas deArruda
 * Created in 10/03/2023
 * v1.0
 */

package VolleyballPackage;

public class BuildMatch {
    // Default attributes.
    int set_number_ref = 5; // Default maximum number of sets.
    int set_point_ref = 25; // Default number of points in a set.
    int set_point_last_set = 15; // Default number of points in 5th set.

    // Game attributes.
    String winner = "";
    int set_number = 0;
    int set_point = set_point_ref;

    // Build teams.
    BuildTeam team_0 = new BuildTeam();
    BuildTeam team_1 = new BuildTeam();
    BuildTeam[] teams = { team_0, team_1 };
}
