package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table
public class VydRoboty {
    @Id
    @GeneratedValue
    @Column
    private Long idVydRoboty;

    @Column
    private String nazvaVyduRoboty;

    public VydRoboty() {
    }

    public VydRoboty(Long idVydRoboty, String nazvaVyduRoboty) {
        this.idVydRoboty = idVydRoboty;
        this.nazvaVyduRoboty = nazvaVyduRoboty;
    }

    public Long getIdVydRoboty() {
        return idVydRoboty;
    }

    public void setIdVydRoboty(Long idVydRoboty) {
        this.idVydRoboty = idVydRoboty;
    }

    public String getNazvaVyduRoboty() {
        return nazvaVyduRoboty;
    }

    public void setNazvaVyduRoboty(String nazvaVyduRoboty) {
        this.nazvaVyduRoboty = nazvaVyduRoboty;
    }
}
