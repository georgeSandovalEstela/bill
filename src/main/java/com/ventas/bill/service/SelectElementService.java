package com.ventas.bill.service;

import com.ventas.bill.domain.SelectElement;
import com.ventas.bill.dto.request.SelectElementRequest;
import com.ventas.bill.dto.request.assignment.BillEdibleRequest;
import com.ventas.bill.dto.request.update.BillUpdateRequest;
import com.ventas.bill.dto.request.update.SelectElementUpdateRequest;

import java.util.List;

public interface SelectElementService {
    List<SelectElement> findAll()throws Exception;

    SelectElement save(SelectElementRequest selectElementRequest)throws Exception;

    SelectElement update(SelectElementUpdateRequest selectElementUpdateRequest)throws Exception;

    SelectElement findById(Long id)throws Exception;

    SelectElement delete(Long id)throws Exception;

    SelectElement updateSelectElement(SelectElementUpdateRequest selectElementUpdateRequest);

    void saveListEdible(Long idBill,List<BillEdibleRequest> edibleList)throws Exception;

    List<SelectElement> updateListSE(BillUpdateRequest billUpdateRequest)throws Exception;
}
