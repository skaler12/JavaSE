package pl.poznanski.transport_company.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import pl.poznanski.transport_company.dto.OrderType;

import java.io.Serializable;

@NoArgsConstructor
public @Data class Order  implements Serializable {


    private static final long serialVersionUID = -4933318192331849005L;

    private int orderId;

    private double weight;

    private double fuelNeeded;

    private OrderType origin;

    public Order(double weight, double fuelNeeded) {
        this.weight = weight;
        this.fuelNeeded = fuelNeeded;
    }
}
