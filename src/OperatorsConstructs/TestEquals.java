package OperatorsConstructs;

public class TestEquals {
    public static void main(String[] args){
        if (args[0].equals("open"))
            if (args[1].equals("someone"))
                System.out.println("Hello!");
            else System.out.println("Go away "+ args[1]);
    }
}

//It will end without exceptions and will print nothing

//Command Line Argument:
//
//The program is run with the command java Test closed.
//
//This means args[0] is "closed".
//
//There is no second argument provided, so args[1] does not exist.
//Behavior of the Program:
//
//The outer if condition checks if args[0].equals("open").
//
//Since args[0] is "closed", this condition evaluates to false.
//
//Because the outer if condition is false, the entire block inside it (including the inner if and else) is skipped.
//
//The program does nothing and terminates without printing anything.
//
//Potential Issues:
//
//If the program were run with only one argument (e.g., java Test open), it would throw an ArrayIndexOutOfBoundsException because args[1] does not exist.
//
//If the program were run with two arguments (e.g., java Test open someone), it would print "Hello!".
//
//If the program were run with java Test open stranger, it would print "Go away stranger".