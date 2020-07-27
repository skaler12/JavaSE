package pl.poznanski.transport_company.entity;


import com.sun.xml.bind.v2.runtime.output.SAXOutput;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.bcel.ExceptionRange;
import org.springframework.http.converter.json.GsonBuilderUtils;
import pl.poznanski.transport_company.dto.VehicleSetup;

import java.io.IOException;

@NoArgsConstructor
public @Data class Vehicle implements VehicleSetup {

    private int vehicleId;

    private String vehicleName;

    private double fuelLevel;

    private float maxWeight;

    private boolean occupied;

    private boolean engineStatus = false;

    public Vehicle(String vehicleName, double fuelLevel, float maxWeight, boolean occupied) {
        this.vehicleName = vehicleName;
        this.fuelLevel = fuelLevel;
        this.maxWeight=maxWeight;
        this.occupied = occupied;
    }

    public double getFuelLevel(double fuelLevel){
        return fuelLevel;
    }

    @Override
    public void startEngine(Vehicle vehicle) throws IOException {
        if(vehicle.getFuelLevel()>1){
            vehicle.setFuelLevel(vehicle.getFuelLevel()-1);
            vehicle.engineStatus=true;
        }
        else throw new IOException ("Za mało paliwa by uruchomic silnik");
    }

    @Override
    public String stopEngine(Vehicle vehicle) {
        return "Silnik został wyłączony";
    }

    @Override
    public boolean ifEngineRun(Vehicle vehicle) {
        if(vehicle.engineStatus==true){
            return true;
        }
        return false;
    }
}
