package com.vn.service.impl;

import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Pidrozdil;
import com.vn.repository.OsobystaInfoVykonavtsiaRepository;
import com.vn.service.OsobystaInfoVykonavtsiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class OsobystaInfoVykonavtsiaServiceImpl implements OsobystaInfoVykonavtsiaService {

    @Autowired
    private OsobystaInfoVykonavtsiaRepository osobystaInfoVykonavtsiaRepository;

    @Override
    public OsobystaInfoVykonavtsia addOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        OsobystaInfoVykonavtsia savedOsobystaInfoVykonavtsia= osobystaInfoVykonavtsiaRepository.saveAndFlush(osobystaInfoVykonavtsia);

        return savedOsobystaInfoVykonavtsia;
    }

    @Override
    public void delete(long idVykonavcia) {
        osobystaInfoVykonavtsiaRepository.delete(idVykonavcia);
    }

    @Override
    public OsobystaInfoVykonavtsia getById(long idVykonavcia) {
        return osobystaInfoVykonavtsiaRepository.findOne(idVykonavcia);
    }

    @Override
    public List<OsobystaInfoVykonavtsia> getAllByIdentyfKod(long identyfKod) {
        return osobystaInfoVykonavtsiaRepository.findAllByIdentyfKod(identyfKod);
    }
    @Override
    public OsobystaInfoVykonavtsia getOneByPib(String pib) {
        return osobystaInfoVykonavtsiaRepository.findOneByPib(pib);
    }
    @Override
    public List<OsobystaInfoVykonavtsia> getAllByDataPryiomuNaRobotuBetween(Date dataPryiomuNaRobotu1, Date dataPryiomuNaRobotu2) {
        return osobystaInfoVykonavtsiaRepository.findAllByDataPryiomuNaRobotuBetween(dataPryiomuNaRobotu1, dataPryiomuNaRobotu2);
    }
    @Override
    public List<OsobystaInfoVykonavtsia> getAllByPidrozdil(Pidrozdil pidrozdil) {
        return osobystaInfoVykonavtsiaRepository.findAllByPidrozdil(pidrozdil);
    }

    @Override
    public OsobystaInfoVykonavtsia editOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return osobystaInfoVykonavtsiaRepository.saveAndFlush(osobystaInfoVykonavtsia);
    }
    @Override
    public List<OsobystaInfoVykonavtsia> getAll() {
        return osobystaInfoVykonavtsiaRepository.findAll();
    }
}
