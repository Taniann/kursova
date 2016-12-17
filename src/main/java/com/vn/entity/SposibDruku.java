package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table
public class SposibDruku {

    @Id
    @GeneratedValue
    @Column
    private Long idSposobuDruku;

    @Column
    private String nazvaSposobuDruku;

    public SposibDruku() {
    }

    public SposibDruku(Long idSposobuDruku, String nazvaSposobuDruku) {
        this.idSposobuDruku = idSposobuDruku;
        this.nazvaSposobuDruku = nazvaSposobuDruku;
    }

    public Long getIdSposobuDruku() {
        return idSposobuDruku;
    }

    public void setIdSposobuDruku(Long idSposobuDruku) {
        this.idSposobuDruku = idSposobuDruku;
    }

    public String getNazvaSposobuDruku() {
        return nazvaSposobuDruku;
    }

    public void setNazvaSposobuDruku(String nazvaSposobuDruku) {
        this.nazvaSposobuDruku = nazvaSposobuDruku;
    }
}
