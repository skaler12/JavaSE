package pl.poznanski.transport_company.entity;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@EqualsAndHashCode
@ToString
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter private int companyId;


    @Getter @Setter private String companyName;

    @Getter @Setter private Date data;

    public Company(){

    };
    public Company(String companyName, Date data) {
        this.companyName = companyName;
        this.data = data;
    };
}
