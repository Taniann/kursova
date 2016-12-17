package com.vn.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table
public class Format {

    @Id
    @GeneratedValue
    @Column
    private Long idFormatu;

    @Column
    private String nazvaFormatu;

    @Column
    private Double vartistFormatu;

    public Format() {
    }

    public Format(Long idFormatu, String nazvaFormatu, Double vartistFormatu) {
        this.idFormatu = idFormatu;
        this.nazvaFormatu = nazvaFormatu;
        this.vartistFormatu = vartistFormatu;
    }

    public Long getIdFormatu() {
        return idFormatu;
    }

    public void setIdFormatu(Long idFormatu) {
        this.idFormatu = idFormatu;
    }

    public String getNazvaFormatu() {
        return nazvaFormatu;
    }

    public void setNazvaFormatu(String nazvaFormatu) {
        this.nazvaFormatu = nazvaFormatu;
    }

    public Double getVartistFormatu() {
        return vartistFormatu;
    }

    public void setVartistFormatu(Double vartistFormatu) {
        this.vartistFormatu = vartistFormatu;
    }
}


