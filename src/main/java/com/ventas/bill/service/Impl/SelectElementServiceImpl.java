package com.ventas.bill.service.Impl;

import com.ventas.bill.domain.Bill;
import com.ventas.bill.domain.Edible;
import com.ventas.bill.domain.SelectElement;
import com.ventas.bill.dto.request.SelectElementRequest;
import com.ventas.bill.dto.request.assignment.BillEdibleRequest;
import com.ventas.bill.dto.request.update.BillUpdateRequest;
import com.ventas.bill.dto.request.update.SelectElementUpdateRequest;
import com.ventas.bill.repository.EdibleRepository;
import com.ventas.bill.repository.SelectElementRepository;
import com.ventas.bill.service.SelectElementService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@AllArgsConstructor
@Service
@CrossOrigin
public class SelectElementServiceImpl implements SelectElementService {

    public final SelectElementRepository selectElementRepository;
    public final EdibleRepository edibleRepository;

    @Override
    public List<SelectElement> findAll() throws Exception {
        return selectElementRepository.findAllSE();
    }

    @Override
    public SelectElement save(SelectElementRequest selectElementRequest) throws Exception {
        return selectElementRepository.save(SelectElement
                .builder()
                .id(selectElementRequest.getId())
                .idBill(Bill.builder().id(selectElementRequest.getIdBill()).build())
                .idEdible(Edible.builder().id(selectElementRequest.getIdEdible()).build())
                .quantity(selectElementRequest.getQuantity())
                .state(true)
                .build());
    }

    @Override
    public SelectElement update(SelectElementUpdateRequest selectElementUpdateRequest) throws Exception {
        return null;
    }

    @Override
    public SelectElement findById(Long id) throws Exception {
        return null;
    }

    @Override
    public SelectElement delete(Long id) throws Exception {
        return null;
    }

    @Override
    public SelectElement updateSelectElement(SelectElementUpdateRequest selectElementUpdateRequest) {
        return selectElementRepository.save(SelectElement
                .builder()
                .id(selectElementUpdateRequest.getId())
                .idBill(Bill.builder().id(selectElementUpdateRequest.getIdEdible()).build())
                .idEdible(Edible.builder().id(selectElementUpdateRequest.getIdEdible()).build())
                .quantity(selectElementUpdateRequest.getQuantity())
                .state(selectElementUpdateRequest.getState())
                .build());
    }


    public void saveListEdible(Long idBill,List<BillEdibleRequest> edibleList)throws Exception{
        if (edibleList.size()!=0)
            for (BillEdibleRequest  e: edibleList )
                this.save(SelectElementRequest
                        .builder()
                        .idBill(idBill)
                        .idEdible(e.getId())
                        .quantity(e.getQuantity())
                        .build());
    }

    @Override
    public List<SelectElement> updateListSE(BillUpdateRequest billUpdateRequest) throws Exception {

        int a=0,b=0,c=0;

        for(int i=0; i< billUpdateRequest.getEdibleList().size(); i++){
            selectElementRepository.save(SelectElement
                    .builder()
                    .id(billUpdateRequest.getEdibleList().get(i).getIdSelectElement())
                    .quantity(billUpdateRequest.getEdibleList().get(i).getQuantity())
                    .idBill(Bill.builder().id(billUpdateRequest.getId()).build())
                    .idEdible(Edible.builder().id(billUpdateRequest.getEdibleList().get(i).getId()).build())
                    .state(billUpdateRequest.getEdibleList().get(i).getState())
                    .build());
        }

        return null;
    }

}
