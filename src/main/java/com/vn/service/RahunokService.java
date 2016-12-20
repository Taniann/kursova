package com.vn.service;

import com.vn.entity.Rahunok;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface RahunokService {

    Rahunok addRahunok(Rahunok rahunok);
    void delete(long idRahunok);
    Rahunok getById(long idRahunok);
    Rahunok editRahunok(Rahunok rahunok);
    List<Rahunok> getAll();
}
