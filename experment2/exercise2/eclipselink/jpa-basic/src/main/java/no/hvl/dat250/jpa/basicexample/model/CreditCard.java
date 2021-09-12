package no.hvl.dat250.jpa.basicexample.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

@Entity
@Data
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int number;
    private float balance;
    private int limit;

    @ManyToOne
    private PinCode pinCode;

    @ManyToOne
    private Person person;

    @ManyToOne
    private Bank bank;
}
