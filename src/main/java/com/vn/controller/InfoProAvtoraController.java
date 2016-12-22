package com.vn.controller;

import com.vn.entity.InfoProAvtora;
import com.vn.service.InfoProAvtoraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Таня on 21.12.2016.
 */

@RestController
@RequestMapping(path = "/infoProAvtora")
public class InfoProAvtoraController {
    @Autowired
    private InfoProAvtoraService infoProAvtoraService;

    @RequestMapping(path = "/{idAvtora}")
    public InfoProAvtora getById(@PathVariable long idAvtora) {
        return infoProAvtoraService.getById(idAvtora);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public InfoProAvtora addInfoProAvtora(@RequestBody InfoProAvtora infoProAvtora) {
        return infoProAvtoraService.addInfoProAvtora(infoProAvtora);
    }

    @RequestMapping(value = "/delete/{idAvtora}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idAvtora") Long idAvtora) {

        infoProAvtoraService.delete(idAvtora);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public InfoProAvtora editInfoProAvtora(@RequestBody InfoProAvtora infoProAvtora) {
        return infoProAvtoraService.editInfoProAvtora(infoProAvtora);
    }

    @RequestMapping
    public List<InfoProAvtora> getAll() {
        return infoProAvtoraService.getAll();}

    @RequestMapping(path = "/{prizvyshche}")
    public List<InfoProAvtora> getAllByPrizvyshche(@PathVariable String prizvyshche) {
        return infoProAvtoraService.getAllByPrizvyshche(prizvyshche);}

    @RequestMapping(path = "/{imiia}")
    public List<InfoProAvtora> getAllByImiia(@PathVariable String imiia) {
        return infoProAvtoraService.getAllByImiia(imiia);}
}
