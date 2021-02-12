package lambdaexample;

import io.edgarsoftware.isthesiteup.controllers.GreetingMessage;

public class Main {
    
    public static void main(String[] args) {
        GreetingMessage gm = new GreetingMessage(){
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            } 
        };
        gm.greet("Bethan");

        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Edgar");

        MessagePrinter mp = () -> {
            System.out.println("This is a message!");
        };
        mp.printMessage();

        FarewellMessage fm = (message) -> {
            System.out.println("Bye " + message);
        };
        fm.printMessage("my friend!");
    }

}
