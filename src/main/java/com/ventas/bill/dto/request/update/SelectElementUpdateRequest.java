package com.ventas.bill.dto.request.update;

import lombok.*;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class SelectElementUpdateRequest {

    private Long id;

    private Long idBill;

    private Long idEdible;

    private Integer quantity;

    private Boolean state;

}
