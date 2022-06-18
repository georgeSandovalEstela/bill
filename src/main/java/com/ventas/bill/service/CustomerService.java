package com.ventas.bill.service;

import com.ventas.bill.domain.Customer;
import com.ventas.bill.dto.request.CustomerRequest;
import com.ventas.bill.dto.request.update.CustomerUpdateRequest;

import java.util.List;

public interface CustomerService {
    List<Customer> listCustomer()throws Exception;

    Customer save(CustomerRequest customerRequest)throws Exception;

    Customer update(CustomerUpdateRequest customerUpdateRequest)throws Exception;

    Customer delete(Long id)throws Exception;

    Customer findById(Long id)throws Exception;
}
