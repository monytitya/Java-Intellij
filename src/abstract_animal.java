abstract class Animal {
    abstract  void makeSound();
    void sleep()
    {
        System.out.println("Zzzzz.....");
    }}
class dog extends Animal {
    void makeSound()
    {
        System.out.println("Dog wosh!!....");
    }}
class cat extends Animal {
    void makeSound()
    {
        System.out.println("meow meow....");
    }}
public class abstract_animal {
    public static void main(String[] args)
    {
        Animal dog = new dog();
        Animal cat = new cat();

        dog.makeSound();
        dog.sleep();

        cat.makeSound();
        cat.sleep();
    }
}
