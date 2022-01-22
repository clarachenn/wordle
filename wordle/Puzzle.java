import java.util.*;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private String word;
    private String guess;
    
    public Puzzle(ArrayList<String> w) {
        word = w.get((int)(Math.random() * 5757) +1);  
    }
    
    public boolean isUnsolved() {
        if(word.equals(guess)) return false;
        else return true;
    }
    
    public boolean makeGuess(String g) {
        guess = g;
        String a = guess.substring(0,1);
        String b = guess.substring(1,2);
        String c = guess.substring(2,3);
        String d = guess.substring(3,4);
        String e = guess.substring(4,5);        
        
        if(word.contains(a)) {
            if(word.substring(0,1).equals(a)) {
                System.out.print(a + "*");
            }
            else System.out.print(a + "!");
        } else System.out.print(a);
        
        if(word.contains(b)) {
            if(word.substring(1,2).equals(b)) {
                System.out.print(" " + b + "*");
            }
            else System.out.print(" " + b + "!");
        } else System.out.print(" " + b);
        
        if(word.contains(c)) {
            if(word.substring(2,3).equals(c)) {
                System.out.print(" " + c + "*");
            }
            else System.out.print(" " + c + "!");
        } else System.out.print(" " + c);
        
        if(word.contains(d)) {
            if(word.substring(3,4).equals(d)) {
                System.out.print(" " + d + "*");
            }
            else System.out.print(" " + d + "!");
        } else System.out.print(" " + d);
        
        if(word.contains(e)) {
            if(word.substring(4,5).equals(e)) {
                System.out.println(" " + e + "*");
            }
            else System.out.println(" " + e + "!");
        } else System.out.println(" " + e);
    
        return word.equals(guess);
    
    }
    public String getWord() {
        return word;
    }
}