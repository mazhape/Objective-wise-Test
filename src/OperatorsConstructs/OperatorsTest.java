package OperatorsConstructs;

public class OperatorsTest {
    public static void main(String[] args) {
        int i = 1;          // Step 1: i is initialized to 1
        int j = i++;       // Step 2: j is assigned the value of i (1), then i is incremented to 2
        // Now: i = 2, j = 1

        // Step 3: Evaluate the if condition
        if ((i == ++j) | (i++ == j)) {
            i += j;       // If the condition is true, this line will execute
        }
        System.out.println(i); // Step 4: Print the value of i
    }
}


//answer: 5

//Step 3: if ((i == ++j) | (i++ == j))
//
//The condition consists of two parts, combined with the bitwise OR operator (|):
//
//(i == ++j)
//
//(i++ == j)
//
//Evaluate (i == ++j):
//
//++j increments j by 1 (pre-increment), so j becomes 2.
//
//Now, i == j is 2 == 2, which is true.
//
//Since the first part of the condition is true, the bitwise OR operator (|) ensures that the second part is also evaluated (unlike the short-circuit || operator).
//
//Evaluate (i++ == j):
//
//i++ uses the current value of i (2) for the comparison, then increments i by 1 (post-increment).
//i++ == j is 2 == 2, which is true.
//After the comparison, i becomes 3.
//The overall condition is true | true, which is true.

//Step 4: i += j;
//Since the condition is true, the block is executed.
//i += j is equivalent to i = i + j, so:
//i = 3 + 2 = 5