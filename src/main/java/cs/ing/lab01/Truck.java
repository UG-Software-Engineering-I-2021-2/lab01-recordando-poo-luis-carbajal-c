package cs.ing.lab01;

class Truck extends Vehicle {

    public Truck(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 1.6;
    }

    @Override
    public String refuel(double fuel) {
        String res;
        if(this.quantityOfFuel + fuel > this.capacityOfFuel) {
            res = "Camion no se puede reabastecer el tanque, sobrepasa la capacidad";
            return res;
        }
        this.quantityOfFuel += fuel * 0.95;
        res = "La cantidad de combustible del Camion es: " + df.format(this.quantityOfFuel);
        return res;
    }

    @Override
    public String trip(float kilometers) {
        return tripUtil(kilometers, "Camion");
    }
}
