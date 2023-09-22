
package src.main.java.Activities;
public class Activity1 {
    public static void main(String[] args) {
        Car TataTiago = new Car();
        TataTiago.Color = "White";
        TataTiago.transmission = "Automative";
        TataTiago.make = 2023;
        TataTiago.displayCharacteristics();
        TataTiago.accelerate();
        TataTiago.brake();

    }

    public static class Car {
        String Color;
            String transmission;
            int make;
            int tyres;
            int doors;

            Car()  //Default Constructor
            {
                tyres = 4;
                doors = 4;

            }

            public void displayCharacteristics()
            {

                System.out.println("Color of the Car is: " + Color);
                System.out.println("Transmission of the Car is: " + transmission);
                System.out.println("The Year of Making of the Car is: " + make);
                System.out.println("Number of tyres of the Car is: " + tyres);
                System.out.println("Number of doors of the Car is:" + doors);

            }

            public void accelerate()
            {

                System.out.println("Car is Moving Forward");
            }

            public void brake()
            {
                System.out.println("Car has stopped");
            }


        }
}