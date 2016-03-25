package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Liquid cargo.
 */
@SuppressWarnings("PMD")
@Entity
@ToString
public class LiquidCargo extends Cargo {
    /**
     * Cargo volume.
     */
    @Getter
    @Setter
    private Long volume;

    /**
     * Liquid type.
     */
    @Getter
    @Setter
    private String liquidType;
}
