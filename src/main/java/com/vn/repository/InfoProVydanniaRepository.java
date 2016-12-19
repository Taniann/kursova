package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.InfoProVydannia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InfoProVydanniaRepository extends JpaRepository<InfoProVydannia, Long> {
    @Query()
    InfoProVydannia findById(@Param("idVydannia") long idVydannia);
}
