package app;

public class Main {

    private static final double CONV_TO_K =1.609;
    private static final double CONV_TO_M =0.62;

    public static void main(String[] args) {

        System.out.println("Converter distance");

        double miles = 8;
        double kilometers = 18;
        double km = milesToKilometers(miles);
        double mi = kilometersToMiles(kilometers);



        System.out.println(miles + " миль = " + km + " км");
        System.out.println(kilometers + " км = " + mi + " миль");


    }

    private static double milesToKilometers(double miles) {
        return miles * CONV_TO_K;
    }

    public static double kilometersToMiles(double kilometers) {
        return kilometers * CONV_TO_M;
    }


}
