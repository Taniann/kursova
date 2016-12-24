package com.vn.controller;

import com.vn.entity.Pidrozdil;
import com.vn.service.PidrozdilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Таня on 21.12.2016.
 */
@RestController
@RequestMapping(path = "/pidrozdil")
public class PidrozdilController {

@Autowired
private PidrozdilService pidrozdilService;

    @RequestMapping(path = "/{id}")
    public Pidrozdil getById(@PathVariable long idPidrozdilu) {
        return pidrozdilService.getById(idPidrozdilu);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Pidrozdil addPidrozdil(@RequestBody Pidrozdil pidrozdil) {
        return pidrozdilService.addPidrozdil(pidrozdil);
    }

    @RequestMapping(value = "/delete/{idPidrozdilu}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idPidrozdilu") Long idPidrozdilu) {

        pidrozdilService.delete(idPidrozdilu);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public Pidrozdil editPidrozdil(@RequestBody Pidrozdil pidrozdil) {
        return pidrozdilService.editPidrozdil(pidrozdil);
    }

    @RequestMapping
    public List<Pidrozdil> getAll() {
        return pidrozdilService.getAll();}

    @RequestMapping(path = "/nazvaPidrozdilu")
    public Pidrozdil getOneByNazvaPidrozdilu(@RequestParam(value="nazvaPidrozdilu", required=true) String nazvaPidrozdilu) {
        return pidrozdilService.getOneByNazvaPidrozdilu(nazvaPidrozdilu);}
}
