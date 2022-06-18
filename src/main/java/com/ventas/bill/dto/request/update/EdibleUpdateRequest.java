package com.ventas.bill.dto.request.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class EdibleUpdateRequest {

    private Long id;

    private String name;

    private String category;

    private Double unitPrice;

    private Boolean state;
}
