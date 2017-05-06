
package hangman;

import java.util.ArrayList;
import java.util.Scanner;
//import java.util.concurrent.ThreadLocalRandom;

public class Hangman {
    static String[][] category = {{"football","handball","rally","gymlastic"},{"rabbit","whale","dolphin","tiger"},{"ankara","los angeles","toronto","sdney"}};
        
    public static void main(String[] args) {
        System.out.println("Choose a category");
        System.out.println("1)Sport");
        System.out.println("2)Animal");
        System.out.println("3)City");
        tahmin();
        }
    public static void tahmin(){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        ArrayList<Character> bilinenler = new ArrayList<>();
        int r=(int)(Math.random()*4);
        String word=category[number-1][r];
        char alinan;
        int counter=0;
        do {
            int bilinmeyenvar = 0;
            System.out.print("\nYour word: ");
            for(int i=0;i<word.length();i++){
                if(bilinenler.contains(new Character(word.charAt(i))))
                {
                    System.out.print(word.charAt(i));
                } else {
                    if(word.charAt(i)!=' ')
                    bilinmeyenvar = 1;
                    System.out.print("*");
                }
            }
            if(bilinmeyenvar == 0)
            {
                System.out.println("\nCongratulations! You missed "+ counter +" time.");
                break;
            }
            System.out.print(" Guess a letter: ");
            alinan = input.next().charAt(0); //char) (input.nextByte() & 0xFF);
            if(word.contains(String.valueOf(alinan))) bilinenler.add(new Character(alinan));
            else{counter++; System.out.println(alinan + " is not in the word.");}
        } while(true);
          
    }
}

