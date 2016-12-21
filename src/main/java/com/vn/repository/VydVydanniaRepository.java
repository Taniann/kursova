package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.VydVydannia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VydVydanniaRepository extends JpaRepository<VydVydannia, Long> {
    VydVydannia findAllByNazvaVyduVydannia( String nazvaVyduVydannia);
}
