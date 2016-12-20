package com.vn.service;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import com.vn.repository.TechcardRepository;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by nadezhda on 20.12.16.
 */
public interface TechcardService {
    Techcard addTechcard(Techcard techcard);
    void delete(Long idTechCarty);;
    Techcard getById(Long idTechCarty);
    Techcard editTechcard(Techcard techcard);
    List<Techcard> getAll();
    List<Techcard> getAllByIdVydannia(InfoProVydannia infoProVydannia);
    List<Techcard> getAllByIdVyduRoboty(Set<VydRoboty> vydRobotySet);
    List<Techcard> getAllByIdVykonavtsia(OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    List<Techcard> getDateTerminPochatku(Date terminPochatku);
    List<Techcard> getDateTerminZakinchennia(Date terminZakinchennia);
    List<Techcard> getDateFactychnyiPochatokBetween(Date factychnyiPochatok1, Date factychnyiPochatok2 );
    List<Techcard> getDateFactychnyiKinecBetween(Date factychnyiKinec1, Date factychnyiKinec2);
    List<Techcard> getAllByVartistRoboty(Double vartistRoboty);
    List<Techcard> getAllByVartistDruku(Double vartistDruku);
    List<Techcard> getAllBySumVartist(Double sumVartist);

}
