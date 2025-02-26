package JavaBasics;

public class ATest {

    String global = "111"; // Instance variable

    public int parse(String arg) {
        int value = 0; // Local variable
        try {
            String global = arg; // Local variable (shadows the instance variable)
            value = Integer.parseInt(global); // Parse the local `global` variable
        } catch (Exception e) {
            System.out.println(e.getClass()); // Print the exception class if parsing fails
        }
        System.out.print(global + " " + value + " "); // Print the instance variable `global` and `value`
        return value; // Return the parsed value
    }

    public static void main(String[] args) {
        ATest ct = new ATest(); // Create an instance of ATest
        System.out.print(ct.parse("333")); // Call `parse` and print its return value
    }
}


//111 333 333