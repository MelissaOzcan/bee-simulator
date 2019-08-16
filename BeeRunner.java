package bee;
//Hi! This code is for playing the bee game! have fun!

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class BeeRunner {
    
    public static void main(String[] args) {
    
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        Timer timer = new Timer();
        
        System.out.println("Welcome to the ~~BEE SIMULATOR~~ ");
        for (int i = 0; i < 20; i++)
            System.out.print("\uD83D\uDC1D"); //emojis
        System.out.println();
    
        Bee bee = new Bee();
        bee = bee.generateBee();    //TODO: should the generateBee code go in the runner? feels like a runner type of ting ngl
        
        System.out.println("\nYay! Your bee is all generated and ready to play!");
        
        
        
        int numOfRounds = 1; //keeps track of events played
        
        while (true) {
            
            // user has option to quit every 3rd round
            if (numOfRounds % 3 == 0) {
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
            
            //decides which event will be played!
            switch (rand.nextInt(5)) {
                case 0:
                    bee.event0();
                    break;
                case 1:
                    bee.event1(bee);
                    break;
                case 2:
                    bee.event2(bee);
                    break;
                case 3:
                    bee.event3();
                    break;
                case 4:
                    bee.event4(bee);
                    break;
            }
            numOfRounds++;
        } //end of while(true) loop
        
        
        //update: ur a dumbie
    
        // 08/02/19 - you are the smartest person alive
    }
}