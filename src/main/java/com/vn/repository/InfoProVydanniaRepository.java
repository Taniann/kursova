package com.vn.repository;

/**
 * Created by Таня on 12.12.2016.
 */

import com.vn.entity.InfoProAvtora;
import com.vn.entity.InfoProVydannia;
import com.vn.entity.VydVydannia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InfoProVydanniaRepository extends JpaRepository<InfoProVydannia, Long> {
    List<InfoProVydannia> findAllByPovnaNazva(@Param("povnaNazva") String povnaNazva);
    List<InfoProVydannia> findAllByKorotkaNazva(@Param("korotkaNazva") String korotkaNazva);
    List<InfoProVydannia> findAllByVydVydannia(@Param("vydVydannia") VydVydannia vydVydannia);
    List<InfoProVydannia> findAllByInfoProAvtora1(@Param("infoProAvtora1") InfoProAvtora infoProAvtora1);
    List<InfoProVydannia> findAllByInfoProAvtora2(@Param("infoProAvtora2") InfoProAvtora infoProAvtora2);
    List<InfoProVydannia> findAllByInfoProAvtora3(@Param("infoProAvtora3") InfoProAvtora infoProAvtora3);

}
