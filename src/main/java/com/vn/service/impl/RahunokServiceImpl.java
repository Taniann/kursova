package com.vn.service.impl;

import com.vn.entity.Rahunok;
import com.vn.repository.RahunokRepository;
import com.vn.service.RahunokService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public class RahunokServiceImpl implements RahunokService {

    @Autowired
    private RahunokRepository rahunokRepository;

    @Override
    public Rahunok addRahunok(Rahunok rahunok) {
        Rahunok savedRahunok = rahunokRepository.saveAndFlush(rahunok);

        return savedRahunok;
    }

    @Override
    public void delete(long idRahunok) {
        rahunokRepository.delete(idRahunok);
    }

    @Override
    public Rahunok getById(long idRahunok) {
        return rahunokRepository.findById(idRahunok);
    }

    @Override
    public Rahunok editRahunok(Rahunok rahunok) {
        return rahunokRepository.saveAndFlush(rahunok);
    }

    @Override
    public List<Rahunok> getAll() {
        return rahunokRepository.findAll();
    }

}
