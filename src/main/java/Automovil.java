class Automovil extends Vehicle {

    public Automovil(double quantityOfFuel, double capacityOfFuel) {
        super(quantityOfFuel, capacityOfFuel);
        this.useByKm = 0.9;
    }

    public void supplying(double fuel) {
        if(this.quantityOfFuel +  fuel > this.capacityOfFuel) {
            System.out.println("Automovil  no  se  puede  reabastecer  el  tanque,  sobrepasa la capacidad");
            return;
        }
        this.quantityOfFuel = this.quantityOfFuel + fuel;
        System.out.printf("La cantidad de combustible del Automovil es: %.2f", this.quantityOfFuel);

    }

    public void Trip(float kilometers) {
        if(this.useByKm * kilometers > this.quantityOfFuel){
            System.out.println("Automovil necesita reabastecimiento de combustible");
            return;
        }

        this.quantityOfFuel = this.quantityOfFuel - this.useByKm * kilometers;
        System.out.printf("Automovil viajó %.2f  km y aún tiene %.2f   de combustible", kilometers, this.quantityOfFuel);
    }

}
