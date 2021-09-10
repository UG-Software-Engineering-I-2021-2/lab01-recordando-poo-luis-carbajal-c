package cs.ing.lab01;

import java.text.DecimalFormat;

public class Vehicle {
    double quantityOfFuel;
    double capacityOfFuel;
    double useByKm = 0;

    protected static DecimalFormat df = new DecimalFormat("0.00");

    public Vehicle(double quantityOfFuel, double capacityOfFuel, double useByKm) {
        this.quantityOfFuel = quantityOfFuel;
        this.capacityOfFuel = capacityOfFuel;
        this.useByKm = useByKm;
    }

    public Vehicle(double quantityOfFuel, double capacityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
        this.capacityOfFuel = capacityOfFuel;
    }

    public String refuel(double fuel) {
        // Method for refueling. Implemented differently on each vehicle.
        String res;
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            res = "Vehiculo no se puede reabastecer el tanque, sobrepasa la capacidad";
            return res;
        }
        this.quantityOfFuel += fuel;
        res = "La cantidad de combustible del Vehiculo es: " + df.format(this.quantityOfFuel);
        return res;
    }

    public String trip(float kilometers) {
        // Method for making a trip. Implemented differently on each vehicle.
        return tripUtil(kilometers, "Vehiculo");
    }

    public String tripUtil(float kilometers, String vehicle) {
        String res;
        if(this.useByKm * kilometers > this.quantityOfFuel) {
            res = vehicle + " necesita reabastecimiento de combustible";
            return res;
        }

        this.quantityOfFuel -= this.useByKm * kilometers;
        res = vehicle + " viajo " + df.format(kilometers) + " km y aun tiene " + df.format(this.quantityOfFuel) + " de combustible";
        return res;
    }
}
