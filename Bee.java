// Welcome to the bee simulator!!!!
// Coded by Melissa Ozcan on 07/27/2019 - {end date}

import java.util.Random;
import java.util.Scanner;

public class Bee {
    private static Random rand = new Random();
    private static Scanner in = new Scanner(System.in);
    
    private String name; // <= 12 chars
    private int strength; //between 0 and 100
    private int intelligence; //between 0 and 100
    
    /**random bee constructor*/
    private Bee(String n) {
        name = n;
        strength = rand.nextInt() * 100;
        intelligence = rand.nextInt() * 100;
    }
    
    
    /**custom bee constructor*/
    private Bee(String n, int s, int i) {
        name = n;
        strength = s;
        intelligence = i;
    }
    
    /** method that makes the bee the user is playing with.
     * @return the bee
     */
    private static Bee generateBee() {
        String n; //temp storage for the name
        String temp1;
    
        Bee bee;
    
        System.out.println("\nTo begin, please enter a name for your bee. Less than 12 characters please!");
        n = in.nextLine();
        while (n.length() > 12) {
            System.out.println("\nPlease!!! Less than 12 characters!!!");
            n = in.nextLine();
        }
        //at this point, the name is chosen.
    
        System.out.printf("\n%s! What a great name! " +
                "Now, would you like the stats of this bee to be randomly generated? (Y/N)", n);
        temp1 = in.next();
    
    
        //TODO: switch statement?
        
        if (temp1.equals("N") || temp1.equals("n")) {
            System.out.println("\nPlease enter a value from 0-100 for the strength and one for the intelligence," +
                    "seperated by a space.");
            int s = in.nextInt();
            int i = in.nextInt();
            while(s > 100 || s < 0) {
                System.out.println("\nWhoops! The value for strength is not within the bounds." +
                        "\nPlease enter a number between 0 and 100.");
                s = in.nextInt();
            }
            while(i > 100 || i < 0) {
                System.out.println("\nWhoops! The value for intelligence is not within the bounds." +
                        "\nPlease enter a number between 0 and 100.");
                i = in.nextInt();
            }
        
            bee = new Bee(n, s, i);
        } else if (temp1.equals("Y") || temp1.equals("y")) {
            System.out.println("\nOk, the stats will be randomly generated for you.");
            bee = new Bee(n);
        } else {
            System.out.println("Since you have not entered either a 'Y' or an 'N', I'm just gonna randomly generate the bee. ");
            bee = new Bee(n);
        }
        
        return bee;
    
    }
    
    private void event0() {
    
    }
    
    private void event1() {
    
    }
    
    private void event2() {
    
    }
    
    private void event3() {
    
    }
    
    private void event4() {
    
    }
    
    public static void main(String[] args) {
        System.out.println("Welcome to the ~~BEE SIMULATOR~~ ");
        
        Bee bee = generateBee();
        System.out.println("Yay! Your bee is all generated and ready to play!");
        
        int random = rand.nextInt() * 5; //value from 0-4, will determine event played
    }
    
    /**
     * in this event, the bee encounters a bear in its
     */
   
}
