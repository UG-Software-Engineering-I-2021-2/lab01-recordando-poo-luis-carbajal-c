package luis.lab01;

import java.util.logging.Logger;
import java.text.DecimalFormat;

public class Vehicle {
    double quantityOfFuel = 0.0;
    double capacityOfFuel = 0;
    double useByKm = 0;

    protected static final Logger logger = Logger.getLogger(Vehicle.class.getName());
    protected static DecimalFormat df = new DecimalFormat("0.00");

    public Vehicle(double quantityOfFuel, double capacityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
        this.capacityOfFuel = capacityOfFuel;
    }

    public double getQuantityOfFuel() {
        return quantityOfFuel;
    }

    public void setQuantityOfFuel(double quantityOfFuel) {
        this.quantityOfFuel = quantityOfFuel;
    }

    public double getCapacityOfFuel() {
        return capacityOfFuel;
    }

    public void setCapacityOfFuel(double capacityOfFuel) {
        this.capacityOfFuel = capacityOfFuel;
    }

    public double getUseByKm() {
        return useByKm;
    }

    public void setUseByKm(double useByKm) {
        this.useByKm = useByKm;
    }

    public void supplying(double fuel) {
        // Method for refueling. Implemented differently on each vehicle.
    }

    public void trip(float kilometers) {
        // Method for making a trip. Implemented differently on each vehicle.
    }

    public void tripUtil(float kilometers, String vehicle) {
        String res;
        if(this.useByKm * kilometers > this.quantityOfFuel) {
            res = vehicle + " necesita reabastecimiento de combustible";
            logger.info(res);
            return;
        }

        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        res = vehicle + " viajó " + df.format(kilometers) + " km y aún tiene " + df.format(this.quantityOfFuel) + " de combustible";
        logger.info(res);
    }
}
