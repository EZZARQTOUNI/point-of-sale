package com.jwt.pfe.repository.entity.shared;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@Getter
@Setter
@MappedSuperclass
public class Personne extends  TimeStampEntity{

    private String firstName;

    private String lastName;

    @Column(unique = true)
    private String email;


}
