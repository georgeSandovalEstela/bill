package com.ventas.bill.controller;

import com.ventas.bill.domain.Customer;
import com.ventas.bill.dto.request.CustomerRequest;
import com.ventas.bill.dto.request.update.CustomerUpdateRequest;
import com.ventas.bill.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {

    public final CustomerService customerService;

    @GetMapping("/list")
    public ResponseEntity<List<Customer>> list()throws Exception{
        return ResponseEntity.ok(customerService.listCustomer());
    }

    @PostMapping("/save")
    public ResponseEntity<Customer> save(@RequestBody CustomerRequest customerRequest)throws Exception{
        return ResponseEntity.ok(customerService.save(customerRequest));
    }

    @PutMapping("/update")
    public ResponseEntity<Customer> update(@RequestBody CustomerUpdateRequest customerUpdateRequest)throws Exception{
        return ResponseEntity.ok(customerService.update(customerUpdateRequest));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> findById(@PathVariable("id")Long id)throws Exception{
        return ResponseEntity.ok(customerService.findById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Customer> delete(@PathVariable("id")Long id)throws Exception{
        return ResponseEntity.ok(customerService.delete(id));
    }



}
