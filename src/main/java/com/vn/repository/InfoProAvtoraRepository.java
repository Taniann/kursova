package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.InfoProAvtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface InfoProAvtoraRepository extends JpaRepository<InfoProAvtora, Long> {
    @Query()
    InfoProAvtora findById(@Param("idAvtora") long idAvtora);
}
