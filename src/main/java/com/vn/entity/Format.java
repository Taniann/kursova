package com.vn.entity;

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table(name = "Формати")
public class Format {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id формату", length = 6, nullable = false)
    private Long idFormatu;

    @Column(name = "назва формату")
    private String nazvaFormatu;

    @Column(name = "вартість формату")
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


