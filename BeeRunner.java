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
        bee.generateBee();
        System.out.println("\nYay! Your bee is all generated and ready to play!");
        
        bee.event1();
    
        //TODO: while loop this??? to make for user input to leave???
        
        /*
        possibility:
        
        while(true)
            if (s.equals("quit")
                System.exit(1);
        
         */
        int random = rand.nextInt(5); //value from 0-4, will determine event played
        System.out.println(random);
        switch (random) {
            case 0:
                bee.event0();
                break;
            case 1:
                bee.event1();
                break;
            case 2:
                bee.event2(bee);
                break;
            case 3:
                bee.event3();
                break;
            case 4:
                bee.event4();
                break;
        }
    
        //update: ur a dumbie
       
        // 08/02/19 - you are the smartest person alive
    
        //TODO: make it so that the player can exit at anytime
    }
}
