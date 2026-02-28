public class HelloDocker {
    public static void main(String[] args) {
        // Print a simple message
        System.out.println("Hello, Docker!");
        
        // Example: loop through arguments
        if (args.length > 0) {
            System.out.println("You passed these arguments:");
            for (String arg : args) {
                System.out.println("- " + arg);
            }
        } else {
            System.out.println("No arguments provided.");
        }
    }
}
