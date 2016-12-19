package com.vn.service;

import com.vn.entity.VydObkladynky;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface VydObkladynkyService {

    VydObkladynky addVydObkladynky(VydObkladynky vydObkladynky);
    void delete(long idVydObkladynky);
    VydObkladynky getById(long idVydObkladynky);
    VydObkladynky editVydObkladynky(VydObkladynky vydObkladynky);
    List<VydObkladynky> getAll();
}
