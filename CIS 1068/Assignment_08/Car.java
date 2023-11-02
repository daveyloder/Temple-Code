package Assignment_08;

public class Car {
    // Class attribute
    String make;
    String model;
    int year;
    double MPG;
    double milesDriven;
    double fuelCapacity;
    double fuelRemaining;

    public Car(
            String iMake,
            String iModel,
            int iYear,
            double iMPG,
            double iMilesDriven,
            double iFuelCapacity,
            double iFuelRemaining) {

        make = iMake;
        model = iModel;
        year = iYear;
        MPG = iMPG;
        milesDriven = iMilesDriven;
        fuelCapacity = iFuelCapacity;
        if (fuelRemaining > fuelCapacity) {
            fuelCapacity = iFuelCapacity;
        } else {
            fuelRemaining = iFuelRemaining;
        }

    }

    public void fillTank(double g) {
        System.out.println("Fueling up!");
        if (g > fuelCapacity) {
            fuelRemaining = fuelCapacity;
        } else if (g + fuelRemaining <= fuelCapacity) {
            fuelRemaining += g;
        }
    }

    public void drive(double m) {
        double range = fuelRemaining * MPG;
        if (m >= range) {
            fuelRemaining = 0;
            milesDriven += range;
            System.out.println("You drove " + m + " miles");
            System.out.println("Your out of gas! Call AAA!\n");
        } else {
            fuelRemaining -= (m / MPG);
            milesDriven += m;
            System.out.println("You drove " + m + " miles\n");
        }

    }

    public String getFuelRemaining() {
        if ((fuelRemaining <= (fuelCapacity * .25)) && fuelRemaining != 0) {
            System.out.println("You should probably refill your tank soon, you are less than 25% fuel capacity.");
            return fuelRemaining + " gallons\n";
        } else if (fuelRemaining == 0) {
            System.out.println("Your out of gas, time to full up.");
            return fuelRemaining + " gallons\n";
        } else {
            return fuelRemaining + " gallons\n";
        }

    }

    public String getMilage() {
        return milesDriven + " miles\n";
    }

    public String toString() {
        return "Car Specs\nYear: " + year + "\nMake: " + make + "\nModel: " + model + "\nMPG: " + MPG + "\nOdometer: "
                + milesDriven + "\nFuel Capacity: "
                + fuelCapacity + " gallons \nFuel in Tank: " + fuelRemaining + " gallons\n";
    }
}