package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table
public class Pidrozdil {
    @Id
    @GeneratedValue
    @Column
    private Long idPidrozdilu;

    @Column
    private String nazvaPidrozdilu;

    public Pidrozdil() {
    }

    public Pidrozdil(Long idPidrozdilu, String nazvaPidrozdilu) {
        this.idPidrozdilu = idPidrozdilu;
        this.nazvaPidrozdilu = nazvaPidrozdilu;
    }

    public Long getIdPidrozdilu() {
        return idPidrozdilu;
    }

    public void setIdPidrozdilu(Long idPidrozdilu) {
        this.idPidrozdilu = idPidrozdilu;
    }

    public String getNazvaPidrozdilu() {
        return nazvaPidrozdilu;
    }

    public void setNazvaPidrozdilu(String nazvaPidrozdilu) {
        this.nazvaPidrozdilu = nazvaPidrozdilu;
    }
}
