package com.vn.entity;

/**
 * Created by Таня on 12.12.2016.
 */
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table
public class OsobystaInfoVykonavtsia {

    @Id
    @GeneratedValue
    @Column
    private Long idVykonavcia;

    @Column
    private Long identyfKod;

    @Column(unique = true)
    private String pib;

    @Column
    private String pasport;

    @Column
    private String adresa;

    @Column
    private Long telephone;

    @Column
    private Date dataNarodzhenia;

    @Column
    private Date dataPryiomuNaRobotu;

    @Column
    private Double zarPlata;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private Pidrozdil pidrozdil;

    public OsobystaInfoVykonavtsia() {
    }

    public OsobystaInfoVykonavtsia(Long idVykonavcia, Long identyfKod, String pib, String pasport, String adresa, Long telephone, Date dataNarodzhenia, Date dataPryiomuNaRobotu, Double zarPlata, Pidrozdil pidrozdil) {
        this.idVykonavcia = idVykonavcia;
        this.identyfKod = identyfKod;
        this.pib = pib;
        this.pasport = pasport;
        this.adresa = adresa;
        this.telephone = telephone;
        this.dataNarodzhenia = dataNarodzhenia;
        this.dataPryiomuNaRobotu = dataPryiomuNaRobotu;
        this.zarPlata = zarPlata;
        this.pidrozdil = pidrozdil;
    }

    public Long getIdVykonavcia() {
        return idVykonavcia;
    }

    public void setIdVykonavcia(Long idVykonavcia) {
        this.idVykonavcia = idVykonavcia;
    }

    public Long getIdentyfKod() {
        return identyfKod;
    }

    public void setIdentyfKod(Long identyfKod) {
        this.identyfKod = identyfKod;
    }

    public String getPib() {
        return pib;
    }

    public void setPib(String pib) {
        this.pib = pib;
    }

    public String getPasport() {
        return pasport;
    }

    public void setPasport(String pasport) {
        this.pasport = pasport;
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

    public Date getDataNarodzhenia() {
        return dataNarodzhenia;
    }

    public void setDataNarodzhenia(Date dataNarodzhenia) {
        this.dataNarodzhenia = dataNarodzhenia;
    }

    public Date getDataPryiomuNaRobotu() {
        return dataPryiomuNaRobotu;
    }

    public void setDataPryiomuNaRobotu(Date dataPryiomuNaRobotu) {
        this.dataPryiomuNaRobotu = dataPryiomuNaRobotu;
    }

    public Double getZarPlata() {
        return zarPlata;
    }

    public void setZarPlata(Double zarPlata) {
        this.zarPlata = zarPlata;
    }

    public Pidrozdil getPidrozdil() {
        return pidrozdil;
    }

    public void setPidrozdil(Pidrozdil pidrozdil) {
        this.pidrozdil = pidrozdil;
    }
}
