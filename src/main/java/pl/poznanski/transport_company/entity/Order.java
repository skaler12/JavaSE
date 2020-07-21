package pl.poznanski.transport_company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public @Data class Order {

    private int orderId;

    private double weight;

    private double fuelNeeded;

    public Order(double weight, double fuelNeeded) {
        this.weight = weight;
        this.fuelNeeded = fuelNeeded;
    }
}
