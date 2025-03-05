package OperatorsConstructs;

public class TestBoolean {
    static boolean a; // Default value: false
    static boolean b; // Default value: false
    static boolean c; // Default value: false

    public static void main(String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true); // Step 1: Evaluate the expression
        System.out.print(a + ", " + b + ", " + c); // Step 2: Print the values of a, b, and c
    }
}

//
//Step 1: Evaluate the Expression (a = true) || (b = true) && (c = true)
//
//The expression involves logical operators || (OR) and && (AND).
//
//The precedence of && is higher than ||, so the expression is evaluated as:
//(a = true) || ((b = true) && (c = true))
//Evaluation of (a = true):
//
//The assignment a = true sets a to true and evaluates to true.
//
//Since the left-hand side of the || operator is true, the || operator short-circuits, and the right-hand side ((b = true) && (c = true)) is not evaluated.
//
//Result:
//
//a is set to true.
//
//b and c remain unchanged (false).
//
//Step 2: Print the Values of a, b, and c
//
//The values of a, b, and c are:
//
//a = true
//
//b = false
//c = false
//The System.out.print statement outputs:
//true, false, false