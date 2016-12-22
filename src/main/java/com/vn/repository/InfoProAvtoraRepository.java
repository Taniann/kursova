package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.InfoProAvtora;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoProAvtoraRepository extends JpaRepository<InfoProAvtora, Long> {
    List<InfoProAvtora> findAllByPrizvyshche(@Param("prizvyshche") String prizvyshche);
    List<InfoProAvtora> findAllByImiia(@Param("imiia") String imiia);

}
