public class Inheritance {
//    Superclass(Parent)
    static class  Person{
        String name;
        int age;

        void  displayPersonalInfo(){
            System.out.println("Name :" + name);
            System.out.println("Age :" + age);
        }
}
//Subclass(child)
 static   class Student extends  Person{
        String studentId;

        void displayStudentInfo() {
            //Inherited method
            displayPersonalInfo();
            System.out.println("Student ID:" + studentId);
        }
   }
        public  static void main(String[] args){
            Student s1  = new Student();
            s1.name = "Tityamony";
            s1.age = 18;
            s1.studentId = "20231151";
            s1.displayStudentInfo();
        }
   }


