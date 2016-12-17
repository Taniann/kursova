package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */

import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;

@Entity
public class InfoProVydannia {
    @Id
    @GeneratedValue
    @Column
    private Long idVydannia;

    @Column
    private String povnaNazva;

    @Column
    private String korotkaNazva;

    @ManyToOne
    @JoinColumn
    private VydVydannia vydVydannia;

    @Column
    private Integer kilkistStorinok;


    @OneToOne
    @PrimaryKeyJoinColumn
    private VydObkladynky vydObkladynky;

    @Column
    private Long tyrazh;

    @ManyToOne
    @JoinColumn
    private Format format;

    @ManyToOne
    @JoinColumn
    private SposibDruku sposibDruku;

    @ManyToOne
    @JoinColumn
    private InfoProAvtora infoProAvtora1;

    @ManyToOne
    @JoinColumn
    private InfoProAvtora infoProAvtora2;

    @ManyToOne
    @JoinColumn
    private InfoProAvtora infoProAvtora3;

    public InfoProVydannia () {}

    public InfoProVydannia(Long idVydannia, String povnaNazva, String korotkaNazva, VydVydannia vydVydannia, Integer kilkistStorinok, VydObkladynky vydObkladynky, Long tyrazh, Format format, SposibDruku sposibDruku, InfoProAvtora infoProAvtora1, InfoProAvtora infoProAvtora2, InfoProAvtora infoProAvtora3) {
        this.idVydannia = idVydannia;
        this.povnaNazva = povnaNazva;
        this.korotkaNazva = korotkaNazva;
        this.vydVydannia = vydVydannia;
        this.kilkistStorinok = kilkistStorinok;
        this.vydObkladynky = vydObkladynky;
        this.tyrazh = tyrazh;
        this.format = format;
        this.sposibDruku = sposibDruku;
        this.infoProAvtora1 = infoProAvtora1;
        this.infoProAvtora2 = infoProAvtora2;
        this.infoProAvtora3 = infoProAvtora3;
    }

    public Long getIdVydannia() {
        return idVydannia;
    }

    public void setIdVydannia(Long idVydannia) {
        this.idVydannia = idVydannia;
    }

    public String getPovnaNazva() {
        return povnaNazva;
    }

    public void setPovnaNazva(String povnaNazva) {
        this.povnaNazva = povnaNazva;
    }

    public String getKorotkaNazva() {
        return korotkaNazva;
    }

    public void setKorotkaNazva(String korotkaNazva) {
        this.korotkaNazva = korotkaNazva;
    }

    public VydVydannia getVydVydannia() {
        return vydVydannia;
    }

    public void setVydVydannia(VydVydannia vydVydannia) {
        this.vydVydannia = vydVydannia;
    }

    public Integer getKilkistStorinok() {
        return kilkistStorinok;
    }

    public void setKilkistStorinok(Integer kilkistStorinok) {
        this.kilkistStorinok = kilkistStorinok;
    }

    public VydObkladynky getVydObkladynky() {
        return vydObkladynky;
    }

    public void setVydObkladynky(VydObkladynky vydObkladynky) {
        this.vydObkladynky = vydObkladynky;
    }

    public Long getTyrazh() {
        return tyrazh;
    }

    public void setTyrazh(Long tyrazh) {
        this.tyrazh = tyrazh;
    }

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public SposibDruku getSposibDruku() {
        return sposibDruku;
    }

    public void setSposibDruku(SposibDruku sposibDruku) {
        this.sposibDruku = sposibDruku;
    }

    public InfoProAvtora getInfoProAvtora1() {
        return infoProAvtora1;
    }

    public void setInfoProAvtora1(InfoProAvtora infoProAvtora1) {
        this.infoProAvtora1 = infoProAvtora1;
    }

    public InfoProAvtora getInfoProAvtora2() {
        return infoProAvtora2;
    }

    public void setInfoProAvtora2(InfoProAvtora infoProAvtora2) {
        this.infoProAvtora2 = infoProAvtora2;
    }

    public InfoProAvtora getInfoProAvtora3() {
        return infoProAvtora3;
    }

    public void setInfoProAvtora3(InfoProAvtora infoProAvtora3) {
        this.infoProAvtora3 = infoProAvtora3;
    }
}
