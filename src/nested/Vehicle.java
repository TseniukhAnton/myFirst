package nested;

public class Vehicle {
    static void print(){
        System.out.println("vehicle print");
    }

    static class Wheel{
         static void print(){
             System.out.println("wheel print");
        }
    }

    static class Door{
         void print(){
             System.out.println("door print");
        }
    }
}
