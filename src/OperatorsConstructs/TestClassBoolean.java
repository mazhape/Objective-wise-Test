package OperatorsConstructs;

public class TestClassBoolean {

    //define tester method here
    public boolean tester(){
        return false;
    }

    public static void main(String[] args) throws Exception {
        TestClassBoolean tc = new TestClassBoolean();
        while(tc.tester()){
            System.out.println("running...");
        }
    }
}

// public boolean tester(){
//        return false;
//    }
//   public Boolean tester(){
//        return false;
//    }