package com.vn.service.impl;

import com.vn.entity.VydVydannia;
import com.vn.repository.VydVydanniaRepository;
import com.vn.service.VydVydanniaService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public class VydVydanniaServiceImpl implements VydVydanniaService {

    @Autowired
    private VydVydanniaRepository vydVydanniaRepository;

    @Override
    public VydVydannia addVydVydannia(VydVydannia vydVydannia) {
        VydVydannia savedVydVydannia = vydVydanniaRepository.saveAndFlush(vydVydannia);

        return savedVydVydannia;
    }

    @Override
    public void delete(long idVydVydannia) {
        vydVydanniaRepository.delete(idVydVydannia);
    }

    @Override
    public VydVydannia getById(long idVydVydannia) {
        return vydVydanniaRepository.findById(idVydVydannia);
    }

    @Override
    public VydVydannia editVydVydannia (VydVydannia vydVydannia) {
        return vydVydanniaRepository.saveAndFlush(vydVydannia);
    }

    @Override
    public List<VydVydannia> getAll() {
        return vydVydanniaRepository.findAll();
    }
}
