package app;

public class Main {

    private static final double CONV_TO_K =1.609;

    public static void main(String[] args) {

        System.out.println("Converter distance");

        double miles = 8;
        double km = milesToKilometers(miles);

        System.out.println(miles + " миль = " + km + " км");

    }

    private static double milesToKilometers(double miles) {
        return miles * CONV_TO_K;
    }

}
