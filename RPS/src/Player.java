public class Player {

	protected String name;
	protected int numOfGamesPlayed = 0;
	protected int numOfWins = 0;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfGamesPlayed() {
		return numOfGamesPlayed;
	}

	public void setNumOfGamesPlayed(int numOfGamesPlayed) {
		this.numOfGamesPlayed += numOfGamesPlayed;
	}

	public int getNumOfWins() {
		return numOfWins;
	}

	public void setNumOfWins(int numOfWins) {
		this.numOfWins += numOfWins;
	}
}
