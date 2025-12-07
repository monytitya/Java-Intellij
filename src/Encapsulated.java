class Student {
    private String name;
    private int age;
    private String studentId;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }
    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String number) {
        this.studentId = number;   // FIXED
    }
}
// Super class
public class Encapsulated {
    public static void main(String[] args) {
        Student student = new Student();   // FIXED

        student.setName("Tityamony");
        student.setAge(21);
        student.setStudentId("20231151");

        // Output
        System.out.println("Student name: " + student.getName());
        System.out.println("Student age: " + student.getAge());
        System.out.println("Student id: " + student.getStudentId());


    }
}
