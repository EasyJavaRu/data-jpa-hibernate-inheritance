package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Group of services.
 */
@SuppressWarnings("PMD")
@Entity
@ToString
public class ServiceGroup extends ObjectWithDescription {
    /**
     * Some human friendly group code.
     */
    @Getter
    @Setter
    private String code;
}
