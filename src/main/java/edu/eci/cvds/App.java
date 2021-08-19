package edu.eci.cvds;

/**
 * Hello world!
 *
 */
public class App {
//  mvn exec:java -Dexec.mainClass=test.Main -Dexec.args="arg1 arg2 arg3"
    public static void main( String[] args ) {
        String output = "Hello %s!";
        String name = "World";

        if (args.length > 0) {
            name = args[0];
        }

        System.out.println("\n\n");
        System.out.println(String.format(output, name));
        System.out.println("\n\n");
    }
}
