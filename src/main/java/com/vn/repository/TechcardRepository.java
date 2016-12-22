package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Set;

@Repository
public interface TechcardRepository extends JpaRepository<Techcard, Long> {
    List<Techcard> findAllByInfoProVydannia(@Param("InfoProVydannia") InfoProVydannia infoProVydannia);
    List<Techcard> findAllByVydRobotySet(@Param("Set<VydRoboty>") Set<VydRoboty> vydRobotySet);
    List<Techcard> findAllByOsobystaInfoVykonavtsia(@Param("OsobystaInfoVykonavtsia") OsobystaInfoVykonavtsia osobystaInfoVykonavtsia);
    List<Techcard> findAllByTerminPochatku(@Param ("terminPochatku")Date terminPochatku);
    List<Techcard> findAllByTerminZakinchennia(@Param ("terminZakinchennia")Date terminZakinchennia);
    List<Techcard> findAllByFactychnyiPochatokBetween(@Param ("factychnyiPochatok1")Date factychnyiPochatok1, @Param ("factychnyiPochatok2")Date factychnyiPochatok2);
    List<Techcard> findAllByFactychnyiKinecBetween(@Param ("factychnyiKinec1")Date factychnyiKinec1,@Param ("factychnyiKinec1") Date factychnyiKinec2 );
    List<Techcard> findAllByVartistRoboty(@Param ("vartistRoboty")Double vartistRoboty );
    List<Techcard> findAllByVartistDruku(@Param ("vartistDruku")Double vartistDruku);
    List<Techcard> findAllBySumVartist(@Param ("sumVartist")Double sumVartist );

}