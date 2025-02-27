package JavaDataTypes;

class Student{
    private String name, rollNumber;

    public Student(String name, String rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    //valid setter and getter for name and rollNumber follow

    public void grade() {
    }

}
public class TestClassCollection {
    public static void main (String args[]){
             Student s = new Student("Vaishali", "930012");
             s.grade();
        System.out.println(s.getName());
            s = null;
             s = new Student("Vaishali", "930012");
              s.grade();
            System.out.println(s.getName());
             s = null;
    }
}

//line 6