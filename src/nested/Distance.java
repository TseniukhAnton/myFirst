package nested;

public class Distance {
    static double distance;
    static public void print(){

    }

    static class Converter{
         public double metertokmeter(double meter){
             return meter/1000;
         }

        public double kmetertomile(double km){
            return km * 1.6;
        }
    }

    public static void main(String[] args) {
        Distance.Converter convert = new Converter();
        System.out.println(convert.kmetertomile(500.0));
        System.out.println(convert.metertokmeter(200000.0));
    }
}
