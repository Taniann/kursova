package com.vn.service;

import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Pidrozdil;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface OsobystaInfoVykonavtsiaService {
    OsobystaInfoVykonavtsia addOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    void delete(long idVykonavcia);
    OsobystaInfoVykonavtsia getById(long idVykonavcia);
    List<OsobystaInfoVykonavtsia> getAllByIdentyfKod(long identyfKod);
    OsobystaInfoVykonavtsia getOneByPib(String pib);
    List<OsobystaInfoVykonavtsia> getAllByDataPryiomuNaRobotuBetween(Date dataPryiomuNaRobotu1, Date dataPryiomuNaRobotu2 );
    List<OsobystaInfoVykonavtsia> getAllByPidrozdil(Pidrozdil pidrozdil);
    OsobystaInfoVykonavtsia editOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    List<OsobystaInfoVykonavtsia> getAll();
}
