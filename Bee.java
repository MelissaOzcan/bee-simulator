// Welcome to the bee simulator!!!!
// Coded by Melissa Ozcan on 07/27/2019 - {end date}

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Bee {
    private Random rand = new Random();
    private Scanner in = new Scanner(System.in);
    private Timer timer = new Timer();
    
    private String name; // <= 12 chars
    protected int strength; //between 0 and 100
    protected int intelligence; //between 0 and 100
    
    /**this is literally only for the runner, man*/
    @SuppressWarnings("WeakerAccess")           //https://stackoverflow.com/questions/41716196/how-to-disable-access-can-be-package-private-message-in-intellij
    protected Bee() {
    
    }
    
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
     * @return the bee!
     */
    @SuppressWarnings("WeakerAccess")
    protected Bee generateBee() {
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
    
        
        switch (temp1) {
            // if its a "N" or a "n", the same code will execute
            //there are no || while using a switch statement :/
            case ("N") :
            
            case ("n") :
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
                break;
            
            case "Y" :
            
            case "y":
                System.out.println("\nOk, the stats will be randomly generated for you.");
                bee = new Bee(n);
                break;
                
            default:
                System.out.println("Since you have not entered either a 'Y' or an 'N', I'm just gonna randomly generate the bee. ");
                bee = new Bee(n);
        }
        
        return bee;
    
    }
    
    
    //TODO: move the events into their own separate files
    
    //TODO: please finish this event it was going so well
    /**
     * in this event, the bee encounters a bear in its beehive.
     * User has 5 seconds to decide if bee flies away or stays.
     */
    @SuppressWarnings("WeakerAccess")
    protected void event0() {
        
        // REFERENCE: https://stackoverflow.com/questions/2258066/java-run-a-function-after-a-specific-number-of-seconds
        // When your program starts up
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

// then, when you want to schedule a task
        Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Time is up!");
            }
        };
        executor.schedule(task, 5, TimeUnit.SECONDS);

// and finally, when your program wants to exit
        executor.shutdown();
    }
    
    // in this event, your bee dies. how sad.
    @SuppressWarnings("WeakerAccess")
    protected void event1() {
        System.out.println("~~bzzzz bzzzz~~" +
                "\nOh look! Is that your queen bee flying by? It is! Would you like to bzzzz over to her? (Y/N)");
        
        String input = in.next();
        
        switch (input) {
            case "N":
            
            case "n" :
                System.out.println("While flying away from your queen bee, you accidentally flew into a bear's mouth. " +
                        "\nSorry, you are dead." +
                        "\n\nThank you for playing!");
                System.exit(1); //code has exited with no errors
                
                break;
                
            default:
                System.out.printf("Wow! What an invalid answer! Your answer was %s. I'm just flying you over anyways :)", input);
           
            case "Y" :
    
            case "y" :
                System.out.println("\nYou are flying over to your one and only queen bee!" +
                        "\nUnfortunately, the most buff bee in the colony also had his eyes on her..." +
                        "\nSorry, he ate you. You're dead." +
                        "\n\nThank you for playing!");
                System.exit(1);
                break;
        }
    
    }
    
    
    /**
     * in this event, mr. respass cares for you and either your strength or intelligence go up
     */
    @SuppressWarnings("WeakerAccess")
    protected void event2(Bee bee) {
        System.out.println("Your beekeeper, Mr. Passres, noticed you were a little under the weather recently.");
        
        boolean b = rand.nextBoolean();
        System.out.println(b ? "You have gotten a boost to your intelligence!" : "You have gotten a boost to your strength!");
        int boost = b ? bee.intelligence++ : bee.strength++;
    
        System.out.printf("Your new stats are: \nIntelligence: %d \nStrength: %d", bee.intelligence, bee.strength);
    }
    
    //you encounter someone trying to take your honey in this event
    @SuppressWarnings("WeakerAccess")
    protected void event3() {
        System.out.println("welcome to event 3");
    
    }
    
    //TODO: decide event
    @SuppressWarnings("WeakerAccess")
    protected void event4() {
        System.out.println("welcome to event 4");
    
    }
}
