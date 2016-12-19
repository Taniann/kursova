package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.SposibDruku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SposibDrukuRepository extends JpaRepository<SposibDruku, Long> {

    @Query()
    SposibDruku findById(@Param("idSposobuDruku") long idSposobuDruku);
}
