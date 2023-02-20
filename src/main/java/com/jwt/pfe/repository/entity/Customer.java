package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.Personne;
import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Customer extends Personne {

    private String phone;

}
