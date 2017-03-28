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
	    if (misses.indexOf(letter) ! = -1 || hits.indexOf(letter) i = -1) {
		throw new IllegalArgumentException(letter + "has already been guessed");
	    }
	    boolean isHit = answer.indexOf(letter) != -1;
	    if (isHit) {
		    hits += letter;

	    } else {
		    misses += letter;
	    } //end of if/else statement

	    return isHit;

    } // end of applyGuess method

} // end of Game class definition
