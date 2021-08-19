package objects;

public class Main {
    public static void main(String[] args) {
        Device device = new Device("Samsung",120,"AB1234567CD");
        Monitor monitor = new Monitor("Samsung",120f,"AB1234567CD",1280,1024);

        System.out.println(device.toString());
        System.out.println(monitor.toString());

        Monitor m1 = new Monitor("Samsung",120f,"AB1234567CD",1280,1024);
        Monitor m2 = new Monitor("VC",120f,"AB1234567CD",1280,1024);

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.equals(m2));
    }
}
