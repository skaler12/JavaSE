package pl.poznanski.transport_company.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * annotation with lombok library - avoidance boiler code :)
 */
@NoArgsConstructor
 public @Data class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    private String companyName;

    private Date foundatonData;

    private List<Driver>driverList = new LinkedList<>();

    public Company(String companyName, Date foundatonData, List<Driver> driverList) {
        this.companyName = companyName;
        this.foundatonData = foundatonData;
        this.driverList = driverList;
    }

    /**
     *Method which add new driver to driverlist in select company
     * @param company
     * @param driver
     * @return driverList concering company with param numer 1
     */
    //Dodawanie użytkownika czyli musi byc test
    public List<Driver>addDriverList (Company company, Driver driver){
        company.getDriverList().add(driver);
        driver.setDriverCompanyName(company.getCompanyName());
        return company.getDriverList();
    }
}
