package OperatorsConstructs;

public class TestClassInt {
    public static XXX getSwitch(int x){
        return x - 20/x + x*x;
    }
    public static void main(String args[]){
        switch( getSwitch(10) ){
            case 1 :
            case 2 :
            case 3 :
            default : break;
        }
    }
}

//answer: int

//corrected code

//public class TestClass {
//   public static int getSwitch(int x){  // ✅ Return type is int
//      return x - 20/x + x*x;
//   }
//   public static void main(String args[]){
//       switch( getSwitch(10) ){  // ✅ switch works with int
//          case 1 :
//          case 2 :
//          case 3 :
//          default : break;
//       }
//   }
//}