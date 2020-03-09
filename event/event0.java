package bee.event;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class event0 {
    //TODO: please finish this event
    
    /**
     * in this event, the bee encounters a bear in its beehive.
     * User has 5 seconds to decide if bee flies away or stays.
     */
    @SuppressWarnings("WeakerAccess")
    public static void main(String[] args) {
    
        System.out.println("welcome to event 0");
        
        // REFERENCE: https://stackoverflow.com/questions/2258066/java-run-a-function-after-a-specific-number-of-seconds
        // When your program starts up
        ScheduledExecutorService executor = Executors.newSingleThreadScheduledExecutor();

// then, when you want to schedule a task
        /*
        ~~the code that the lambda expression replaced~~
        
         Runnable task = new Runnable() {
            @Override
            public void run() {
                System.out.println("Time is up!");
            }
        };
         */
        Runnable task = () -> System.out.println("Time is up!"); //this is a lambda expression?!?
        executor.schedule(task, 5, TimeUnit.SECONDS);

// and finally, when your program wants to exit
        executor.shutdown();
    }
    
}
//TODO: finish this