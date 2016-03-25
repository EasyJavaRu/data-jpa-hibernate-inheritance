package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Some service description.
 */
@SuppressWarnings("PMD")
@Entity
@DiscriminatorValue("SERVICE")
@ToString
public class Service extends AbstractNamedObject {
    /**
     * Service group, to which that service belongs.
     */
    @Getter
    @Setter
    private Long serviceGroup;
}
