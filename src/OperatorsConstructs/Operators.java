package OperatorsConstructs;

public class Operators {

    public static int operators() {
        int x1 = -4; // Step 1: x1 is initialized to -4
        int x2 = x1--; // Step 2: x2 is assigned the value of x1, then x1 is decremented
        int x3 = ++x2; // Step 3: x2 is incremented, then x3 is assigned the new value of x2
        if (x2 > x3) { // Step 4: Check if x2 > x3
            --x3; // Step 5: If true, decrement x3
        } else {
            x1++; // Step 6: If false, increment x1
        }
        return x1 + x2 + x3; // Step 7: Return the sum of x1, x2, and x3
    }

    public static void main(String[] args) {
        System.out.println(operators()); // Step 8: Print the result of operators()
    }
}


//-10

//Initializations:
//
//int x1 = -4;
//x1 is set to -4.
//
//int x2 = x1--;
//The value of x2 is set to x1, but then x1 is decremented.
//Initially, x1 is -4, so x2 becomes -4 and then x1 becomes -5.
//
//int x3 = ++x2;
//x2 is incremented first (pre-increment), so x2 becomes -3, and then x3 is set to -3.
//
//Condition Check:
//
//The condition if(x2 > x3) is checked:
//x2 is -3 and x3 is -3. Since x2 is not greater than x3 (they are equal), the else block is executed.
//
//In the else block:
//x1++ is executed. This means x1 is incremented by 1. So, x1 becomes -4.
//
//Return Statement:
//
//The method returns x1 + x2 + x3. Now we know the values:
//x1 = -4
//x2 = -3
//x3 = -3
//So, the return value is -4 + (-3) + (-3) = -10