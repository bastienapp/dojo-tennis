import java.util.HashMap;

public class Tennis {

    public static String[] match(int[] scores) {
        int player1 = 0;
        int player2 = 0;

        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == 1) {
                player1++;
            } else {
                player2++;
            }
        }

        // calcul des scores des joueurs 1 et 2            
        String score1 = "0";
        String score2 = "0";
        if (player1 < 3) {
            score1 = String.valueOf(player1 * 15);
        } else {
            score1 = "40";
        }
        if (player2 < 3) {
            score2 = String.valueOf(player1 * 15);
        } else {
            score2 = "40";
        }

        // calcul de l'avantage
        if (player1 >= 3 && player2 >= 3 && player1 != player2) {
            if (player1 > player2) {
                score1 = "advantage";
            } else {
                score2 = "advantage";
            }
        }

        return new String[]{score1, score2};
    }
}
