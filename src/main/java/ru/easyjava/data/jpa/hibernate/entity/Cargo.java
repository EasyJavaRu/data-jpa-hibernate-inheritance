package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Base cargo class.
 */
@SuppressWarnings("PMD")
@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@ToString
public class Cargo extends AbstractIdentifiableObject {
    /**
     * Cargo weight in kg.
     */
    @Getter
    @Setter
    private Long weight;
}
