package com.ventas.bill.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
@Table(name = "bill",schema = "public")
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JoinColumn(name = "id_customer",referencedColumnName = "id")
    @ManyToOne
    private Customer idCustomer;

    @Column(name = "quantity_total")
    private Double quantityTotal;

    private Date date;

    private Boolean state;
}
