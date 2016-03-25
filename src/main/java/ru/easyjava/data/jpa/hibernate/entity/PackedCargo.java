package ru.easyjava.data.jpa.hibernate.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;

/**
 * Cargo packed in a box, thus having dimensions.
 */
@SuppressWarnings("PMD")
@Entity
@ToString
public class PackedCargo extends Cargo {
    /**
     * Square box width.
     */
    @Getter
    @Setter
    private Long width;

    /**
     * Box height.
     */
    @Getter
    @Setter
    private Long height;
}
