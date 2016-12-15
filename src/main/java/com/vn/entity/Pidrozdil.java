package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;


@Entity
@Table(name = "Підрозділи")
public class Pidrozdil {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id підрозділу", length = 6, nullable = false)
    private Long idPidrozdilu;

    @Column(name = "назва підрозділу")
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
