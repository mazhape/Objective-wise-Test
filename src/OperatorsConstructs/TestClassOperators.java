package OperatorsConstructs;

public class TestClassOperators {
    public static int m1(int i) {
        return ++i; // Increment i by 1 and return the new value
    }

    public static void main(String[] args) {
        int k = m1(args.length); // Step 1: Call m1 with args.length
        k += 3 + ++k; // Step 2: Update k using the expression
        System.out.println(k); // Step 3: Print the value of k
    }
}

//6

//Step 1: int k = m1(args.length);
//args.length represents the number of command-line arguments passed to the program. If no arguments are provided, args.length is 0.
//The m1 method is called with i = args.length (which is 0).
//
//Inside m1, ++i increments i by 1 (pre-increment), so i becomes 1.
//The method returns 1, which is assigned to k.
//Variable	Value
//k	1
//Step 2: k += 3 + ++k;
//The expression k += 3 + ++k is evaluated as follows:
//++k increments k by 1 (pre-increment), so k becomes 2.
//
//The expression 3 + ++k is evaluated as 3 + 2 = 5.
//
//The += operator adds 5 to the current value of k (2), so k becomes 7.
//
//Variable	Value
//k	7
//Step 3: System.out.println(k);
//
//The value of k is 7, so the program prints 7.