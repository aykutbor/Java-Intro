package org.example;

import org.example.abstracts.BaseCustomerManager;
import org.example.adapters.MernisServiceAdapter;
import org.example.concretes.KahveDunyasiCustomerServiceImpl;
import org.example.concretes.NeroCustomerServiceImpl;
import org.example.entities.Customer;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        BaseCustomerManager baseCustomerManager = new KahveDunyasiCustomerServiceImpl(new MernisServiceAdapter());
        Customer customer = new Customer();
        customer.setFirstName("AYKUT");
        customer.setLastName("BÖR");
        customer.setDateOfBirth(new Date(1999,2,10));
        customer.setNationalityId("11111111111");
        baseCustomerManager.save(customer);
    }
}