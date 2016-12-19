package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.OsobystaInfoVykonavtsia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OsobystaInfoVykonavtsiaRepository extends JpaRepository<OsobystaInfoVykonavtsia, Long> {

    @Query()
    OsobystaInfoVykonavtsia findById(@Param("idVykonavcia") long idVykonavcia);
}
