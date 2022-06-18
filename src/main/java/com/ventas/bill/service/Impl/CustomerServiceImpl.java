package com.ventas.bill.service.Impl;

import com.ventas.bill.domain.Customer;
import com.ventas.bill.dto.request.CustomerRequest;
import com.ventas.bill.dto.request.update.CustomerUpdateRequest;
import com.ventas.bill.repository.CustomerRepository;
import com.ventas.bill.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
@CrossOrigin
public class CustomerServiceImpl implements CustomerService {

    public final CustomerRepository customerRepository;
    @Override
    public List<Customer> listCustomer() throws Exception {
        return customerRepository.findAll();
    }

    @Override
    public Customer save(CustomerRequest customerRequest) throws Exception {
        return customerRepository.save(Customer.builder()
                .fullName(customerRequest.getFullName())
                .dni(customerRequest.getDni())
                .country(customerRequest.getCountry())
                .phoneNumber(customerRequest.getPhoneNumber())
                .build());
    }

    @Override
    public Customer update(CustomerUpdateRequest customerUpdateRequest) throws Exception {
        return customerRepository.save(Customer
                .builder()
                .id(customerUpdateRequest.getId())
                .fullName(customerUpdateRequest.getFullName())
                .dni(customerUpdateRequest.getDni())
                .country(customerUpdateRequest.getCountry())
                .phoneNumber(customerUpdateRequest.getPhoneNumber())
                .state(customerUpdateRequest.getState())
                .build());
    }

    @Override
    public Customer delete(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent()) {
            customer.get().setState(false);
            return customerRepository.save(customer.get());
        }
        return null;
    }

    @Override
    public Customer findById(Long id) throws Exception {
        Optional<Customer> customer = customerRepository.findById(id);
        if(customer.isPresent())
            return customer.get();
        return null;
    }
}
