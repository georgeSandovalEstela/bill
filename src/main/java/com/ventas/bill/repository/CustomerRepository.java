package com.ventas.bill.repository;

import com.ventas.bill.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CustomerRepository extends JpaRepository<Customer,Long> {

    @Query(value = "select * from customer as c where c.dni=:dni and c.state=true",nativeQuery = true)
    Optional<Customer> findByDni(String dni)throws Exception;
}
