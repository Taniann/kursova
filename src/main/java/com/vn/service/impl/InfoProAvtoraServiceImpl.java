package com.vn.service.impl;

import com.vn.entity.InfoProAvtora;
import com.vn.repository.InfoProAvtoraRepository;
import com.vn.service.InfoProAvtoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
@Service
public class InfoProAvtoraServiceImpl implements InfoProAvtoraService {

    @Autowired
    private InfoProAvtoraRepository infoProAvtoraRepository;

    @Override
    public InfoProAvtora addInfoProAvtora(InfoProAvtora infoProAvtora) {
        InfoProAvtora savedInfoProAvtora = infoProAvtoraRepository.saveAndFlush(infoProAvtora);

        return savedInfoProAvtora;
    }

    @Override
    public void delete(long idAvtora) {
        infoProAvtoraRepository.delete(idAvtora);
    }

    @Override
    public InfoProAvtora getById(long idAvtora) {
        return infoProAvtoraRepository.findOne(idAvtora);
    }

    @Override
    public List<InfoProAvtora> getAllByPrizvyshche(String prizvyshche) {
        return infoProAvtoraRepository.findAllByPrizvyshche(prizvyshche);
    }

    @Override
    public List<InfoProAvtora> getAllByImiia(String imiia) {
        return infoProAvtoraRepository.findAllByImiia(imiia);
    }

    @Override
    public InfoProAvtora editInfoProAvtora(InfoProAvtora infoProAvtora) {
        return infoProAvtoraRepository.saveAndFlush(infoProAvtora);
    }

    @Override
    public List<InfoProAvtora> getAll() {
        return infoProAvtoraRepository.findAll();
    }
}
