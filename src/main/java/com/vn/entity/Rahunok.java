package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Рахунок")
public class Rahunok {
//    @Column(name = "id видання")
    @OneToOne
    private InfoProVydannia infoProVydannia;

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name= "increment", strategy= "increment")
    @Column(name = "id рахунку", length = 6, nullable = false)
    private Long idRahunku;

//    @Column(name = "id техкартки")
    @OneToOne
    private Techcard techcard;

    @Column(name = "дата виписки")
    private Date dataVypysky;

    @Column(name = "всього до сплати")
    private Double vsohoDoSplaty;

    @Column(name = "замовник")
    private String zamovnyk;

    @Column(name = "дата сплати")
    private Date dataSplatyy;

    @Column(name = "платіжне доручення")
    private String platizhneDoruchennia;


    @Column(name = "вартість послуг")
    private Double vartistPosluh;

    @Column(name = "вартість матеріалів")
    private Double vartistMaterialiv;

    public Rahunok() {
    }

    public Rahunok(InfoProVydannia infoProVydannia, Long idRahunku, Techcard techcard, Date dataVypysky, Double vsohoDoSplaty, String zamovnyk, Date dataSplatyy, String platizhneDoruchennia, Double vartistPosluh, Double vartistMaterialiv) {
        this.infoProVydannia = infoProVydannia;
        this.idRahunku = idRahunku;
        this.techcard = techcard;
        this.dataVypysky = dataVypysky;
        this.vsohoDoSplaty = vsohoDoSplaty;
        this.zamovnyk = zamovnyk;
        this.dataSplatyy = dataSplatyy;
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
        return dataSplatyy;
    }

    public void setDataSplatyy(Date dataSplatyy) {
        this.dataSplatyy = dataSplatyy;
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
