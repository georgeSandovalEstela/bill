package com.ventas.bill.dto.request.assignment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class BillEdibleRequest {

    private Long idSelectElement;

    private Long id;

    private String name;

    private String category;

    private Double unitPrice;

    private Integer quantity;

    private Boolean state;

}
