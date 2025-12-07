public class Student1 {
    String name;
    int age;
    String studentID;

    //Constructor
    public Student1(String name, int age, String studentID)
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
        Student1 student1 = new Student1("KIKI", 20,"2010");
        Student1 student2 = new Student1("LOLO", 19, "2020");
        Student1 student3 = new Student1("LUUU", 30, "2040");
        Student1 student4 = new Student1("LILI", 19, "2050");
//        Show information
        student1.displayInfo();
        student2.displayInfo();
        student3.displayInfo();
        student4.displayInfo();
    }
}
