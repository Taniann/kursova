package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "Види обкладинки")
public class VydObkladynky {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(length = 6, nullable = false)
    private Long idVydObkladynky;

    @Column(name = "назва виду обкладинки")
    private String nazvaVyduObkladynky;

    public VydObkladynky() {
    }

    public VydObkladynky(Long idVydObkladynky, String nazvaVyduObkladynky) {
        this.idVydObkladynky = idVydObkladynky;
        this.nazvaVyduObkladynky = nazvaVyduObkladynky;
    }

    public Long getIdVydObkladynky() {
        return idVydObkladynky;
    }

    public void setIdVydObkladynky(Long idVydObkladynky) {
        this.idVydObkladynky = idVydObkladynky;
    }

    public String getNazvaVyduObkladynky() {
        return nazvaVyduObkladynky;
    }

    public void setNazvaVyduObkladynky(String nazvaVyduObkladynky) {
        this.nazvaVyduObkladynky = nazvaVyduObkladynky;
    }
}
