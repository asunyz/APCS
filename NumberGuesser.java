import java.util.Scanner;

public class NumberGuesser {
	
	// instance variables
	private int min, max;
	private int puzzle;
	private int numGuesses;
	
	public NumberGuesser(int min, int max) {
		this.min = min;
		this.max = max;
		this.generateNewPuzzle();
	}
	
	/**
	 * TODO: (1) randomly generate a number in range [min, max]
	 *       (2) reset numGuesses to 0
	 */
	public void generateNewPuzzle() {
		puzzle = 0; // delete me
	}
	
	/**
	 * TODO: compare guess and puzzle, return one of the following strings
	 *       "too large", "too small", "correct"
	 *       increment numGuesses
	 */
	public String makeGuess(int guess) { 
		return "No hint"; // delete me
	}
	
	/**
	 * Return the number of guesses made for the current puzzle
	 */
	public int getNumGuesses() {
		return numGuesses;
	}
	
	/**
	 * Don't need to change this
	 */
	public static void main (String[] args) {
		int min=1, max=100;
		NumberGuesser game = new NumberGuesser(min, max);
		Scanner s = new Scanner(System.in);
		boolean endGame = false;
		
		System.out.println("Welcome to the Number Guessing Game!");
		System.out.println("The possible range is ["+min+","+max+"]");
		System.out.println("Please make your guess!");
		
		while(!endGame) {
			
			// read new guess from player
			int guess = s.nextInt();
			String result = game.makeGuess(guess);
			
			// if the guess is correct, prompt the user to continue or end game
			if (result.equals("correct")) {
				System.out.println("Correct! You won in " + game.getNumGuesses() + "guesses!");
				System.out.println("Do you want to continue? [y]es [n]o");
				if(s.next().equals("y")) {
					game.generateNewPuzzle();
				}
				else {
					endGame = true;
				}
			}
			
			// if the guess is not correct, give hints
			else {
				System.out.println(result);
			}
		}
	}
	
}
