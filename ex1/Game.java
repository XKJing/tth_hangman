class Game {
    private String answer;
    private String hits;
    private String misses;

    public Game(String answer) {
        this.answer = answer;
	hits = "";
	misses = "";
    } // end of Game contrusctor

    public boolean applyGuess(char letter) {
	    boolean isHit = answer.indexOf(letter) != -1;
	    if (isHit) {
		    hits += letter;

	    } else {
		    misses += letter;
	    } //end of if/else statement

	    return isHit;

    } // end of applyGuess method

} // end of Game class definition
