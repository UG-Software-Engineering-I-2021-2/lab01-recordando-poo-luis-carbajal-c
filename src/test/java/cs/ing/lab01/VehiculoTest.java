package cs.ing.lab01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VehiculoTest {
    // Main test
    @Test()
    public void TestMain() {
        Main program = new Main();
        program.main(null);
    }

    // Refueling tests
    @Test()
    public void TestRefuel01() {
        Vehicle v = new Truck(10, 10);
        Assert.assertEquals(v.refuel(5), "Camion no se puede reabastecer el tanque, sobrepasa la capacidad");
    }

    @Test()
    public void TestRefuel02() {
        Vehicle v = new Truck(3, 10);
        Assert.assertEquals(v.refuel(5), "La cantidad de combustible del Camion es: 7.75");
    }

    @Test()
    public void TestRefuel03() {
        Vehicle v = new Automovil(10, 10);
        Assert.assertEquals(v.refuel(5), "Automovil no se puede reabastecer el tanque, sobrepasa la capacidad");
    }

    @Test()
    public void TestRefuel04() {
        Vehicle v = new Automovil(3, 10);
        Assert.assertEquals(v.refuel(5), "La cantidad de combustible del Automovil es: 8.00");
    }

    @Test()
    public void TestRefuel05() {
        Vehicle v = new Vehicle(10, 10, 0.5);
        Assert.assertEquals(v.refuel(5), "Vehiculo no se puede reabastecer el tanque, sobrepasa la capacidad");
    }

    @Test()
    public void TestRefuel06() {
        Vehicle v = new Vehicle(3, 10, 0.5);
        Assert.assertEquals(v.refuel(5), "La cantidad de combustible del Vehiculo es: 8.00");
    }

    // Trip tests
    @Test()
    public void TestTrip01() {
        Vehicle v = new Truck(10, 100);
        Assert.assertEquals(v.trip(4), "Camion viajo 4.00 km y aun tiene 3.60 de combustible");
    }

    @Test()
    public void TestTrip02() {
        Vehicle v = new Truck(10, 100);
        Assert.assertEquals(v.trip(12), "Camion necesita reabastecimiento de combustible");
    }

    @Test()
    public void TestTrip03() {
        Vehicle v = new Automovil(10, 100);
        Assert.assertEquals(v.trip(4), "Automovil viajo 4.00 km y aun tiene 6.40 de combustible");
    }

    @Test()
    public void TestTrip04() {
        Vehicle v = new Automovil(10, 100);
        Assert.assertEquals(v.trip(12), "Automovil necesita reabastecimiento de combustible");
    }

    @Test()
    public void TestTrip05() {
        Vehicle v = new Vehicle(10, 100, 0.9);
        Assert.assertEquals(v.trip(4), "Vehiculo viajo 4.00 km y aun tiene 6.40 de combustible");
    }

    @Test()
    public void TestTrip06() {
        Vehicle v = new Vehicle(10, 100, 0.9);
        Assert.assertEquals(v.trip(12), "Vehiculo necesita reabastecimiento de combustible");
    }

    // Stress tests, info taken from TestNG documentation: https://testng.org/doc/documentation-main.html
    @Test(threadPoolSize = 80, invocationCount = 10,  timeOut = 1000)
    public void StressTest01() {
        Vehicle v = new Truck(10, 100);
        Assert.assertEquals(v.refuel(40), "La cantidad de combustible del Camion es: 48.00");
    }

    @Test(threadPoolSize = 80, invocationCount = 10,  timeOut = 1000)
    public void StressTest02() {
        Vehicle v = new Truck(80, 100);
        Assert.assertEquals(v.refuel(40), "Camion no se puede reabastecer el tanque, sobrepasa la capacidad");
    }
}
