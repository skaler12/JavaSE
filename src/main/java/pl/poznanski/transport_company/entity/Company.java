package pl.poznanski.transport_company.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@EqualsAndHashCode
@Getter
@Setter
@ToString
 public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int companyId;

    private String companyName;

    private Date data;

    public Company(){

    };
    public Company(String companyName, Date data) {
        this.companyName = companyName;
        this.data = data;
    };
}
