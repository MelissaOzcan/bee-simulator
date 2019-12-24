package bee.event;

import bee.Bee;

import java.util.Random;
import java.util.Scanner;

public class event2 {
    
    /**
     * in this event, mr. respass cares for you and either your strength or intelligence go up.
     */
    protected void event2(Bee bee) {
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
         
        System.out.println("\n\nYour beekeeper, Mr. Passres, noticed you were a little under the weather recently.");
        
        int i = rand.nextInt(3);
        
        if (i == 0) {
            System.out.println("You have gotten a boost to your intelligence!");
            bee.modIntelligence(rand.nextInt(5));
        } else if (i == 1) {
            System.out.println("You have gotten a boost to your strength!");
            bee.modStrength(rand.nextInt(5));
        } else { //if (i == 2)
            System.out.println("You have gotten a boost to your health!");
            bee.modHealth(1);
        }
        
        System.out.printf("Your new stats are: \n\tIntelligence: %d \n\tStrength: %d \n\tHealth: %d", bee.getIntelligence(), bee.getStrength(), bee.getHealth());
    }
}

