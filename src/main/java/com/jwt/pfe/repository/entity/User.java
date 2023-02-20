package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.Personne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User extends Personne {

    @Column(columnDefinition = "TEXT")
    private String password;



}
