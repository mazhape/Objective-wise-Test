package JavaDataTypes;

public class TestClassWrapper {
    public static Integer wiggler(Integer x){
        Integer y = x + 10;
        x++;
        System.out.println(x);
        return y;
    }

    public static void main(String[] args){
        Integer dataWrapper = new Integer(5);
        Integer value = wiggler(dataWrapper);
        System.out.println(dataWrapper+value);
    }
}

//6
//20
//ere’s what happens when the code runs:
//
//dataWrapper is passed to wiggler(), which prints 6 (the incremented value of x).
//The wiggler method returns 15 (y = 5 + 10).
//The main method prints dataWrapper + value, which is 5 + 15 = 20.