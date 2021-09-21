package no.hvl.dat250.jpa.basicexample;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import no.hvl.dat250.jpa.basicexample.model.Address;
import no.hvl.dat250.jpa.basicexample.model.Bank;
import no.hvl.dat250.jpa.basicexample.model.CreditCard;
import no.hvl.dat250.jpa.basicexample.model.Person;
import no.hvl.dat250.jpa.basicexample.model.PinCode;

public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "todos";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select name from Person");
        List<Person> personList = q.getResultList();
        for (Person person : personList) {
            System.out.println(person);
        }
        System.out.println("Size: " + personList.size());

        //persist the data
        em.getTransaction().begin();
        Address address = new Address();
        Bank bank = new Bank();
        CreditCard creditCard1 = new CreditCard();
        CreditCard creditCard2 = new CreditCard();
        Person person = new Person();
        PinCode pinCode = new PinCode();
        person.setName("Max Mustermann");
        address.setNumber(28);
        address.setStreet("Inndalsveien");
        person.getAddresses().add(address);
        address.getPersons().add(person);
        bank.setName("Pengebank");
        creditCard1.setNumber(123);
        creditCard1.setBalance(1);
        creditCard1.setLimit(2000);
        creditCard2.setNumber(12345);
        creditCard2.setBalance(5000);
        creditCard2.setLimit(10000);
        creditCard1.setPerson(person);
        creditCard2.setPerson(person);
        creditCard1.setBank(bank);
        creditCard2.setBank(bank);
        pinCode.setPinCode(123);
        pinCode.setCount(1);
        creditCard1.setPinCode(pinCode);
        creditCard2.setPinCode(pinCode);






    }
}
