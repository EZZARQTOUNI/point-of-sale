package com.jwt.pfe.repository.entity;

import com.jwt.pfe.repository.entity.shared.TimeStampEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category extends TimeStampEntity {

    private String title;


}
