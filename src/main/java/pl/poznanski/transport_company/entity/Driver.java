package pl.poznanski.transport_company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;


  public @Data class  Driver extends Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    private String name;

    private int age;

    private String driverCompanyName;

    private Vehicle vehicle;

    public Driver(){
    }

    public Driver(String name, int age){
        this.name=name;
        this.age=age;
    };
    //Test
    public void addVehicle(Driver driver, Vehicle vehicle){
      driver.setVehicle(vehicle);
    }

    //test
    public int checkDriverAge(Driver driver) throws ArithmeticException{
      if(driver.getAge()<18||driver.getAge()>65){
        throw new ArithmeticException ("Driver has not enought years old or is too older");
      }
      return driver.getAge();
    }

    //test
    public void checkDriverQuality(Driver driver){
      try {
        driver.checkDriverAge(driver);
      }
      catch (ArithmeticException ex){
        System.out.println("Check driver age!");
        System.out.println(ex.getCause());
      }
      finally {
        System.out.println("Driver Age" + driver.getAge());
      }
    }
}