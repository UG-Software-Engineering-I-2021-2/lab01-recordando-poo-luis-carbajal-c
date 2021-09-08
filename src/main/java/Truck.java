class Truck extends Vehicle {

    public Truck(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 1.6;
    }


    public void supplying(double fuel) {
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            System.out.println("Camíon  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
            return;
        }
        this.quantityOfFuel = this.quantityOfFuel + (fuel * 0.95);
        System.out.printf("La cantidad de combustible del Camion es: %.2f", this.quantityOfFuel);

    }

    public void Trip(float kilometers) {
        if(this.useByKm * kilometers > this.quantityOfFuel){
            System.out.println("Camión necesita reabastecimiento de combustible");
            return;
        }

        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        System.out.printf("Camion viajó %.2f  km y aún tiene %.2f   de combustible", kilometers, this.quantityOfFuel);
    }
}
