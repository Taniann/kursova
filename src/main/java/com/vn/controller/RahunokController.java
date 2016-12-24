package com.vn.controller;

import com.vn.entity.Rahunok;
import com.vn.service.InfoProVydanniaService;
import com.vn.service.RahunokService;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Таня on 21.12.2016.
 */
@RestController
@RequestMapping(path = "/rahunky")
public class RahunokController {
    @Autowired
    private RahunokService rahunokService;

    @Autowired
    private TechcardService techcardService;

    @Autowired
    private InfoProVydanniaService infoProVydanniaService;

    @RequestMapping(path = "/{id}")
    public Rahunok getById(@PathVariable long id) {return rahunokService.getById(id);}

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Rahunok addTechcard(@RequestBody Rahunok rahunok) {
        return rahunokService.addRahunok(rahunok);
    }

    @RequestMapping(value = "/delete/{idRahunku}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idRahunku") Long idRahunku) {

        rahunokService.delete(idRahunku);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public Rahunok editTechcard(@RequestBody Rahunok rahunok) {
        return rahunokService.editRahunok(rahunok);
    }

    @RequestMapping
    public List<Rahunok> getAll() {
        return rahunokService.getAll();}

    @RequestMapping(path = "/idTechCarty/{idTechCarty}")
    public List<Rahunok> getAllByTechcard(@PathVariable long idTechCarty) {
        return rahunokService.getAllByTechcard(techcardService.getById(idTechCarty));
    }

    @RequestMapping(path = "/idVydannia/{idVydannia}")
    public List<Rahunok> getAllByInfoProVydannia(@PathVariable long idVydannia) {
        return rahunokService.getAllByInfoProVydannia(infoProVydanniaService.getById(idVydannia));
    }

    @RequestMapping(path = "/dataVypysky/{dataVypysky}")
    public List<Rahunok> getAllDataVypysky(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date dataVypysky ) {
        return rahunokService.getAllByDataVypysky(dataVypysky);
    }

    @RequestMapping(path = "/zamovnyk")
    public List<Rahunok> getAllZamovnyk(@RequestParam(value="zamovnyk", required=true) String zamovnyk ) {
        return rahunokService.getAllByZamovnyk(zamovnyk);
    }


    @RequestMapping(path = "/dataSplaty/{dataSplaty}")
    public List<Rahunok> getAllDataSplaty(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date dataSplaty ) {
        return rahunokService.getAllByDataSplaty(dataSplaty);
    }

    @RequestMapping(path = "/vsohoDoSplaty/{vsohoDoSplaty}")
    public List<Rahunok> getAllByVsohoDoSplaty(@PathVariable Double vsohoDoSplaty ) {
        return rahunokService.getAllByVsohoDoSplaty(vsohoDoSplaty);
    }
}
