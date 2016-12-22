package com.vn.controller;

import com.vn.entity.InfoProAvtora;
import com.vn.entity.InfoProVydannia;
import com.vn.entity.VydVydannia;
import com.vn.service.InfoProVydanniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Таня on 21.12.2016.
 */
@RestController
@RequestMapping(path = "/infoProVydannia")
public class InfoProVydanniaController {
    @Autowired
    private InfoProVydanniaService infoProVydanniaService;

    @RequestMapping(path = "/{idVydannia}")
    public InfoProVydannia getById(@PathVariable long idVydannia) {
        return infoProVydanniaService.getById(idVydannia);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public InfoProVydannia addInfoProVydannia(@RequestBody InfoProVydannia infoProVydannia) {
        return infoProVydanniaService.addInfoProVydannia(infoProVydannia);
    }

    @RequestMapping(value = "/delete/{idVydannia}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idVydannia") Long idVydannia) {

        infoProVydanniaService.delete(idVydannia);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public InfoProVydannia editInfoProVydannia(@RequestBody InfoProVydannia infoProVydannia) {
        return infoProVydanniaService.editInfoProVydannia(infoProVydannia);
    }

    @RequestMapping
    public List<InfoProVydannia> getAll() {
        return infoProVydanniaService.getAll();}

    @RequestMapping(path = "/{povnaNazva}")
    public List<InfoProVydannia> getAllByPovnaNazva(@PathVariable String povnaNazva) {
        return infoProVydanniaService.getAllByPovnaNazva(povnaNazva);}

    @RequestMapping(path = "/{korotkaNazva}")
    public List<InfoProVydannia> getAllByKorotkaNazva(@PathVariable String korotkaNazva) {
        return infoProVydanniaService.getAllByKorotkaNazva(korotkaNazva);}

    @RequestMapping(path = "/{vydVydannia}")
    public List<InfoProVydannia> getAllByVydVydannia(@PathVariable VydVydannia vydVydannia) {
        return infoProVydanniaService.getAllByVydVydannia(vydVydannia);}

    @RequestMapping(path = "/{infoProAvtora1}")
    public List<InfoProVydannia> getAllByInfoProAvtora1(@PathVariable InfoProAvtora infoProAvtora1) {
        return infoProVydanniaService.getAllByInfoProAvtora1(infoProAvtora1);}

    @RequestMapping(path = "/{infoProAvtora2}")
    public List<InfoProVydannia> getAllByInfoProAvtora2(@PathVariable InfoProAvtora infoProAvtora2) {
        return infoProVydanniaService.getAllByInfoProAvtora2(infoProAvtora2);}

    @RequestMapping(path = "/{infoProAvtora3}")
    public List<InfoProVydannia> getAllByInfoProAvtora3(@PathVariable InfoProAvtora infoProAvtora3) {
        return infoProVydanniaService.getAllByInfoProAvtora3(infoProAvtora3);}
}
