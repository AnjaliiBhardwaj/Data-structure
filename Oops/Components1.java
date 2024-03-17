//inheritance 
import java.util.*;
class Components1{
    static class Vehicle{
        String model;
        int year;
        String color;
    }
    static class Car extends Vehicle{
        boolean music;
    }
    static class Bicycle extends Vehicle{
        boolean gear;
    }
    public static void main(String[] args){
        // Vehicle v1=new Vehicle();
        // v1.model="Maruti";
        // v1.year=2002;
        // v1.color="white";

        Car c1=new Car();
        c1.music=true;

        System.out.print(c1.music);
    }
}