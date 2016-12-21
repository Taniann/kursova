package com.vn.service;

import com.vn.entity.VydVydannia;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface VydVydanniaService {
    VydVydannia addVydVydannia(VydVydannia vydVydannia);
    void delete(long idVydVydannia);
    VydVydannia getById(long idVydVydannia);
    VydVydannia getAllByNazvaVyduVydannia( String nazvaVyduVydannia);
    VydVydannia editVydVydannia(VydVydannia vydVydannia);
    List<VydVydannia> getAll();
}
