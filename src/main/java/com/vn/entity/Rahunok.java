package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class Rahunok {

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @PrimaryKeyJoinColumn
    private InfoProVydannia infoProVydannia;

    @Id
    @GeneratedValue
    @Column
    private Long idRahunku;


    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Techcard techcard;

    @Column
    private Date dataVypysky;

    @Column
    private Double vsohoDoSplaty;

    @Column
    private String zamovnyk;

    @Column
    private Date dataSplaty;

    @Column
    private String platizhneDoruchennia;


    @Column
    private Double vartistPosluh;

    @Column
    private Double vartistMaterialiv;

    public Rahunok() {
    }

    public Rahunok(InfoProVydannia infoProVydannia, Long idRahunku, Techcard techcard, Date dataVypysky, Double vsohoDoSplaty, String zamovnyk, Date dataSplaty, String platizhneDoruchennia, Double vartistPosluh, Double vartistMaterialiv) {
        this.infoProVydannia = infoProVydannia;
        this.idRahunku = idRahunku;
        this.techcard = techcard;
        this.dataVypysky = dataVypysky;
        this.vsohoDoSplaty = vsohoDoSplaty;
        this.zamovnyk = zamovnyk;
        this.dataSplaty = dataSplaty;
        this.platizhneDoruchennia = platizhneDoruchennia;
        this.vartistPosluh = vartistPosluh;
        this.vartistMaterialiv = vartistMaterialiv;
    }

    public InfoProVydannia getInfoProVydannia() {
        return infoProVydannia;
    }

    public void setInfoProVydannia(InfoProVydannia infoProVydannia) {
        this.infoProVydannia = infoProVydannia;
    }

    public Long getIdRahunku() {
        return idRahunku;
    }

    public void setIdRahunku(Long idRahunku) {
        this.idRahunku = idRahunku;
    }

    public Techcard getTechcard() {
        return techcard;
    }

    public void setTechcard(Techcard techcard) {
        this.techcard = techcard;
    }

    public Date getDataVypysky() {
        return dataVypysky;
    }

    public void setDataVypysky(Date dataVypysky) {
        this.dataVypysky = dataVypysky;
    }

    public Double getVsohoDoSplaty() {
        return vsohoDoSplaty;
    }

    public void setVsohoDoSplaty(Double vsohoDoSplaty) {
        this.vsohoDoSplaty = vsohoDoSplaty;
    }

    public String getZamovnyk() {
        return zamovnyk;
    }

    public void setZamovnyk(String zamovnyk) {
        this.zamovnyk = zamovnyk;
    }

    public Date getDataSplatyy() {
        return dataSplaty;
    }

    public void setDataSplatyy(Date dataSplatyy) {
        this.dataSplaty = dataSplatyy;
    }

    public String getPlatizhneDoruchennia() {
        return platizhneDoruchennia;
    }

    public void setPlatizhneDoruchennia(String platizhneDoruchennia) {
        this.platizhneDoruchennia = platizhneDoruchennia;
    }

    public Double getVartistPosluh() {
        return vartistPosluh;
    }

    public void setVartistPosluh(Double vartistPosluh) {
        this.vartistPosluh = vartistPosluh;
    }

    public Double getVartistMaterialiv() {
        return vartistMaterialiv;
    }

    public void setVartistMaterialiv(Double vartistMaterialiv) {
        this.vartistMaterialiv = vartistMaterialiv;
    }
}
