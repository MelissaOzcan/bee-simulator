//Hi! This code is for playing the bee game! have fun!

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class BeeRunner {
    private static Random rand = new Random();
    private static Scanner in = new Scanner(System.in);
    private static Timer timer = new Timer();
    
    private BeeRunner() {
        System.out.println("Welcome to the ~~BEE SIMULATOR~~ ");
        for (int i = 0; i < 20; i++)
            System.out.print("\uD83D\uDC1D"); //emojis
        System.out.println();
        
        Bee bee = new Bee();
        bee.generateBee();
    
        System.out.println("\nYay! Your bee is all generated and ready to play!");
    
        int random = rand.nextInt() * 5; //value from 0-4, will determine event played
        
        //TODO: the switch statement that decides which event will run
        
        //update: ur a dumbie
        bee.event0();
        
        // 08/02/19 - you are the smartest person alive
        
        //TODO: make it so that the player can exit at anytime
    }
    
    public static void main(String[] args) {
        //TODO: figure out why you didnt just put all the code in main?!!?!?!?
        new BeeRunner();
    }
}
