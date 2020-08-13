package pl.poznanski.transport_company.entity;

import org.junit.Assert;


import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.Test;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.springframework.test.util.AssertionErrors;

public class VehicleTest {

    @Test
    public void startEngine() {
            Vehicle vehicle = new Vehicle();
            vehicle.setFuelLevel(2.0);
            Assert.assertTrue(true);
        }

    @Test
    public void testStopEngine() {
        Vehicle vehicle = new Vehicle();
        Assert.assertEquals("Silnik został wyłączony", vehicle.stopEngine(vehicle));
    }

     @Test(expected = ArithmeticException.class)
     public void carStatus() {
        Vehicle vehicle = new Vehicle();
        vehicle.setFuelLevel(-2.0);
         vehicle.carStatus(vehicle);
     }

     @Test
     public void ifEngineRun() throws IOException {
        Vehicle vehicle = new Vehicle();
        vehicle.setFuelLevel(20);
        vehicle.startEngine(vehicle);
        Assert.assertTrue(vehicle.ifEngineRun(vehicle));
     }
 }