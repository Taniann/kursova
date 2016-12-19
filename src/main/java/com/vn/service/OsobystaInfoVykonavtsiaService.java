package com.vn.service;

import com.vn.entity.OsobystaInfoVykonavtsia;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface OsobystaInfoVykonavtsiaService {

    OsobystaInfoVykonavtsia addOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    void delete(long idVykonavcia);
    OsobystaInfoVykonavtsia getById(long idVykonavcia);
    OsobystaInfoVykonavtsia editOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    List<OsobystaInfoVykonavtsia> getAll();
}
