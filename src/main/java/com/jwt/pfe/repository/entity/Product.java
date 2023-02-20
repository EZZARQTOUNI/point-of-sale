package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.TimeStampEntity;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product extends TimeStampEntity {

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Float price;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(columnDefinition = "TEXT")
    private String image;

    @Column(nullable = false)
    private Integer quantity;

}
