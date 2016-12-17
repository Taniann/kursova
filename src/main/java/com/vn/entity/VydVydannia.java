package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table
public class VydVydannia {
    @Id
    @GeneratedValue
    @Column
    private Long idVydVydannia;

    @Column
    private String nazvaVyduVydannia;

    public VydVydannia() {
    }

    public VydVydannia(Long idVydVydannia, String nazvaVyduVydannia) {
        this.idVydVydannia = idVydVydannia;
        this.nazvaVyduVydannia = nazvaVyduVydannia;
    }

    public Long getIdVydVydannia() {
        return idVydVydannia;
    }

    public void setIdVydVydannia(Long idVydVydannia) {
        this.idVydVydannia = idVydVydannia;
    }

    public String getNazvaVyduVydannia() {
        return nazvaVyduVydannia;
    }

    public void setNazvaVyduVydannia(String nazvaVyduVydannia) {
        this.nazvaVyduVydannia = nazvaVyduVydannia;
    }
}
