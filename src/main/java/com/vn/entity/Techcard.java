package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "Технологічна картка видання")
public class Techcard {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id технічної картки", length = 6, nullable = false)
    private Long idTechCarty;

//    @Column(name = "id видання")
    @OneToOne
    private InfoProVydannia infoProVydannia;

//    @Column(name = "id виду роботи")
    @OneToOne
    private VydRoboty vydRoboty; //one to many

//    @Column(name = "id виконавця")
    @OneToOne
    private OsobystaInfoVykonavtsia osobystaInfoVykonavtsia;

    @Column(name = "термін початку роботи")
    private Date terminPochatku;

    @Column(name = "термін закінчення роботи")
    private Date terminZakinchennia;

    @Column(name = "фактичний початок роботи")
    private Date factychnyiPochatok;

    @Column(name = "фактичний кынець роботи")
   private Date factychnyiKinec;

    @Column(name = "вартість роботи")
    private Double vartistRoboty;

    @Column(name = "вартість друку")
    private Double vartistDruku;

    @Column(name = "сумарна вартість")
    private Double SumVartist;


    public Techcard() {
    }

    public Techcard(Long idTechCarty, InfoProVydannia infoProVydannia, VydRoboty vydRoboty, OsobystaInfoVykonavtsia osobystaInfoVykonavtsia, Date terminPochatku, Date terminZakinchennia, Date factychnyiPochatok, Date factychnyiKinec, Double vartistRoboty, Double vartistDruku, Double sumVartist) {
        this.idTechCarty = idTechCarty;
        this.infoProVydannia = infoProVydannia;
        this.vydRoboty = vydRoboty;
        this.osobystaInfoVykonavtsia = osobystaInfoVykonavtsia;
        this.terminPochatku = terminPochatku;
        this.terminZakinchennia = terminZakinchennia;
        this.factychnyiPochatok = factychnyiPochatok;
        this.factychnyiKinec = factychnyiKinec;
        this.vartistRoboty = vartistRoboty;
        this.vartistDruku = vartistDruku;
        SumVartist = sumVartist;
    }

    public Long getIdTechCarty() {
        return idTechCarty;
    }

    public void setIdTechCarty(long idTechCarty) {
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
        return SumVartist;
    }

    public void setSumVartist(Double sumVartist) {
        SumVartist = sumVartist;
    }
}



