package bee.event;

import bee.Bee;

import java.util.Random;
import java.util.Scanner;

public class event1 {
    /**
     * in this event, your bee dies. how sad.
     */
    @SuppressWarnings("WeakerAccess")
    public void event1(Bee bee) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        
        System.out.println("\n\n~~bzzzz bzzzz~~" +
                "\nOh look! Is that your queen bee flying by? It is! Would you like to bzzzz over to her? (Y/N)");
        String input = in.next();
        
        String[] scenarios = {
                "\nWhile flying away from your queen bee, you accidentally flew into a bear's mouth.",
                "\nYou decided to bzzzz over to a flower that sadly had pesticides in it.",
                "\nWhile flying away, you bumped into a human that decided to wack you with their shoe."
        };
        
        switch (input) {
            case "N":
            case "n":
                System.out.println(scenarios[rand.nextInt(3)]);
                bee.modHealth(-1);
                
                if (bee.getHealth() == 0) {
                    System.out.println("\nSorry, you are dead.\n\nThank you for playing!");
                    System.exit(1); //code has exited with no errors
                } else {
                    System.out.printf("Your health bar has ~~taken a hit~~! You only have %d healths left.", bee.getHealth());
                }
            
            default:   //either "Y", "y", or invalid answer
                if (!(input.equals("Y") || input.equals("y")))
                    System.out.printf("Wow! What an invalid answer! Your answer was %s. I'm just flying you over anyways :)", input);
                
                System.out.println("\nYou are flying over to your one and only queen bee!" +
                        "\nUnfortunately, the most buff bee in the colony also had his eyes on her...");
                
                if (bee.getStrength() >= 50)
                    System.out.println("Good thing you're so strong! You ate that bee!");
                else {
                    bee.modHealth(-1);
                    if (bee.getHealth() == 0) {
                        System.out.println("\nSorry, he ate you. You're dead." +
                                "\n\nThank you for playing!");
                        System.exit(1);
                    } else {
                        System.out.printf("\nYour health bar has ~~taken a hit!~~ You now only have %d healths left.", bee.getHealth());
                    }
                    
                    break;
                }
        }
        
    }
    
    
}
