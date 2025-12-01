abstract class Vehicle {
    abstract void start();
    abstract void stop();
    void  fuelType()
    {
        System.out.println("Uses pertol or diesel");
    }
}
class Car extends Vehicle {
    @Override
    void  start()
    {
        System.out.println("Car is starting with keys");
    }
    @Override
    void stop()
    {
        System.out.println("Car is stopping with keys");
    }
}
class Bike extends Vehicle {
    @Override
    void  start()
    {
        System.out.println("Car is starting with button");
    }
    @Override
    void stop()
    {
        System.out.println("Car is stopping with Brakes");
    }
}
public class abstraclass {
    public static void main(String[] args)
    {
        Vehicle  mycar = new Car();
        mycar.start();
        mycar.stop();
        mycar.fuelType();
        System.out.println();

        Vehicle myBike = new Bike();
        myBike.start();
        myBike.stop();
        myBike.fuelType();


    }

}
