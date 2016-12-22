package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.InfoProVydannia;
import com.vn.entity.Rahunok;
import com.vn.entity.Techcard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository

public interface RahunokRepository extends JpaRepository<Rahunok, Long> {
    List<Rahunok> findAllByInfoProVydannia( InfoProVydannia infoProVydannia);
    List<Rahunok> findAllByTechcard( Techcard techcard);
    List<Rahunok> findAllByDataVypysky( Date dataVypysky);
    List<Rahunok> findAllByVsohoDoSplaty(Double vsohoDoSplaty);
    List<Rahunok> findAllByZamovnyk(String zamovnyk);
    List<Rahunok> findAllByDataSplaty(Date dataSplaty);
    List<Rahunok> findAllByPlatizhneDoruchennia(String platizhneDoruchennia);
    List<Rahunok> findAllByVartistPosluh(Double vartistPosluh);
    List<Rahunok> findAllByVartistMaterialiv(Double vartistMaterialiv);
}
