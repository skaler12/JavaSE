package pl.poznanski.transport_company.entity;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {

    @Test
    void addDriverList() {
        Company company = new Company();
        Driver driver = new Driver();
        Assert.assertEquals(getExampleDriverList(),company.addDriverList(company,driver));
    }

    public static List<Driver> getExampleDriverList(){
        List<Driver> driverList = new LinkedList<>(){};
        Driver driver = new Driver();
        driverList.add(driver);
        Company company = new Company();
        company.setDriverList(driverList);
        return company.getDriverList();
    }
}