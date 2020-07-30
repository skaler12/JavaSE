package pl.poznanski.transport_company.service;

import lombok.Getter;
import pl.poznanski.transport_company.entity.Order;
import pl.poznanski.transport_company.entity.Vehicle;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//mapa
public class OrderAddVehicle {

    @Getter
    Map<Integer, Vehicle> mapOrder= new HashMap<Integer,Vehicle>();

    public void addVehicleToOrder(Vehicle vehicle,Order order){
        mapOrder.put(order.getOrderId(),vehicle);
        mapOrder.entrySet().stream()
                .forEach(e -> System.out.println(e.getKey() + ":" + e.getValue()));
    }

}

