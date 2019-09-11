package bee.event;

import java.util.Scanner;

public class event3 {
    /**
     * you encounter someone trying to take your honey in this event
     */
    @SuppressWarnings("WeakerAccess")
    //TODO: finish event plz
    protected void event3() {
        Scanner in = new Scanner(System.in);
        
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
                
               new event2();
                break;
        }
        
    }
    
}
