package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.TimeStampEntity;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Sale extends TimeStampEntity {

    @OneToMany
    private Set<SaleItem> items;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

}
