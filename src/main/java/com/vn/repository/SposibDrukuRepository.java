package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.SposibDruku;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SposibDrukuRepository extends JpaRepository<SposibDruku, Long> {
    SposibDruku findAllByNazvaSposobuDruku( String nazvaSposobuDruku);
}
