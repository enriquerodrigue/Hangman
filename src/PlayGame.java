import javax.swing.JOptionPane;
public class PlayGame {
    public static void main(String[] args) {

        do {
            Hangman aGame = new Hangman();

            processGuesses(aGame);

            determineWinner(aGame);
        } while ();
    }

    public static void processGuesses(Hangman aGame){
        int secretWordLength = aGame.getSecretWord().length();
        int chances = 3 * secretWordLength;
        int usedChances = 0;
        int loc = -1;
        while (usedChances < chances &&
                !(aGame.getSecretWord().equalsIgnoreCase(aGame.getUserGuess()))) {
        usedChances++;
        char usedGuessedLetter = JOptionPane.showInputDialog("Tell me a letter to guess");
        loc -= 1;

        do{
            loc++;
            loc = aGame.getSecretWord().indexOf(userGuessedLetter, loc);
            if(loc >= 0){

            }
        }while(loc > -1);
        }
    }

    public static void determineWinner(Hangman aGame){

    }
}
