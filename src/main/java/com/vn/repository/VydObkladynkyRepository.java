package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.VydObkladynky;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface VydObkladynkyRepository extends JpaRepository<VydObkladynky, Long> {

    @Query()
    VydObkladynky findById(@Param("idVydObkladynky") long idVydObkladynky);
}