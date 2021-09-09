package luis.lab01;

class Truck extends Vehicle {

    public Truck(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 1.6;
    }

    @Override
    public void supplying(double fuel) {
        String res;
        if(this.quantityOfFuel + fuel > this.capacityOfFuel) {
            res = "Camión  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad";
            logger.info(res);
            return;
        }
        this.quantityOfFuel = this.quantityOfFuel + (fuel * 0.95);
        res = "La cantidad de combustible del Camión es: " + df.format(this.quantityOfFuel);
        logger.info(res);
    }

    @Override
    public void trip(float kilometers) {
        tripUtil(kilometers, "Camión");
    }
}
