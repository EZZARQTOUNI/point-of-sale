package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.TimeStampEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SaleItem extends TimeStampEntity {

    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    private Float Total;

}
