package com.ventas.bill.repository;

import com.ventas.bill.domain.Edible;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EdibleRepository extends JpaRepository<Edible,Long> {

    @Query(value = "select * from edible as e where e.state=true order by e.category",nativeQuery = true)
    List<Edible> findAllEdible()throws Exception;
}
