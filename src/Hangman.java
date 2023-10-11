public class Hangman {
    private String secretWord;
    private String userGuess;

    public Hangman(String secretWord, String userGuess){
        this.secretWord = secretWord;
        this.userGuess = userGuess;
    }

    public String getSecretWord(){
        return secretWord;
    }

    public String getUserGuess(){
        return userGuess;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public void setUserGuess(String userGuess) {
        this.userGuess = userGuess;
    }
}
