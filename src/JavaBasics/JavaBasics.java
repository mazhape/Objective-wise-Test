package JavaBasics;

class A{
    public A() { }
    public A(int i) {   System.out.println(i );    }
}
class JavaBasics {
    static A s1 = new A(1);   // Static variable initialization
    A a = new A(2);            // Instance variable initialization

    public static void main(String[] args) {
        JavaBasics b = new JavaBasics();          // Create an object of B
        A a = new A(3);         // Create an object of A
    }

    static A s2 = new A(4);    // Static variable initialization
}

//1 ,4, 2 ,3

//explanation
//Static variable s1 → Prints 1.
//Static variable s2 → Prints 4.
//Instance variable a → Prints 2.
//Object creation in main → Prints 3.