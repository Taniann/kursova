package com.vn.controller;

import com.vn.entity.SposibDruku;
import com.vn.service.SposibDrukuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nadezhda on 21.12.16.
 */
@RestController
@RequestMapping(path = "/sposobyDruku")
public class SposibDrukuController {
    @Autowired
    private SposibDrukuService sposibDrukuService;

    @RequestMapping(path = "/{id}")
    public SposibDruku getById(@PathVariable long id) {
        return sposibDrukuService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public SposibDruku addSposibDruku(@RequestBody SposibDruku sposibDruku) {
        return sposibDrukuService.addSposibDruku(sposibDruku);
    }

    @RequestMapping(value = "/delete/{idSposobuDruku}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idSposobuDruku") Long idSposobuDruku) {

        sposibDrukuService.delete(idSposobuDruku);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public SposibDruku editSposibDruku(@RequestBody SposibDruku sposibDruku) {
        return sposibDrukuService.editSposibDruku(sposibDruku);
    }

    @RequestMapping
    public List<SposibDruku> getAll() {
        return sposibDrukuService.getAll();}

    @RequestMapping(path = "/nazvaSposobuDruku/{nazvaSposobuDruku}")
    public SposibDruku getAllByNazvaSposobuDruku(@PathVariable String nazvaSposobuDruku) {
        return sposibDrukuService.getAllByNazvaSposobuDruku(nazvaSposobuDruku);
    }
}
