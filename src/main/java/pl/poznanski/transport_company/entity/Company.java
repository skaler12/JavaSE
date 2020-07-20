package pl.poznanski.transport_company.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
 public @Data class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    private String companyName;

    private Date foundatonData;

    private List<Driver>driverList;

    public Company(String companyName, Date foundatonData, List<Driver> driverList) {
        this.companyName = companyName;
        this.foundatonData = foundatonData;
        this.driverList = driverList;
    }
}
