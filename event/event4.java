package bee.event;

import bee.Bee;

import java.util.Random;

public class event4 {
    /**
     * in this event, you are sprayed with pesticides and either your intelligence or strength go down
     */
    @SuppressWarnings("WeakerAccess")
    protected void event4(Bee bee) {
        Random rand = new Random();
         
        System.out.println("\n\nWow, what a cool lookin garden over there! Seems you wanna go check it out!" +
                "\nOh no! You were sprayed with pesticides!  ");
    
        int i = rand.nextInt(10);
    
        if (i <= 4) {
            System.out.println("You have taken a hit to your intelligence!");
            bee.modIntelligence(rand.nextInt(5) * -1);
        } else if (i <= 7) {
            System.out.println("You have taken a hit to your strength!");
            bee.modStrength(rand.nextInt(5) * -1);
        } else if (i <= 9) {
            System.out.println("You have taken a hit to your health!");
            bee.modHealth(-1);
        }
        else { //if i==10
            System.out.println("You have escaped unscathed. Don't expect this next time.");
        }
    
        System.out.printf("Your new stats are: \n\tIntelligence: %d \n\tStrength: %d \n\tHealth: %d", bee.getIntelligence(), bee.getStrength(), bee.getHealth());
    
    }
    
}
