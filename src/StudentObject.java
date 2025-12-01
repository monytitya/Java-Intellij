public class StudentObject {
    static class Student
    {
        String name = "Tityamony";
        void  sayhello () {
            System.out.println("Hi, I'm" + name);
        }

    }
    public  static  void main(String[] args)
    {
        Student Say = new Student();
        Say.sayhello();
    }
}
