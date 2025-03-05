package OperatorsConstructs;

class ScopeTest {
    static int x = 5;
    public static void main(String[] args){
        int x  = ( x=3 ) * 4;  // 1
        System.out.println(x);
    }
}

//it will print 12

//int x  = ( x=3 ) * 4;
//The right-hand side ( x=3 ) * 4 is evaluated first:
//Assignment x = 3
//Here, x refers to the local x that is being declared.
//Multiplication 3 * 4 = 12
//Now, x is assigned the result:
//int x = 12;