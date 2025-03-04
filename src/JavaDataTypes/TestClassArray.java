package JavaDataTypes;

import java.util.*;

public class TestClassArray {
    public static void main(String[] args) throws Exception {
        ArrayList<Double> al = new ArrayList<>();

        //INSERT CODE HERE
        System.out.println(al.indexOf(1.0));
        System.out.println(al.contains("string"));
    }
}
//System.out.println(al.indexOf(1.0));
//indexOf's accepts Object as a parameter. Although 1.0 is not an object, it will be boxed into a Double object.
        //System.out.println(al.contains("string"))