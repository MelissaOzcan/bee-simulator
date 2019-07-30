import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class BeeRunner {
    private static Random rand = new Random();
    private static Scanner in = new Scanner(System.in);
    private static Timer timer = new Timer();
    
    public BeeRunner() {
        System.out.println("Welcome to the ~~BEE SIMULATOR~~ ");
    
        //TODO: figure out why this doesn't work
        Bee bee = generateBee();
        System.out.println("/nYay! Your bee is all generated and ready to play!");
    
        int random = rand.nextInt() * 5; //value from 0-4, will determine event played
    
        event0();
    }
}
