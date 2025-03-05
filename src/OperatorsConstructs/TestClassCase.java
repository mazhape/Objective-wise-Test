package OperatorsConstructs;

public class TestClassCase {
    public static void main(String args[]) {
        int x = Integer.parseInt(args[0]); // Step 1: Parse the first command-line argument as an integer
        switch (x) {
            case x < 5:   System.out.println("BIG"); break; // Step 2: Invalid case label
            case x > 5:   System.out.println("SMALL"); // Step 3: Invalid case label
            default:    System.out.println("CORRECT"); break; // Step 4: Default case
        }
    }
}

//Compile time error