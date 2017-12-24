package com.emusicstore.Service;

import com.emusicstore.model.Customer;

import java.util.List;

/**
 * Created by grgbibek22 on 8/6/2017.
 */
public interface CustomerService {

    void addCustomer(Customer customer);

    Customer getCustomerById(int customerId);

    List<Customer> getAllCustomers();

    Customer getCustomerByUsername(String username);
}
