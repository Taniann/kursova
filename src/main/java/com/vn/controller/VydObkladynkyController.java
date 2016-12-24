package com.vn.controller;

import com.vn.entity.VydObkladynky;
import com.vn.service.VydObkladynkyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nadezhda on 21.12.16.
 */
@RestController
@RequestMapping(path = "/vydyObkladynky")
public class VydObkladynkyController {
    @Autowired
    private VydObkladynkyService vydObkladynkyService;

    @RequestMapping(path = "/{id}")
    public VydObkladynky getById(@PathVariable long id) {
        return vydObkladynkyService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public VydObkladynky addVydObkladynky(@RequestBody VydObkladynky vydObkladynky) {
        return vydObkladynkyService.addVydObkladynky(vydObkladynky);
    }

    @RequestMapping(value = "/delete/{idVyduObkladynky}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idVyduObkladynky") Long idVyduObkladynky) {

        vydObkladynkyService.delete(idVyduObkladynky);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public VydObkladynky editVydObkladynky(@RequestBody VydObkladynky vydObkladynky) {
        return vydObkladynkyService.editVydObkladynky(vydObkladynky);
    }

    @RequestMapping
    public List<VydObkladynky> getAll() {
        return vydObkladynkyService.getAll();}

    @RequestMapping(path = "/nazvaVyduObkladynky")
    public VydObkladynky getOneByNazvaVyduObkladynky(@RequestParam(value="nazvaVyduObkladynky", required=true) String nazvaVyduObkladynky) {
        return vydObkladynkyService.getOneByNazvaVyduObkladynky(nazvaVyduObkladynky);}

}
