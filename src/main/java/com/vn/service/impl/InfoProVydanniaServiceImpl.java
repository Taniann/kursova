package com.vn.service.impl;

import com.vn.entity.InfoProVydannia;
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
    public InfoProVydannia editInfoProVydannia(InfoProVydannia infoProVydannia) {
        return infoProVydanniaRepository.saveAndFlush(infoProVydannia);
    }

    @Override
    public List<InfoProVydannia> getAll() {
        return infoProVydanniaRepository.findAll();
    }
}
