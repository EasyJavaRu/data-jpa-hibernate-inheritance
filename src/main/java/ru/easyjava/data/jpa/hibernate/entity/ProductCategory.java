package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Holds similar products.
 */
@SuppressWarnings("PMD")
@Entity
@ToString
public class ProductCategory extends ObjectWithDescription {
    /**
     * Some human friendly category code.
     */
    @Getter
    @Setter
    private String code;
}
