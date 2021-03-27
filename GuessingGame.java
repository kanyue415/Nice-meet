import java.util.Scanner;
import java.util.Random;
public class GuessingGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        String word;
        char track;
        char character;
        int score = 0 ;
        String playOn = "Y";
        String alphabet="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int num = alphabet.length();
        character =(alphabet.charAt(rand.nextInt(num)));
        System.out.println("This is the letter Randomly Generated to create a word from:" + " " + character);
        System.out.println("Type a word to begin the game!");       
        word = scan.nextLine();
        while (score == 0 && playOn == "Y") {
            character =(alphabet.charAt(rand.nextInt(num)));
            track = word.charAt(0); 
            System.out.println(character); 
            if (track != character) {
                         System.out.println("Game Over! Word does not match Letter. your score is: " + score); }
                        else
                       if (track == character) {
                        for (int i = 0; i == word.length(); i++){
                            score = score + word.charAt(i);   
                           }
                           if (track == character) {
                            for (int i =0; i == word.length(); i++){
                                if (word.charAt(i)<word.charAt(i+1)){
                                    score = score * 3;
                                }
                        }                       
        }
            System.out.println("your word was: " + word + " and the score for that word is: " +score);
    }
        System.out.println("Would you like to plan again Y/N?");
        playOn= scan.nextLine();
     }
     scan.close();
    }
}