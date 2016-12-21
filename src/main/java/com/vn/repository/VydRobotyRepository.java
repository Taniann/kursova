package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.VydRoboty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VydRobotyRepository extends JpaRepository<VydRoboty, Long> {
    VydRoboty findAllByNazvaVyduRoboty( String nazvaVyduRoboty);
}
