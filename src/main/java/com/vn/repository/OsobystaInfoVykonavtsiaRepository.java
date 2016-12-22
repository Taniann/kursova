package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Pidrozdil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface OsobystaInfoVykonavtsiaRepository extends JpaRepository<OsobystaInfoVykonavtsia, Long> {
    List<OsobystaInfoVykonavtsia> findAllByIdentyfKod(@Param("identyfKod") long identyfKod);
    List<OsobystaInfoVykonavtsia> findAllByPib(@Param("pib") String pib);
    List<OsobystaInfoVykonavtsia> findAllByDataPryiomuNaRobotuBetween(@Param("dataPryiomuNaRobotu1") Date dataPryiomuNaRobotu1,
                                                                      @Param("dataPryiomuNaRobotu2") Date dataPryiomuNaRobotu2);
    List<OsobystaInfoVykonavtsia> findAllByPidrozdil(@Param("pidrozdil") Pidrozdil pidrozdil);


}
