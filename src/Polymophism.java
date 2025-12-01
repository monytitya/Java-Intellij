public class Polymophism {
    //Superclass {Parent}
    static class Person
    {
        void  displayInfo() {
            System.out.println("This is a person...");
        }
    }

    //Subclass{child}
    static class Student extends  Person
    {
        @Override
        void displayInfo() {
            System.out.println("This is a student...");
        }
    }



    //Another Subclass{child}
    static class Teacher extends Person
    {
        @Override
        void displayInfo(){
            System.out.println("This is a teacher");
        }
    }

    //Main class
    static public class Polymorphism
    {
        public static void main(String[] args)
        {
            Person person1 = new Person();
            Person person2 = new Student();
            Person person3 = new Teacher();

            person1.displayInfo();
            person2.displayInfo();
            person3.displayInfo();
        }
    }

}
