package bee;
//Hi! This code is for testing the bee.Bee game! have fun!

//is this really necessary?????

//eeeeeee
public class BeeTester {
    public static void main(String[] args) {
    
        //TODO: test the creation of the bee object
        
        //TODO: test event0
        
        //TODO: test event1
        
        //TODO: why don't we test all the events
        
        
        //https://stackoverflow.com/questions/6415728/junit-testing-with-simulated-user-input
        /*
        
        hi! apparently here is how to test code requiring user input:
        
        

You can replace System.in with you own stream by calling System.setIn(InputStream in). Input stream can be byte array:
        
        ByteArrayInputStream in = new ByteArrayInputStream("My string".getBytes());
        System.setIn(in);

        // do your thing

        // optionally, reset System.in to its original
        System.setIn(System.in)
        
       
        Different approach can be make this method more testable by passing IN and OUT as parameters:

public static int testUserInput(InputStream in,PrintStream out) {
   Scanner keyboard = new Scanner(in);
    out.println("Give a number between 1 and 10");
    int input = keyboard.nextInt();

    while (input < 1 || input > 10) {
        out.println("Wrong number, try again.");
        input = keyboard.nextInt();
    }

    return input;
}
        
        
         */
        
    }
}
