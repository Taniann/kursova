package com.vn.service.impl;

import com.vn.entity.VydObkladynky;
import com.vn.repository.VydObkladynkyRepository;
import com.vn.service.VydObkladynkyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class VydObkladynkyServiceImpl implements VydObkladynkyService {

    @Autowired
    private VydObkladynkyRepository vydObkladynkyRepository;

    @Override
    public VydObkladynky addVydObkladynky(VydObkladynky vydObkladynky) {
        VydObkladynky savedVydObkladynky = vydObkladynkyRepository.saveAndFlush(vydObkladynky);

        return savedVydObkladynky;
    }

    @Override
    public void delete(long idVydObkladynky) {
        vydObkladynkyRepository.delete(idVydObkladynky);
    }

    @Override
    public VydObkladynky getById(long idVydObkladynky) {
        return vydObkladynkyRepository.findOne(idVydObkladynky);
    }

    @Override
    public VydObkladynky getOneByNazvaVyduObkladynky( String nazvaVyduObkladynky){ return vydObkladynkyRepository.findOneByNazvaVyduObkladynky(nazvaVyduObkladynky);}

    @Override
    public VydObkladynky editVydObkladynky(VydObkladynky vydObkladynky) {
        return vydObkladynkyRepository.saveAndFlush(vydObkladynky);
    }

    @Override
    public List<VydObkladynky> getAll() {
        return vydObkladynkyRepository.findAll();
    }
}
