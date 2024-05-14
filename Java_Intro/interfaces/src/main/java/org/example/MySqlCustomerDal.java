package org.example;

public class MySqlCustomerDal implements ICustomerDal{
    @Override
    public void Add() {
        System.out.println("My Sql added");
    }
}
