package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.Rahunok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RahunokRepository extends JpaRepository<Rahunok, Long> {

    @Query()
    Rahunok findById(@Param("idRahunok") long idRahunok);
}
