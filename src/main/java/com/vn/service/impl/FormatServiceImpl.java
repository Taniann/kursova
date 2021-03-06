package com.vn.service.impl;

import com.vn.entity.Format;
import com.vn.repository.FormatRepository;
import com.vn.service.FormatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class FormatServiceImpl implements FormatService{

    @Autowired
    private FormatRepository formatRepository;

    @Override
    public Format addFormat(Format format) {
        Format savedFormat = formatRepository.saveAndFlush(format);

        return savedFormat;
    }

    @Override
    public void delete(long idFormatu) {
        formatRepository.delete(idFormatu);
    }

    @Override
    public Format getById(long idFormatu) {return formatRepository.findOne(idFormatu);}

    @Override
    public List<Format> getOneByNazvaFormatu(String nazvaFormatu) {return formatRepository.findOneByNazvaFormatu(nazvaFormatu);}

    @Override
    public Format editFormat(Format format) {
        return formatRepository.saveAndFlush(format);
    }

    @Override
    public List<Format> getAll() {
        return formatRepository.findAll();
    }
}
