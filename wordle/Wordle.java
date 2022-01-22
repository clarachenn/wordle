import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Wordle {
    public static void main (String[] args) throws FileNotFoundException {
        clearScreen();
        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(new File("words.txt"));
        ArrayList<String> words = new ArrayList<String>();
        while(scanner2.hasNextLine()){
            words.add(scanner2.nextLine());
        }

        Puzzle puzzle = new Puzzle(words);
        Player player = new Player();
        
        System.out.println("\ninstructions: \nyou have six tries to guess a five-letter word.");
        System.out.println("if your word contains a correct letter \n   and is in the correct spot -> * is printed beside the letter \n   but is in the wrong spot -> ! is printed beside the letter");
        
        while (puzzle.isUnsolved() && player.hasLives()) {
            String guess = scanner.nextLine();
            
            if(guess.length() != 5) System.out.println("that is not a five-letter word. guess again: ");
            else if(words.contains(guess)) {
                if(!puzzle.makeGuess(guess)) player.loseLife();
            } 
            else System.out.println("that is not a word. guess again:");
        }   
        
        if (player.hasLives()) System.out.println("you got the word!");
        else System.out.println("you lost! the word was " + puzzle.getWord());
    }
    
    public static void clearScreen() {
        System.out.println("\f");
    }
}

