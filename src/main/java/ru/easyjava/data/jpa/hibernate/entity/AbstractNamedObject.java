package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Inheritance;

/**
 * Base class for all objects with names.
 */
@SuppressWarnings("PMD")
@Entity
@Inheritance
@DiscriminatorColumn
@ToString
public abstract class AbstractNamedObject extends AbstractIdentifiableObject {
    /**
     * The Name.
     */
    @Getter
    @Setter
    private String name;
}
