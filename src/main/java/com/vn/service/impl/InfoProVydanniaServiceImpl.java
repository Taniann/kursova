package com.vn.service.impl;

import com.vn.entity.InfoProAvtora;
import com.vn.entity.InfoProVydannia;
import com.vn.entity.VydVydannia;
import com.vn.repository.InfoProVydanniaRepository;
import com.vn.service.InfoProVydanniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class InfoProVydanniaServiceImpl implements InfoProVydanniaService {

    @Autowired
    private InfoProVydanniaRepository infoProVydanniaRepository;

    @Override
    public InfoProVydannia addInfoProVydannia(InfoProVydannia infoProVydannia) {
        InfoProVydannia savedInfoProVydannia = infoProVydanniaRepository.saveAndFlush(infoProVydannia);

        return savedInfoProVydannia;
    }

    @Override
    public void delete(long idVydannia) {
        infoProVydanniaRepository.delete(idVydannia);
    }

    @Override
    public InfoProVydannia getById(long idVydannia) {
        return infoProVydanniaRepository.findOne(idVydannia);
    }

    @Override
    public List<InfoProVydannia> getAllByPovnaNazva(String povnaNazva) {
        return infoProVydanniaRepository.findAllByPovnaNazva(povnaNazva);
    }

    @Override
    public List<InfoProVydannia> getAllByKorotkaNazva(String korotkaNazva) {
        return infoProVydanniaRepository.findAllByKorotkaNazva(korotkaNazva);
    }

    @Override
    public List<InfoProVydannia> getAllByVydVydannia(VydVydannia vydVydannia) {
        return infoProVydanniaRepository.findAllByVydVydannia(vydVydannia);
    }

    @Override
    public List<InfoProVydannia> getAllByInfoProAvtora1(InfoProAvtora infoProAvtora1) {
        return infoProVydanniaRepository.findAllByInfoProAvtora1(infoProAvtora1);
    }

    @Override
    public List<InfoProVydannia> getAllByInfoProAvtora2(InfoProAvtora infoProAvtora2) {
        return infoProVydanniaRepository.findAllByInfoProAvtora2(infoProAvtora2);
    }

    @Override
    public List<InfoProVydannia> getAllByInfoProAvtora3(InfoProAvtora infoProAvtora3) {
        return infoProVydanniaRepository.findAllByInfoProAvtora3(infoProAvtora3);
    }

    @Override
    public InfoProVydannia editInfoProVydannia(InfoProVydannia infoProVydannia) {
        return infoProVydanniaRepository.saveAndFlush(infoProVydannia);
    }

    @Override
    public List<InfoProVydannia> getAll() {
        return infoProVydanniaRepository.findAll();
    }
}
