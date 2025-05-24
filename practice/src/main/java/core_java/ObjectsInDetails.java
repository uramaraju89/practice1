package core_java;
class Student{
    int studentId = 101;
    String sname = "Ramu";
    int studentClass = 10;
    String schoolName = "ZP High School";
    public void getStudentData(){
        System.out.println("Student data given Below as follows");
        System.out.println("Student id "+ studentId);
        System.out.println("Student name "+sname);
        System.out.println("Student Class is "+studentClass);
        System.out.println("Student School Name is "+ schoolName);
    }

    public Student() {
    }

    public Student(int studentId, String sname, int studentClass, String schoolName) {
        this.studentId = studentId;
        this.sname = sname;
        this.studentClass = studentClass;
        this.schoolName = schoolName;
    }
}

public class ObjectsInDetails {
    public static void main(String[] args) {

        Student s = new Student();
        s.getStudentData();
        Student s1 = new Student(2,"siva",9,"Narayana");
        s1.getStudentData();


    }

}
