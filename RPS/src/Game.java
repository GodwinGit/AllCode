import java.util.*;

public class Game {
	protected String userInput;
	protected String computerInput;
	String[] words = { "paper", "rock", "scissors" };
	Random ran = new Random();

	public void startGame(Player p1, Player computer) {
		System.out.println("Game started");
		Scanner myScanner = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out
					.println("Please enter your play, Rock, Paper, or Scissors");
			userInput = myScanner.next();
			computerInput = words[ran.nextInt(3)];

			if ((userInput.toLowerCase().equals("rock") && computerInput.equals("scissors"))|| (userInput.toLowerCase().equals("scissors") && computerInput.equals("paper"))|| (userInput.toLowerCase().equals("paper") && computerInput.equals("rock"))) {
				p1.setNumOfWins(1);
				System.out.println(p1.getName() + "chose: " + userInput);
				System.out.println("Computer chose: " + computerInput);
				System.out.println("Winner: " + p1.getName() + " :-)");

			} else if ((userInput.toLowerCase().equals("scissors") && computerInput.equals("rock"))|| (userInput.toLowerCase().equals("paper") && computerInput.equals("scissors"))|| (userInput.toLowerCase().equals("rock") && computerInput.equals("paper"))) {
				computer.setNumOfWins(1);
				System.out.println(p1.getName() + "chose: " + userInput);
				System.out.println("Computer chose: " + computerInput);
				System.out.println("Winner: Computer :(");
			}

			else {
				System.out.println(p1.getName() + "chose: " + userInput);
				System.out.println("Computer chose: " + computerInput);
				System.out.println("Game drawn! no winner");
			}

			p1.setNumOfGamesPlayed(1);
			computer.setNumOfGamesPlayed(1);

		}

		System.out.println("The results:");
		System.out.println("Number of games played " + p1.getNumOfGamesPlayed());
		System.out.println(p1.getName() + " has won " + p1.getNumOfWins()+ " games.");
		System.out.println("Computer has won " + computer.getNumOfWins()	+ " games.");
		//System.out.println("Number of games drawn: " + p1.getNumOfGamesPlayed() -(p1.getNumOfWins() + computer.getNumOfWins())	+ " games.");
		System.out.println();
		System.out.println(p1.getName() + " percentage won: "+ p1.getNumOfWins() * 20 + " %");
		System.out.println("Computer percentage won: "+ computer.getNumOfWins() * 20 + " %");
		System.out.println("Drawn games percentage :" + (computer.getNumOfWins() * 20) + (p1.getNumOfWins() * 20) + " %");
		
	}

	public static void main(String[] args) {
		Game g = new Game();
		Player saber = new Player("Saber");
		Player computer = new Player("Computer");
		g.startGame(saber, computer);
	}

}
