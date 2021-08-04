public class HiddenWord {

	// instance variables (hint: you need 1)
	
	// constructors
	public HiddenWord(String word) {
		// todo
	}
	
	// instance methods (hint: use for loop and if clauses)
	public String getHint(String guess) {
		// todo
	}
	
	// You don't need to change this
	public static void main(String[] args) {
		HiddenWord puzzle = new HiddenWord("HARPS"); 
		System.out.println(puzzle.getHint("AAAAA")); // "+A+++"
		System.out.println(puzzle.getHint("HELLO")); // "H****"
		System.out.println(puzzle.getHint("HEART")); // "H*++*"
		System.out.println(puzzle.getHint("HARMS")); // "HAR*S"
		System.out.println(puzzle.getHint("HARPS")); // "HARPS"

	}

}
