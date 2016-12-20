package com.vn.service.impl;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import com.vn.repository.TechcardRepository;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by nadezhda on 20.12.16.
 */
@Service
public class TechcardServiceImpl implements TechcardService {

    @Autowired
    //  @Qualifier(value = "TechcardRepository")
    private TechcardRepository techcardRepository;//!!!!!!

    @Override
    public Techcard addTechcard(Techcard techcard) {
        Techcard savedTechcard = techcardRepository.saveAndFlush(techcard);

        return savedTechcard;
    }

    @Override
    public void delete(Long idTechCarty) {
        techcardRepository.delete(idTechCarty);
    }

    @Override
    public Techcard getById(Long idTechCarty) {
        return techcardRepository.findOne(idTechCarty);
    }

    @Override
    public Techcard editTechcard(Techcard techcard) {
        return techcardRepository.saveAndFlush(techcard);
    }

    @Override
    public List<Techcard> getAll() {
        return techcardRepository.findAll();
    }

    @Override
    public List<Techcard> getAllByInfoProVydannia(InfoProVydannia infoProVydannia) {
        return techcardRepository.findAllByInfoProVydannia(infoProVydannia);
    }

    @Override
    public List<Techcard> getAllByVydRobotySet(Set<VydRoboty> vydRobotySet) {
        return techcardRepository.findAllByVydRobotySet(vydRobotySet);

    }

    @Override
    public List<Techcard> getAllByOsobystaInfoVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return techcardRepository.findAllByOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia);

    }

    @Override
    public List<Techcard> getAllTerminPochatku(Date terminPochatku) {
        return techcardRepository.findAllByTerminPochatku(terminPochatku);

    }
    @Override
    public List<Techcard> getAllTerminZakinchennia(Date terminZakinchennia) {
        return techcardRepository.findAllByTerminZakinchennia(terminZakinchennia);

    }

    @Override
    public List<Techcard> getAllFactychnyiPochatokBetween(Date factychnyiPochatok1, Date factychnyiPochatok2) {
        return techcardRepository.findAllByFactychnyiPochatokBetween(factychnyiPochatok1, factychnyiPochatok2);

    }
    @Override
    public List<Techcard> getAllFactychnyiKinecBetween(Date factychnyiKinec1, Date factychnyiKinec2) {
        return techcardRepository.findAllByFactychnyiKinecBetween(factychnyiKinec1, factychnyiKinec2);

    }

    @Override
    public List<Techcard> getAllByVartistRoboty(Double vartistRoboty) {
        return techcardRepository.findAllByVartistRoboty(vartistRoboty);

    }

    @Override
    public List<Techcard> getAllByVartistDruku(Double vartistDruku) {
        return techcardRepository.findAllByVartistDruku(vartistDruku);

    }

    @Override
    public List<Techcard> getAllBySumVartist(Double sumVartist) {
        return techcardRepository.findAllBySumVartist(sumVartist);

    }
}


