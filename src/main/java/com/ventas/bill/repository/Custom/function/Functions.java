package com.ventas.bill.repository.Custom.function;

import com.ventas.bill.dto.request.assignment.BillEdibleRequest;
import com.ventas.bill.service.SelectElementService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class Functions {

    public final SelectElementService selectElementService;

    public Double calcQuantity(List<BillEdibleRequest> edibleList)throws Exception{

        double quantity = 0;

        for (BillEdibleRequest edibles :  edibleList) {
            quantity += (double) (edibles.getUnitPrice() * edibles.getQuantity());
        }

        return quantity;
    }


}
