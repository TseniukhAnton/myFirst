package nested;

public class Main {
    public static void main(String[] args) {
        //Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle.Door();
        Vehicle.print();
        Vehicle.Wheel.print();
        door.print();

        Calculator calculate = new Calculator();
        double a = calculate.add(5, 5);
        double b = calculate.sub(5, 5);
        double c = calculate.mul(5, 5);
        double d = calculate.div(5, 5);
        System.out.println(calculate.add(5, 5));
        System.out.println(calculate.sub(15, 5));
        System.out.println(calculate.mul(2, 5));
        System.out.println(calculate.div(50, 5));

        System.out.println("Addition : " + a + "\n" + "Subtraction : " + b + "\n" + "Multiplication : " + c + "\n" + "Division : " + d);
    }
}
