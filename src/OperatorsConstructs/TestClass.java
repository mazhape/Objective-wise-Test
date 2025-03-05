package OperatorsConstructs;

public class TestClass {
    public static void main(String[] args) {
        calculate(2); // Call the calculate method with x = 2
    }

    public static void calculate(int x) {
        String val; // Declare a String variable val, but do not initialize it
        switch (x) {
            case 2:
            default:
                val = "def"; // Assign "def" to val in the default case
        }
        System.out.println(val); // Attempt to print val
    }
}

//def