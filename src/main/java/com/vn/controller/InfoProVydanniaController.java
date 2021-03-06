package com.vn.controller;

import com.vn.entity.InfoProAvtora;
import com.vn.entity.InfoProVydannia;
import com.vn.entity.VydVydannia;
import com.vn.service.InfoProAvtoraService;
import com.vn.service.InfoProVydanniaService;
import com.vn.service.VydVydanniaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Таня on 21.12.2016.
 */
@RestController
@RequestMapping(path = "/infoProVydannia")
public class InfoProVydanniaController {
    @Autowired
    private InfoProVydanniaService infoProVydanniaService;

    @Autowired
    private VydVydanniaService vydVydanniaService;

    @Autowired
    private InfoProAvtoraService infoProAvtoraService;

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

    @RequestMapping(path = "/povnaNazva")
    public List<InfoProVydannia> getAllByPovnaNazva(@RequestParam(value="povnaNazva", required=true) String povnaNazva) {
        return infoProVydanniaService.getAllByPovnaNazva(povnaNazva);}

    @RequestMapping(path = "/korotkaNazva")
    public InfoProVydannia getOneByKorotkaNazva(@RequestParam(value="korotkaNazva", required=true) String korotkaNazva) {
        return infoProVydanniaService.getOneByKorotkaNazva(korotkaNazva);}

    @RequestMapping(path = "/idVyduVydannia/{idVyduVydannia}")
    public List<InfoProVydannia> getAllByVydVydannia(@PathVariable long idVyduVydannia) {
        return infoProVydanniaService.getAllByVydVydannia(vydVydanniaService.getById(idVyduVydannia));
    }

    @RequestMapping(path = "idAvtora1/{idAvtora1}")
    public List<InfoProVydannia> getAllByInfoProAvtora1(@PathVariable Long idAvtora) {
        return infoProVydanniaService.getAllByInfoProAvtora1(infoProAvtoraService.getById(idAvtora));
    }

    @RequestMapping(path = "idAvtora2/{idAvtora2}")
    public List<InfoProVydannia> getAllByInfoProAvtora2(@PathVariable Long idAvtora) {
        return infoProVydanniaService.getAllByInfoProAvtora2(infoProAvtoraService.getById(idAvtora));
    }

    @RequestMapping(path = "idAvtora3/{idAvtora3}")
    public List<InfoProVydannia> getAllByInfoProAvtora3(@PathVariable Long idAvtora) {
        return infoProVydanniaService.getAllByInfoProAvtora3(infoProAvtoraService.getById(idAvtora));
    }

    @RequestMapping(path = "/names")
    public Set<String> getAllNames() {
        return infoProVydanniaService.getAll().stream().map(InfoProVydannia::getKorotkaNazva).collect(Collectors.toSet());}

}
