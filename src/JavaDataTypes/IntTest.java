package JavaDataTypes;

public class IntTest {
    public static void main(String[] args) {
        int i1 = 1, i2 = 2, i3 = 3;
        int i4 = i1 + (i2 = i3);
        System.out.println(i4);

    }
}


//true(4)

//1️⃣ Variable Initialization:
//i1 = 1
//i2 = 2
//i3 = 3
//2️⃣ Expression Evaluation:

//i4 = i1 + (i2 = i3);
//i2 = i3 assigns i3's value (3) to i2. Now, i2 = 3.
//The expression inside the parentheses evaluates to 3 (since i2 = 3).
//i1 + 3 → 1 + 3 evaluates to 4.