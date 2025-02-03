public class Vehicle {
    String brand;
    int year;
    void startEngine(){
        System.out.println("engine good");
    }
}
class Car extends Vehicle{
    String fuelType;
    void startEngine(){
        System.out.println("Car engine starts");

    }
    void drive(){
        System.out.println("Car is driving");
    }
}
class Truck extends Vehicle{
    int loadCapacity;
    void startEngine(){
     System.out.println("Truck engine starts");

    }
    void haul(){
        System.out.println("Truck is hauing");
    }
}
public class Ve{
public static void main(String args[]){
 Truck obj=new Truck();
 System.out.println(obj.brand);
 System.out.println(obj.year);
 System.out.println(obj.loadCapacity);
 obj.startEngine();
 obj.haul();
 
  }

}