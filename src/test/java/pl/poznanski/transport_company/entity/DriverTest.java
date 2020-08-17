package pl.poznanski.transport_company.entity;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.springframework.test.util.AssertionErrors;

import static org.junit.jupiter.api.Assertions.*;

class DriverTest {

    @Test
   public void addVehicle() {
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleName("FORD");
        Driver driver = new Driver();
        driver.setName("John");
        driver.addVehicle(driver,vehicle);
        Assert.assertEquals(vehicle,driver.getVehicle());
    }

    @Test
    void checkDriverAge() throws ArithmeticException {
        try {
            Driver driver = new Driver();
            driver.setAge(17);
            driver.checkDriverAge(driver);
            fail("Exception not throw!");
        }
        catch (ArithmeticException exception) {
            assertEquals("Driver has not enought years old or is too older",exception.getMessage());
        }
    }
    //void method
    @Test
    void checkDriverQuality() {

    }
}