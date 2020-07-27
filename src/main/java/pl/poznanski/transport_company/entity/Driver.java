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
    public void addVehicle(Driver driver, Vehicle vehicle){
      driver.setVehicle(vehicle);
    }

}