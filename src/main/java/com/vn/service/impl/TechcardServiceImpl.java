package com.vn.service.impl;

import com.vn.entity.Techcard;
import com.vn.repository.TechcardRepository;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class TechcardServiceImpl implements TechcardService {

    @Autowired
    private TechcardRepository techcardRepository;

    @Override
    public Techcard addTechcard(Techcard techcard) {
        Techcard savedTechcard = techcardRepository.saveAndFlush(techcard);

        return savedTechcard;
    }

    @Override
    public void delete(long idTechCarty) {
        techcardRepository.delete(idTechCarty);
    }

    @Override
    public Techcard getById(long idTechCarty) {
        return techcardRepository.findById(idTechCarty);
    }

    @Override
    public Techcard editTechcard(Techcard techcard) {
        return techcardRepository.saveAndFlush(techcard);
    }

    @Override
    public List<Techcard> getAll() {
        return techcardRepository.findAll();
    }
}
