package bee;
// Welcome to the bee simulator!!!!
// Coded by Melissa Ozcan on 07/27/2019 - {end date}

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//TODO:
//TODO:
//TODO: make it so that you have a heatlh bar so that the bee doesn't die so quickly

@SuppressWarnings("WeakerAccess")
public class Bee {
    private Random rand = new Random();
    private Scanner in = new Scanner(System.in);
    private Timer timer = new Timer();
    
    private String name; // <= 12 chars
    private int strength; //between 0 and 100
    private int intelligence; //between 0 and 100
    private int health = 5;
    
    /**
     * this is literally only for the runner, man
     */
    @SuppressWarnings("WeakerAccess")
    //https://stackoverflow.com/questions/41716196/how-to-disable-access-can-be-package-private-message-in-intellij
    protected Bee() {
    
    }
    
    /**
     * random bee constructor
     */
    private Bee(String n) {
        name = n;
        strength = rand.nextInt(101);
        intelligence = rand.nextInt(101);
        
    }
    
    /**
     * custom bee constructor
     */
    private Bee(String n, int s, int i) {
        name = n;
        strength = s;
        intelligence = i;
    }
    
    /**
     * method that makes the bee the user is playing with.
     *
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
            case ("N"):
            case ("n"):
                System.out.println("\nPlease enter a value from 0-100 for the strength and one for the intelligence," +
                        "seperated by a space.");
                int s = in.nextInt();
                int i = in.nextInt();
                while (s > 100 || s < 0) {
                    System.out.println("\nWhoops! The value for strength is not within the bounds." +
                            "\nPlease enter a number between 0 and 100.");
                    s = in.nextInt();
                }
                while (i > 100 || i < 0) {
                    System.out.println("\nWhoops! The value for intelligence is not within the bounds." +
                            "\nPlease enter a number between 0 and 100.");
                    i = in.nextInt();
                }
    
                bee = new Bee(n, s, i);
                break;
        
            //either "Y", "y", or invalid answer
            default:
                if (!(temp1.equals("Y") || temp1.equals("y")))
                    System.out.println("Since you have not entered either a 'Y' or an 'N', I'm just gonna randomly generate the bee. ");
                bee = new Bee(n);
                
                System.out.println("\nWould you like to hear your bees stats? (Y/N)");
                String ss = in.nextLine();
    
                switch (ss) {
                    case "Y":
                    case "y":
                        System.out.printf("OK! Here are your bees stats:" +
                                        "\n\tName: %s" +
                                        "\n\tIntelligence: %d" +
                                        "\n\tStrength: %d" +
                                        "\n\tHealth: %d",
                                bee.name, bee.intelligence, bee.strength, bee.health);
    
                        break;
                    case "N":
                    case "n":
                        System.out.println("Very cool. Live your bee-st life.");
                        break;
                    default:
                        System.out.println("Wow! I sure love an invalid answer. No stats for you!!!");
                        break;
                }
                break;
        }
    
        return bee;
    
    }
    
    //TODO: move the events into their own separate files
    
    
    /**
     * in this event, mr. respass cares for you and either your strength or intelligence go up.
     */
    @SuppressWarnings("WeakerAccess")
    protected void event2(Bee bee) {
        System.out.println("\n\nYour beekeeper, Mr. Passres, noticed you were a little under the weather recently.");
        
        //TODO: make this code more readable pls
        //TODO: how about no.
        
        boolean b = rand.nextBoolean();
        System.out.println(b ? "You have gotten a boost to your intelligence!" : "You have gotten a boost to your strength!");
        int boost = b ? bee.intelligence++ : bee.strength++;
        
        //the max values are 100
        //if ur value was already 100, sorry.
        bee.intelligence = bee.intelligence % 100;
        bee.strength = bee.strength % 100;
    
        System.out.printf("Your new stats are: \n\tIntelligence: %d \n\tStrength: %d", bee.intelligence, bee.strength);
    }
    
    /**
     * you encounter someone trying to take your honey in this event
     */
    @SuppressWarnings("WeakerAccess")
    //TODO: finish event plz
    protected void event3() {
        System.out.println("\n\n~~bzzzzzz bzzzzzz~~" +
                "Oh no! You spot a human tryna take ur hunney! Do you sting them? (Y/N)");
        String input = in.nextLine();
        
        switch (input) {
            case ("Y"):
            case ("y"):
                System.out.println("\nDid you know that by stinging something, you die?" +
                        "\nWell, now you do." +
                        "\nSorry, you are dead." +
                        "\n\nThank you for playing!");
                System.exit(1);
                break;
    
            //also includes "N" and "n"
            default:
                if (!(input.equals("N") || input.equals("n")))
                    System.out.println("An invalid answer? Ok, seems you wont be stingin anyone today.");
    
                //TODO: think of something.
                break;
        }
    
    }
    
    /**
     * in this event, you are sprayed with pesticides and either your intelligence or strength go down
     */
    @SuppressWarnings("WeakerAccess")
    protected void event4(Bee bee) {
        System.out.println("\n\nWow, what a cool lookin garden over there! Seems you wanna go check it out!" +
                "\nOh no! You were sprayed with pesticides!");
    
        //TODO: make this code more readable pls
        //TODO: how about no.
    
        boolean b = rand.nextBoolean();
        System.out.println(b ? "You have taken a hit to your intelligence!" : "You have taken a hit to your strength!");
        int boost = b ? bee.intelligence-- : bee.strength--;
    
        //the max values are 100
        //if ur value was already 100, sorry.
        bee.intelligence = bee.intelligence % 100;
        bee.strength = bee.strength % 100;
    
        System.out.printf("Your new stats are: \n\tIntelligence: %d \n\tStrength: %d", bee.intelligence, bee.strength);
    
    }
    
    public String getName() {
        return name;
    }
    
    public int getStrength() {
        return strength;
    }
    
    public int getIntelligence() {
        return intelligence;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void decHealth() {
        health--;
    }
}
//is this code too long???? seperate files?????