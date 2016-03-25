package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Some product.
 */
@SuppressWarnings("PMD")
@Entity
@DiscriminatorValue("PRODUCT")
@ToString
public class Product extends AbstractNamedObject {
    /**
     * Category, to which this product belongs.
     */
    @Getter
    @Setter
    private Long productCategoryId;
}
