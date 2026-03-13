public class HelloApp {
    public static void main(String[] args) {

        String name = "World";   // default value

        if (args.length > 0) {
            name = args[0];      // take name from command line
        }

        System.out.println("Hello, " + name + "!");
    }
}