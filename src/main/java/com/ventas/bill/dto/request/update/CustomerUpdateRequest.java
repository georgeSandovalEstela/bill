package com.ventas.bill.dto.request.update;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerUpdateRequest {

    private Long id;

    private String fullName;

    private String dni;

    private String country;

    private String phoneNumber;

    private Boolean state;
}
