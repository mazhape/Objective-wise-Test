package JavaDataTypes;

public class NewClass {
    private Object o;
    void doSomething(Object s){  o = s;   }

    public static void main(String args[]){
        Object obj = new Object(); // 1
        NewClass tc = new NewClass(); //2
        tc.doSomething(obj); //3
        obj = new Object();    //4
        obj = null;    //5
        tc.doSomething(obj); //6
    }
}


//Line 6
//Before this line the object is being pointed to by at least one variable.