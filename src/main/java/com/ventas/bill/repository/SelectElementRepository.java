package com.ventas.bill.repository;

import com.ventas.bill.domain.SelectElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SelectElementRepository extends JpaRepository<SelectElement,Long> {

    @Query(value = "select * from select_element as se where se.state=true order by se.id_bill",nativeQuery = true)
    List<SelectElement> findAllSE()throws Exception;

    @Query(value = "select * from select_element as se where se.id_bill=:id and se.state=true",nativeQuery = true)
    List<SelectElement> findAllByIdBill(Long id)throws Exception;
}
