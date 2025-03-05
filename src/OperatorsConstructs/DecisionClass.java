package OperatorsConstructs;

public class DecisionClass {
    public static void main(String[] args) {
        int a = 1;                // 'a' is initialized to 1
        int[] ia = new int[10];   // An integer array 'ia' of size 10 is created
        int b = ia[a];            // 'b' is assigned the value at index 1 of 'ia'
        int c = b + a;            // 'c' is calculated as 'b + a'
        System.out.println(b = c); // 'b' is assigned 'c', then printed

    }
}

// 1

//Declare and Initialize Array
//int[] ia = new int[10];
//This creates an integer array ia of size 10.
//By default, all elements of an int array in Java are initialized to 0.
//Step 3: Assign b
//int b = ia[a];
//ia[a] means accessing ia[1].
//Since the array is initialized to 0, ia[1] is 0.
//Thus, b = 0.
//Step 4: Calculate c
//int c = b + a;
//b = 0, a = 1
//c = 0 + 1 = 1
//Step 5: Assign b = c and Print
//System.out.println(b = c);
//b = c means b is assigned the value of c, which is 1.
//System.out.println(1); prints:

//1