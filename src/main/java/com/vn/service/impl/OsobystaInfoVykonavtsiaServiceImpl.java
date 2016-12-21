package com.vn.service.impl;

import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.repository.OsobystaInfoVykonavtsiaRepository;
import com.vn.service.OsobystaInfoVykonavtsiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public OsobystaInfoVykonavtsia editOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return osobystaInfoVykonavtsiaRepository.saveAndFlush(osobystaInfoVykonavtsia);
    }

    @Override
    public List<OsobystaInfoVykonavtsia> getAll() {
        return osobystaInfoVykonavtsiaRepository.findAll();
    }
}
