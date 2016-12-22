package com.vn.service.impl;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.Rahunok;
import com.vn.entity.Techcard;
import com.vn.repository.RahunokRepository;
import com.vn.service.RahunokService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
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
        return rahunokRepository.findOne(idRahunok);
    }

    @Override
    public List<Rahunok> getAllByInfoProVydannia(InfoProVydannia infoProVydannia) {
        return rahunokRepository.findAllByInfoProVydannia(infoProVydannia);
    }
    @Override
    public List<Rahunok> getAllByTechcard(Techcard techcard) {
        return rahunokRepository.findAllByTechcard(techcard);
    }
    @Override
    public List<Rahunok> getAllByDataVypysky(Date dataVypysky) {
        return rahunokRepository.findAllByDataVypysky(dataVypysky);
    }
    @Override
    public List<Rahunok> getAllByVsohoDoSplaty(Double vsohoDoSplaty) {
        return rahunokRepository.findAllByVsohoDoSplaty(vsohoDoSplaty);
    }
    @Override
    public List<Rahunok> getAllByZamovnyk(String zamovnyk) {
        return rahunokRepository.findAllByZamovnyk(zamovnyk);
    }
    @Override
    public List<Rahunok> getAllByDataSplaty(Date dataSplatyy) {
        return rahunokRepository.findAllByDataSplaty(dataSplatyy);
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
