package com.vn.service;

import com.vn.entity.Pidrozdil;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface PidrozdilService {
    Pidrozdil addPidrozdil(Pidrozdil pidrozdil);
    void delete(long idPidrozdilu);
    Pidrozdil getById(Long idPidrozdilu);
    Pidrozdil getOneByNazvaPidrozdilu (String nazvaPidrozdilu);
    Pidrozdil editPidrozdil(Pidrozdil pidrozdil);
    List<Pidrozdil> getAll();
}
