public class Student {
    String name;
    int age;
    String studentID;

    //Constructor
    public Student(String name, int age, String studentID)
    {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
    }

    //The show information
    public void displayInfo()
    {
        System.out.println("Student Id:" + studentID);
        System.out.println("Student Age:" + age);
        System.out.println("student Name:" + name);
        System.out.println("||*****************************||");
    }

    //The main method show information on screen
    public static void main(String[] args)
    {
        Student student1 = new Student("KIKI", 20,"2010");
        Student student2 = new Student("LOLO", 19, "2020");
        Student student3 = new Student("LUUU", 30, "2040");
        Student student4 = new Student("LILI", 19, "2050");
//        Show information
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}
