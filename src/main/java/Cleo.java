public class Cleo {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
    /**
     * Generates a response for the user's chat message.
     */
    public String getResponse(String input) {
        return "Cleo heard: " + input;
    }
}
