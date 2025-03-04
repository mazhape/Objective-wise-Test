package JavaDataTypes;

class MyClasss { } // Definition of MyClass

public class TestClassGarbages {
    MyClass getMyClassObject() {
        MyClass mc = new MyClass(); // 1: Creates a MyClass object
        return mc; // 2: Returns the MyClass object
    }

    public static void main(String[] args) {
        TestClassGarbages tc = new TestClassGarbages(); // 3: Creates a TestClassGarbages object
        MyClass x = tc.getMyClassObject(); // 4: Calls getMyClassObject, which creates and returns a MyClass object
        System.out.println("got myclass object"); // 5: Prints a message
        x = new MyClass(); // 6: Creates a new MyClass object and assigns it to x
        System.out.println("done"); // 7: Prints another message
    }
}

//6
//At line 6, x starts pointing to a new MyClassObject and no reference to the original MyClass object is left