package com.vn.service;

import com.vn.entity.VydRoboty;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface VydRobotyService {

    VydRoboty addVydRoboty(VydRoboty vydRoboty);
    void delete(long idVydRoboty);
    VydRoboty getById(long idVydRoboty);
    VydRoboty getAllByNazvaVyduRoboty( String nazvaVyduRoboty);
    VydRoboty editVydRoboty(VydRoboty vydRoboty);
    List<VydRoboty> getAll();
}
