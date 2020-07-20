package pl.poznanski.transport_company;


import pl.poznanski.transport_company.entity.Company;
import pl.poznanski.transport_company.entity.Driver;

import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Company company = new Company();

        System.out.println(company.toString());

        System.out.println();

        Driver driver = new Driver();
        System.out.println(driver.toString());
        driver.setAge(22);
        driver.setName("Grzegorz");
        System.out.println(driver.toString());

        company.getDriverList().size();
    }
}
