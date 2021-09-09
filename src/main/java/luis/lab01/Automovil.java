package luis.lab01;

class Automovil extends Vehicle {

    public Automovil(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 0.9;
    }

    @Override
    public void supplying(double fuel) {
        String res;
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            res = "Automovil no se puede reabastecer el tanque, sobrepasa la capacidad";
            logger.info(res);
            return;
        }
        this.quantityOfFuel = this.quantityOfFuel + fuel;
        res = "La cantidad de combustible del Automovil es: " + df.format(this.quantityOfFuel);
        logger.info(res);
    }

    @Override
    public void trip(float kilometers) {
        tripUtil(kilometers, "Automovil");
    }
}
