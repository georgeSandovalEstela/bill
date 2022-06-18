package com.ventas.bill.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CustomerRequest {
    private String fullName;

    private String dni;

    private String country;

    private String phoneNumber;
}
