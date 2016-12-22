package com.vn.service;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.Rahunok;
import com.vn.entity.Techcard;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface RahunokService {

    Rahunok addRahunok(Rahunok rahunok);
    void delete(long idRahunok);
    Rahunok getById(long idRahunok);
    List<Rahunok> getAllByInfoProVydannia(InfoProVydannia infoProVydannia);
    List<Rahunok> getAllByTechcard(Techcard techcard);
    List<Rahunok> getAllByDataVypysky(Date dataVypysky);
    List<Rahunok> getAllByVsohoDoSplaty(Double vsohoDoSplaty);
    List<Rahunok> getAllByZamovnyk(String zamovnyk);
    List<Rahunok> getAllByDataSplaty(Date dataSplaty);
    Rahunok editRahunok(Rahunok rahunok);
    List<Rahunok> getAll();
}
