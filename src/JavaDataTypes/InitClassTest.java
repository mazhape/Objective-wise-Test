package JavaDataTypes;

public class InitClassTest {
    public static void main(String args[ ] ){
        InitClassTest obj = new InitClassTest(5);
    }
    int m;
    static int i1 = 5;
    static int i2 ;
    int  j = 100;
    int x;
    public InitClassTest(int m){
        System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);
    }
    { j = 30; i2 = 40; }  // Instance Initializer
    static { i1++; }      // Static Initializer
}
//The code will compile without error and will print 6 40 0 30 5 when run.

//Initialization Order in This Code
//Static members initialize first:
//static int i1 = 5;
//static int i2; (default value is 0)
//static { i1++; } → Now i1 = 6
//Instance members initialize when an object is created:

//int j = 100; (default value is set)
//int x; (default value 0)
//{ j = 30; i2 = 40; } → Now j = 30, i2 = 40
//Constructor execution:
//System.out.println(i1 + "  " + i2 + "   " + x + "  " + j + "  " + m);