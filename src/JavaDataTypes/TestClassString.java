package JavaDataTypes;

public class TestClassString {
    public static void main(String args[ ] ){
        Object a, b, c ;
        a = new String("A");
        b = new String("B");
        c = a;
        a = b;
        System.out.println(""+c);
    }
}

//answer: A

//1️⃣ Understanding the Variable Assignments
//Object a, b, c; → Declares three Object type references.
//a = new String("A"); → a refers to a new String object "A".
//b = new String("B"); → b refers to a new String object "B".
//c = a; → c now also refers to the same "A" object as a.
//a = b; → a now refers to "B" instead of "A", but c still refers to "A".

//2️⃣ Memory Representation Before a = b;
//a --> "A"
//b --> "B"
//c --> "A" (same as a)

//After a = b;
//a --> "B"
//b --> "B"
//c --> "A"