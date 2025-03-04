package JavaDataTypes;

public class TestGarbageCollection {
    void test(){
        MyClass obj = new MyClass();
        obj.name = "jack";
        // 1 insert code here
    }
}
//In MyClass.java
public class MyClass{
    int value;
    String name;
}

//obj = null;
//This will make the object eligible for GC because there are no other references to it.