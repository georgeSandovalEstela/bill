package com.ventas.bill.service;

import com.ventas.bill.domain.Bill;
import com.ventas.bill.dto.request.BillRequest;
import com.ventas.bill.dto.request.update.BillUpdateRequest;
import java.util.List;

public interface BillService {
    List<Bill> findAll()throws Exception;

    Bill save(BillRequest billRequest)throws Exception;

    Bill update(BillUpdateRequest billUpdateRequest)throws Exception;

    Bill findById(Long id)throws Exception;

    Bill delete(Long id)throws Exception;
}
