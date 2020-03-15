package bee;
//Hi! This code is for playing the bee game! have fun!

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import bee.event.*;

public class BeeRunner {
    
    //TODO: we need the game to have an actual goal
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Timer timer = new Timer();
        
        System.out.println("Welcome to the ~~BEE SIMULATOR~~ ");
        for (int i = 0; i < 20; i++)
            System.out.print("\uD83D\uDC1D"); //these are bee emojis
        System.out.println();
    
        Bee bee = new Bee();
        bee = bee.generateBee();
        
        System.out.println("\nYay! Your bee is all generated and ready to play!");
        
        int numOfRounds = 1; //keeps track of events played
        
        while (true) {
            
            // user has option to quit every 4th round.
            if (numOfRounds % 4 == 0) {
                System.out.println("\nWould you like to keep playing? (Y/N)");
                String input = in.nextLine();
                switch (input) {
                    case "Y":
                    case "y":
                        System.out.println("\nVery cool! We will keep playing.");
                        break;
                    case "N":
                    case "n":
                        System.out.println("\nHow sad! Bye bye then...");
                        System.exit(1);
                    default:
                        System.out.println("\nInvalid input! So that means we keep playing <3");
                        break;
                }
            }
            
            eventPicker();
            
            numOfRounds++;
        } //end of while(true) loop
        
        
        //update: ur a dumbie
    
        // 08/02/19 - you are the smartest person alive
    }
    
    public static void eventPicker() {
        Random rand = new Random();
    
        //decides which event will be played!
        switch (rand.nextInt(5)) {
            case 0:
                new event0();
                break;
            case 1:
                new event1();
                break;
            case 2:
                new event2();
                break;
            case 3:
                new event3();
                break;
            case 4:
                new event4();
                break;
        }
    }
}