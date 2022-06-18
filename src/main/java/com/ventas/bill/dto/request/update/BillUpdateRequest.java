package com.ventas.bill.dto.request.update;

import com.ventas.bill.dto.request.CustomerRequest;
import com.ventas.bill.dto.request.assignment.BillEdibleRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BillUpdateRequest {

    private Long id;

    private Date date;

    private CustomerRequest customerRequest;

    private List<BillEdibleRequest> edibleList;

    private Boolean state;
}
