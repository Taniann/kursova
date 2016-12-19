package com.vn.service;

import com.vn.entity.Techcard;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface TechcardService {

    Techcard addTechcard(Techcard techcard);
    void delete(long idTechCarty);
    Techcard getById(long idTechCarty);
    Techcard editTechcard(Techcard techcard);
    List<Techcard> getAll();
}
