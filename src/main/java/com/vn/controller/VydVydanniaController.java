package com.vn.controller;

import com.vn.entity.VydVydannia;
import com.vn.service.VydVydanniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nadezhda on 21.12.16.
 */
@RestController
@RequestMapping(path = "/vydyVydannia")
public class VydVydanniaController {

    @Autowired
    private VydVydanniaService vydVydanniaService;

    @RequestMapping(path = "/{id}")
    public VydVydannia getById(@PathVariable long id) {
        return vydVydanniaService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public VydVydannia addVydVydannia(@RequestBody VydVydannia vydVydannia) {
        return vydVydanniaService.addVydVydannia(vydVydannia);
    }

    @RequestMapping(value = "/delete/{idVyduVydannia}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idVyduVydannia") Long idVyduVydannia) {

        vydVydanniaService.delete(idVyduVydannia);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public VydVydannia editVydVydannia(@RequestBody VydVydannia vydVydannia) {
        return vydVydanniaService.editVydVydannia(vydVydannia);
    }

    @RequestMapping
    public List<VydVydannia> getAll() {
        return vydVydanniaService.getAll();}

    @RequestMapping(path = "/nazvaVyduVydannia")
    public VydVydannia getOneByNazvaVyduVydannia(@RequestParam(value="nazvaVyduVydannia", required=true) String nazvaVyduVydannia) {
        return vydVydanniaService.getOneByNazvaVyduVydannia(nazvaVyduVydannia);}
}


