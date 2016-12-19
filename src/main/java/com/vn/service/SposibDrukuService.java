package com.vn.service;

import com.vn.entity.SposibDruku;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface SposibDrukuService {

    SposibDruku addSposibDruku(SposibDruku sposibDruku);
    void delete(long idSposobuDruku);
    SposibDruku getById(long idSposobuDruku);
    SposibDruku editSposibDruku(SposibDruku sposibDruku);
    List<SposibDruku> getAll();
}
