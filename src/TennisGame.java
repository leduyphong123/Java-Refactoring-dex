public class TennisGame {

    public static String getScore(String player1Name, String player2Name, int playerSocre1, int playerScore2) {
        String score = "";
        int tempScore = 0;
        if (playerSocre1 == playerScore2) {
            score = getString(playerSocre1);
        } else if (getPlayerSocre(playerSocre1) || getPlayerSocre(playerScore2)) {
            int minusResult = playerSocre1 - playerScore2;
            score = getSocreMinus(minusResult);
        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = playerSocre1;
                } else {
                    score += "-";
                    tempScore = playerScore2;
                }
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    private static String getSocreMinus(int minusResult) {
        String score;
        if (minusResult == 1) {
            score = "Advantage player1";
        } else if (minusResult == -1) {
            score = "Advantage player2";
        } else if (minusResult >= 2) {
            score = "Win for player1";
        } else {
            score = "Win for player2";
        }
        return score;
    }

    private static String getString(int playerSocre1) {
        String score;
        switch (playerSocre1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }

    private static String getString(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }

    private static boolean getPlayerSocre(int playerSocre) {
        return playerSocre >= 4;
    }
}