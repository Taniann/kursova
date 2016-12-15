package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */
import com.vn.entity.Techcard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechcardRepository extends JpaRepository<Techcard, Long> {
}