public class Hangman {

	public static void main(String[] args) {

		Game game = new Game("treehouse");
		Prompter prompter = new Prompter(game);
		while(game.getRemainingTries() > 0){
			prompter.displayProgress();
			prompter.promptForGuess();
		
		}
		
		//boolean isHit = prompter.prompterForGuess();
		
		/*if (isHit) {
			System.out.println("We got a hit!");
			
		} else {
			System.out.println("Oops missed!");
		}
		prompter.displayProgress();**/
	}
	

}
