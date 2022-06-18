package com.ventas.bill.dto.request;

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
public class BillRequest {

    private Date date;

    private CustomerRequest persona;

    private List<BillEdibleRequest> edibles;
}
