package org.example.abstracts;

import org.example.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService {
    @Override
    public void save(Customer customer) throws Exception {

        System.out.println("Save to Database : " + customer.getFirstName());
    }

    //public abstract void save(Customer customer) throws Exception;
}
