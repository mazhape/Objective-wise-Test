package OperatorsConstructs;

public class TestClassOb {
    public static void main(String[] args){
        Object obj1 = new Object();  // Create a new Object instance
        Object obj2 = obj1;          // obj2 now refers to the same object as obj1

        if( obj1.equals(obj2) )
            System.out.println("true");
        else
            System.out.println("false");
    }
}

//true

//Object Creation
//
//obj1 is assigned a new Object instance.
//obj2 is assigned the same reference as obj1, meaning both refer to the same object in memory.
//Equality Check (equals method)
//
//The equals method in Object (default implementation) checks reference equality using ==.
//Since obj1 and obj2 refer to the same object, obj1.equals(obj2) returns true.