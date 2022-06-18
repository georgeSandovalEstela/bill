package com.ventas.bill.domain;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Builder
@Table(name = "select_element",schema = "public")
public class SelectElement implements Serializable {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

    @JoinColumn(name = "id_bill",referencedColumnName = "id")
    @ManyToOne
    private Bill idBill;

    @JoinColumn(name = "id_edible",referencedColumnName = "id")
    @ManyToOne
    private Edible idEdible;

    private Integer quantity;

    private Boolean state;
}
