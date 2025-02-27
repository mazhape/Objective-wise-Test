package JavaDataTypes;

public class SomeClass {
    String s1 = "green mile";   // 0
    public void generateReport( int n ){
        String local;   // 1
        if( n > 0 ) local = "good";   //2
        System.out.println( s1+" = " + local );   //3
    }
}

//Insert after line 2 : else local = "bad";
//Move line 1 and place it after line 0