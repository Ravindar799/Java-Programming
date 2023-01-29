class Student {
    String name;
    String studentId;
    Student() {

    }
    Student(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    public void printName() {
        System.out.println(name);
    }

    public void printStudentId () {
        System.out.println(studentId);
    }  
}
 public class Main {
     public static void main (String arr[]) {
        Student s = new Student();
        s.name = "ravindar";
        s.studentId = "xyz";
       s.printName();
       s.printStudentId();
       Student s1 = new Student("rahul","zyx");
       s1.printName();
       s1.printStudentId();
       Student student1 = new Student("ravi","std1");
       Student student2 = new Student("ravi","std1");
       int hashValue1 = student1.hashCode();
       System.out.println("hashcode of student1 is:"+hashValue1);
       int hashValue2 = student2.hashCode();
       System.out.println("hashcode of student1 is:"+hashValue2);
       if(student1 == student2) {
         System.out.println("two objects are same");
        } 
        else  {
         System.out.println("two objects are not same");
        }
    }
}