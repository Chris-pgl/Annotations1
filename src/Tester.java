public class Tester {

    public static void main(String[] args) {

        @SuppressWarnings(value = "deprecated")
        Car c = new Car("Mercedes-Benz CLK 230 ",349.000);


        c.printDetails();


        c.getCarDetails();


    }
}
