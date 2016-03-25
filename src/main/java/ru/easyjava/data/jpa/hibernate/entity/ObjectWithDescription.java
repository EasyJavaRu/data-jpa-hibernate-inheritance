package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Base class for all objects with description.
 */
@SuppressWarnings("PMD")
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "descriptions")
@ToString
public abstract class ObjectWithDescription extends AbstractIdentifiableObject {
    /**
     * Description text.
     */
    @Getter
    @Setter
    private String description;
}
