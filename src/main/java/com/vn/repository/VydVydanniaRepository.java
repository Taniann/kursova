package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.VydVydannia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VydVydanniaRepository extends JpaRepository<VydVydannia, Long> {

    @Query()
    VydVydannia findById(@Param("idVydVydannia") long idVydVydannia);
}
