package OperatorsConstructs;

public class TestClassbool {
    public static void main(String args[ ] ){
        int i = 0 ;
        boolean bool1 = true ;
        boolean bool2 = false;
        boolean bool  = false;
        bool = ( bool2 &  method1(i++) ); //1
        bool = ( bool2 && method1(i++) ); //2
        bool = ( bool1 |  method1(i++) ); //3
        bool = ( bool1 || method1(i++) ); //4
        System.out.println(i);
    }
    public static boolean method1(int i){
        return i>0 ? true : false;
    }
}

//2


//Line 1: bool = (bool2 & method1(i++));
//
//bool2 is false.
//
//method1(i++) is called. Since i is 0 before the increment, method1(0) returns false.
//
//i is incremented to 1 after the method call.
//
//bool2 & method1(i++) evaluates to false & false, which is false.
//
//bool is set to false.
//
//Line 2: bool = (bool2 && method1(i++));
//
//bool2 is false.
//
//Since bool2 is false, the short-circuit && operator does not evaluate the right-hand side (method1(i++)).
//
//i remains 1 because method1(i++) is not called.
//
//bool2 && method1(i++) evaluates to false && (not evaluated), which is false.
//
//bool is set to false.
//
//Line 3: bool = (bool1 | method1(i++));
//
//bool1 is true.
//
//method1(i++) is called. Since i is 1 before the increment, method1(1) returns true.
//
//i is incremented to 2 after the method call.
//
//bool1 | method1(i++) evaluates to true | true, which is true.
//
//bool is set to true.
//
//Line 4: bool = (bool1 || method1(i++));
//
//bool1 is true.
//
//Since bool1 is true, the short-circuit || operator does not evaluate the right-hand side (method1(i++)).
//
//i remains 2 because method1(i++) is not called.
//
//bool1 || method1(i++) evaluates to true || (not evaluated), which is true.
//
//bool is set to true.
//
//Final Output:
//
//The value of i is printed.
//
//i was incremented to 1 in Line 1, to 2 in Line 3, and remained 2 in Lines 2 and 4.
//
//Therefore, the final value of i is 2.

//The & and | operators are non-short-circuiting, meaning both sides of the expression are always evaluated.
//The && and || operators are short-circuiting, meaning the right-hand side is only evaluated if necessary.
//The i++ operation increments i after the current value is used in the expression.
