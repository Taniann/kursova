package com.vn.service.impl;

import com.vn.entity.VydRoboty;
import com.vn.repository.VydRobotyRepository;
import com.vn.service.VydRobotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class VydRobotyServiceImpl implements VydRobotyService {

    @Autowired
    private VydRobotyRepository vydRobotyRepository;

    @Override
    public VydRoboty addVydRoboty(VydRoboty vydRoboty) {
        VydRoboty savedVydRoboty = vydRobotyRepository.saveAndFlush(vydRoboty);

        return savedVydRoboty;
    }

    @Override
    public void delete(long idVydRoboty) {
        vydRobotyRepository.delete(idVydRoboty);
    }

    @Override
    public VydRoboty getById(long idVydRoboty) {
        return vydRobotyRepository.findOne(idVydRoboty);
    }

    @Override
    public VydRoboty getOneByNazvaVyduRoboty( String nazvaVyduRoboty){ return vydRobotyRepository.findOneByNazvaVyduRoboty(nazvaVyduRoboty);}

    @Override
    public VydRoboty editVydRoboty (VydRoboty vydRoboty) {
        return vydRobotyRepository.saveAndFlush(vydRoboty);
    }

    @Override
    public List<VydRoboty> getAll() {
        return vydRobotyRepository.findAll();
    }
}
