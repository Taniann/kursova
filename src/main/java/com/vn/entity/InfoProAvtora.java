package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;


@Entity
@Table
public class InfoProAvtora {
    @Id
    @GeneratedValue
    @Column
    private Long idAvtora;

    @Column
    private String prizvyshche;

    @Column
    private String imiia;

    @Column
    private String pobatkovi;

    @Column
    private String adresa;

    @Column
    private Long telephone;

    @Column
    private String prymitky;

    public InfoProAvtora() {
    }

    public InfoProAvtora(Long idAvtora, String prizvyshche, String imiia, String pobatkovi, String adresa, Long telephone, String prymitky) {
        this.idAvtora = idAvtora;
        this.prizvyshche = prizvyshche;
        this.imiia = imiia;
        this.pobatkovi = pobatkovi;
        this.adresa = adresa;
        this.telephone = telephone;
        this.prymitky = prymitky;
    }

    public Long getIdAvtora() {
        return idAvtora;
    }

    public void setIdAvtora(Long idAvtora) {
        this.idAvtora = idAvtora;
    }

    public String getPrizvyshche() {
        return prizvyshche;
    }

    public void setPrizvyshche(String prizvyshche) {
        this.prizvyshche = prizvyshche;
    }

    public String getImiia() {
        return imiia;
    }

    public void setImiia(String imiia) {
        this.imiia = imiia;
    }

    public String getPobatkovi() {
        return pobatkovi;
    }

    public void setPobatkovi(String pobatkovi) {
        this.pobatkovi = pobatkovi;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Long getTelephone() {
        return telephone;
    }

    public void setTelephone(Long telephone) {
        this.telephone = telephone;
    }

    public String getPrymitky() {
        return prymitky;
    }

    public void setPrymitky(String prymitky) {
        this.prymitky = prymitky;
    }
}
