package JavaDataTypes;

public class Noobs {
    public Noobs() {
        try {
            throw new MyException(); // Creates a MyException object
        } catch (Exception e) {
            // Catches the exception, but no further action is taken
        }
    }

    public static void main(String[] args) {
        Noobs a = new Noobs(); // Creates a Noobs object and a MyException object
        Noobs b = new Noobs(); // Creates another Noobs object and another MyException object
        Noobs c = a; // Does not create a new object; c references the same object as a
    }
}

class MyException extends Exception {
    // MyException is a custom exception class
}

//4