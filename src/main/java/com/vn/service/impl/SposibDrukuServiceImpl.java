package com.vn.service.impl;

import com.vn.entity.SposibDruku;
import com.vn.repository.SposibDrukuRepository;
import com.vn.service.SposibDrukuService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public class SposibDrukuServiceImpl implements SposibDrukuService {

    @Autowired
    private SposibDrukuRepository sposibDrukuRepository;

    @Override
    public SposibDruku addSposibDruku(SposibDruku sposibDruku) {
        SposibDruku savedSposibDruku = sposibDrukuRepository.saveAndFlush(sposibDruku);

        return savedSposibDruku;
    }

    @Override
    public void delete(long idSposobuDruku) {
        sposibDrukuRepository.delete(idSposobuDruku);
    }

    @Override
    public SposibDruku getById(long idSposobuDruku) {
        return sposibDrukuRepository.findOne(idSposobuDruku);
    }

    @Override
    public SposibDruku editSposibDruku(SposibDruku sposibDruku) {
        return sposibDrukuRepository.saveAndFlush(sposibDruku);
    }

    @Override
    public List<SposibDruku> getAll() {
        return sposibDrukuRepository.findAll();
    }
}
