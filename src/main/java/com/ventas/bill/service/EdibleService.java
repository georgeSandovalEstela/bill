package com.ventas.bill.service;

import com.ventas.bill.domain.Edible;
import com.ventas.bill.dto.request.EdibleRequest;
import com.ventas.bill.dto.request.update.EdibleUpdateRequest;

import java.util.List;

public interface EdibleService {
    List<Edible> findAll()throws Exception;

    Edible save(EdibleRequest edibleRequest)throws Exception;

    Edible update(EdibleUpdateRequest edibleUpdateRequest)throws Exception;

    Edible findById(Long id)throws Exception;

    Edible delete(Long id)throws Exception;
}
