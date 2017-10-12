import java.util.HashMap;

public class Tennis {

	private String player1;
	private String player2;

	public Tennis(String player1, String player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public HashMap getScore(int[] points) {
		HashMap scores = new HashMap<String, String>();
        scores.put(player1, "0");
        scores.put(player2, "0");

		for (int i = 0; i < points.length; i++) {
			String currentPlayer = points[i] == 1 ? player1 : player2;
			String otherPlayer = currentPlayer == player1 ? player2 : player1;
			String currentScore = scores.get(currentPlayer).toString();
			String otherScore = scores.get(otherPlayer).toString();

			switch (currentScore) {
				case "0":
					currentScore = "15";
					break;

				case "15":
					currentScore = "30";
					break;

				case "30":
					currentScore = "40";
					break;

				case "40":
					switch (otherScore) {
						case "40":
							currentScore = "advantage";
							break;

						case "advantage":
							otherScore = "40";
							break;
					}
			}
			scores.put(currentPlayer, currentScore);
			scores.put(otherPlayer, otherScore);

		}

		return scores;
	}

	public String getPlayer1() {
		return player1;
	}

	public String getPlayer2() {
		return player2;
	}
}