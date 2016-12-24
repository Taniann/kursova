package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long> {
    List<Format> findOneByNazvaFormatu(@Param("nazvaFormatu") String nazvaFormatu);

}
