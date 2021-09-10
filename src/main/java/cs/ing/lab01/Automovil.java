package cs.ing.lab01;

class Automovil extends Vehicle {

    public Automovil(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 0.9;
    }

    @Override
    public String refuel(double fuel) {
        String res;
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            res = "Automovil no se puede reabastecer el tanque, sobrepasa la capacidad";
            return res;
        }
        this.quantityOfFuel += fuel;
        res = "La cantidad de combustible del Automovil es: " + df.format(this.quantityOfFuel);
        return res;
    }

    @Override
    public String trip(float kilometers) {
        return tripUtil(kilometers, "Automovil");
    }
}
