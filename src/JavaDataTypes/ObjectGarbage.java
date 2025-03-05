package JavaDataTypes;

public class ObjectGarbage {
    public static void main(String[] args) {
//        public Object getObject(Object a) {  // 0
//            Object b = new Object();  // XXX  (New Object Created)
//
//            Object c, d = new Object(); // 1  (New Object Created for d, c is uninitialized)
//            c = b;  // 2  (c now points to the same object as b)
//            b = a = null;  // 3 (b is set to null, a is set to null)
//
//            return c;  // 4 (Returning reference c)
//        }

    }
}

//Never in this method

//At line XXX:
//
//A new object is created and assigned to b.
//b holds the only reference to this object.
//At line 2:
//
//c = b; → Now both b and c refer to the same object.
//At line 3:
//
//b = null; → b no longer refers to the object.
//a = null; → a was never referencing our object, so no effect.
//But c still holds a reference to the object, so it is not yet eligible for garbage collection.
//At line 4:
//
//return c; → c is returned, meaning the caller still has a reference to the object.
//Since the object is being returned, it remains accessible.