package com.vn.service;

import com.vn.entity.InfoProAvtora;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface InfoProAvtoraService {
    InfoProAvtora addInfoProAvtora(InfoProAvtora infoProAvtora);
    void delete(long idAvtora);
    InfoProAvtora getById(long idAvtora);
    List<InfoProAvtora> getAllByPrizvyshche(String prizvyshche);
    List<InfoProAvtora> getAllByImiia(String imiia);
    InfoProAvtora editInfoProAvtora(InfoProAvtora infoProAvtora);
    List<InfoProAvtora> getAll();
}
