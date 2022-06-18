package com.ventas.bill.dto.request;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class SelectElementRequest {

    private Long id;

    private Long idBill;

    private Long idEdible;

    private Integer quantity;

}
