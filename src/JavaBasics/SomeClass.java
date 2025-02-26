package JavaBasics;

public class SomeClass {
    public static void main( String args[ ] ){
        if (args.length == 0 ){
            System.out.println("no arguments") ;
        }
        else{
            System.out.println( args.length + " arguments") ;
        }
    }
}
//The program will print no arguments when called with zero arguments and 1 arguments  when called with one argument