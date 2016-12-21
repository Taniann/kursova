package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.Pidrozdil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PidrozdilRepository extends JpaRepository<Pidrozdil, Long> {
    Pidrozdil findByNazvaPidrozdilu(@Param("nazvaPidrozdilu") String nazvaPidrozdilu);
}