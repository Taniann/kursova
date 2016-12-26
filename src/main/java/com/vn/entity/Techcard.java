package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Table
public class Techcard {

    @Id
    @GeneratedValue
    @Column
    private Long idTechCarty;

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
   // @PrimaryKeyJoinColumn
    private InfoProVydannia infoProVydannia;

    @ManyToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn
    private VydRoboty vydRoboty; //one to many

    @OneToOne(cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
//    @PrimaryKeyJoinColumn
    private OsobystaInfoVykonavtsia osobystaInfoVykonavtsia;

    @Column
    private Date terminPochatku;

    @Column
    private Date terminZakinchennia;

    @Column
    private Date factychnyiPochatok;

    @Column
    private Date factychnyiKinec;

    @Column
    private Double vartistRoboty;

    @Column
    private Double vartistDruku;

    @Column
    private Double sumVartist;

    public Techcard() {
    }

    public Techcard(InfoProVydannia infoProVydannia, VydRoboty vydRoboty, OsobystaInfoVykonavtsia osobystaInfoVykonavtsia, Date terminPochatku, Date terminZakinchennia, Date factychnyiPochatok, Date factychnyiKinec, Double vartistRoboty, Double vartistDruku, Double sumVartist) {
        this.infoProVydannia = infoProVydannia;
        this.vydRoboty = vydRoboty;
        this.osobystaInfoVykonavtsia = osobystaInfoVykonavtsia;
        this.terminPochatku = terminPochatku;
        this.terminZakinchennia = terminZakinchennia;
        this.factychnyiPochatok = factychnyiPochatok;
        this.factychnyiKinec = factychnyiKinec;
        this.vartistRoboty = vartistRoboty;
        this.vartistDruku = vartistDruku;
        this.sumVartist = sumVartist;
    }

    public Long getIdTechCarty() {
        return idTechCarty;
    }

    public void setIdTechCarty(Long idTechCarty) {
        this.idTechCarty = idTechCarty;
    }

    public InfoProVydannia getInfoProVydannia() {
        return infoProVydannia;
    }

    public void setInfoProVydannia(InfoProVydannia infoProVydannia) {
        this.infoProVydannia = infoProVydannia;
    }

    public VydRoboty getVydRoboty() {
        return vydRoboty;
    }

    public void setVydRoboty(VydRoboty vydRoboty) {
        this.vydRoboty = vydRoboty;
    }

    public OsobystaInfoVykonavtsia getOsobystaInfoVykonavtsia() {
        return osobystaInfoVykonavtsia;
    }

    public void setOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        this.osobystaInfoVykonavtsia = osobystaInfoVykonavtsia;
    }

    public Date getTerminPochatku() {
        return terminPochatku;
    }

    public void setTerminPochatku(Date terminPochatku) {
        this.terminPochatku = terminPochatku;
    }

    public Date getTerminZakinchennia() {
        return terminZakinchennia;
    }

    public void setTerminZakinchennia(Date terminZakinchennia) {
        this.terminZakinchennia = terminZakinchennia;
    }

    public Date getFactychnyiPochatok() {
        return factychnyiPochatok;
    }

    public void setFactychnyiPochatok(Date factychnyiPochatok) {
        this.factychnyiPochatok = factychnyiPochatok;
    }

    public Date getFactychnyiKinec() {
        return factychnyiKinec;
    }

    public void setFactychnyiKinec(Date factychnyiKinec) {
        this.factychnyiKinec = factychnyiKinec;
    }

    public Double getVartistRoboty() {
        return vartistRoboty;
    }

    public void setVartistRoboty(Double vartistRoboty) {
        this.vartistRoboty = vartistRoboty;
    }

    public Double getVartistDruku() {
        return vartistDruku;
    }

    public void setVartistDruku(Double vartistDruku) {
        this.vartistDruku = vartistDruku;
    }

    public Double getSumVartist() {
        return sumVartist;
    }

    public void setSumVartist(Double sumVartist) {
        this.sumVartist = sumVartist;
    }
}



