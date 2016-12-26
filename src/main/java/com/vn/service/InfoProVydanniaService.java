package com.vn.service;

import com.vn.entity.InfoProAvtora;
import com.vn.entity.InfoProVydannia;
import com.vn.entity.VydVydannia;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface InfoProVydanniaService {
    InfoProVydannia addInfoProVydannia(InfoProVydannia infoProVydannia);
    void delete(long idVydannia);
    InfoProVydannia getById(long idVydannia);
    List<InfoProVydannia> getAllByPovnaNazva(String povnaNazva);
    InfoProVydannia getOneByKorotkaNazva(String korotkaNazva);
    List<InfoProVydannia> getAllByVydVydannia(VydVydannia vydVydannia);
    List<InfoProVydannia> getAllByInfoProAvtora1(InfoProAvtora infoProAvtora1);
    List<InfoProVydannia> getAllByInfoProAvtora2(InfoProAvtora infoProAvtora2);
    List<InfoProVydannia> getAllByInfoProAvtora3(InfoProAvtora infoProAvtora3);
    InfoProVydannia editInfoProVydannia(InfoProVydannia infoProVydannia);
    List<InfoProVydannia> getAll();
}
