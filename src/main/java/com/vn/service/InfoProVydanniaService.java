package com.vn.service;

import com.vn.entity.InfoProVydannia;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface InfoProVydanniaService {
    InfoProVydannia addInfoProVydannia(InfoProVydannia infoProVydannia);
    void delete(long idVydannia);
    InfoProVydannia getById(long idVydannia);
    InfoProVydannia editInfoProVydannia(InfoProVydannia infoProVydannia);
    List<InfoProVydannia> getAll();
}
