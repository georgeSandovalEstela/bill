package com.ventas.bill.repository;

import com.ventas.bill.domain.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BillRepository extends JpaRepository<Bill,Long> {

    @Query(value = "select * from bill as b where b.state=true order by b.category",nativeQuery = true)
    List<Bill> findAllBill()throws Exception;
}
