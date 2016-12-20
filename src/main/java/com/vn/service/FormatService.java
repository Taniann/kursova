package com.vn.service;

import com.vn.entity.Format;

import java.util.List;

/**
 * Created by Таня on 19.12.2016.
 */
public interface FormatService {
    Format addFormat(Format format);
    void delete(long idFormatu);
    Format getById(long idFormatu);
    Format getByNazvaFormatu(String nazvaFormatu);
    Format editFormat(Format format);
    List<Format> getAll();
}
