package com.vn.controller;

import com.vn.entity.VydRoboty;
import com.vn.service.VydRobotyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by nadezhda on 21.12.16.
 */
@RestController
@RequestMapping(path = "/vydyRoboty")
public class VydRobotyController {
    @Autowired
    private VydRobotyService vydRobotyService;

    @RequestMapping(path = "/{id}")
    public VydRoboty getById(@PathVariable long id) {
        return vydRobotyService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public VydRoboty addVydRoboty(@RequestBody VydRoboty vydRoboty) {
        return vydRobotyService.addVydRoboty(vydRoboty);
    }

    @RequestMapping(value = "/delete/{idVyduRoboty}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idVyduRoboty") Long idVyduRoboty) {

        vydRobotyService.delete(idVyduRoboty);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public VydRoboty editVydRoboty(@RequestBody VydRoboty vydRoboty) {
        return vydRobotyService.editVydRoboty(vydRoboty);
    }

    @RequestMapping
    public List<VydRoboty> getAll() {
        return vydRobotyService.getAll();}

    @RequestMapping(path = "/nazvaVyduRoboty")
    public VydRoboty getOneByNazvaVyduRoboty(@RequestParam(value="nazvaVyduRoboty", required=true) String nazvaVyduRoboty) {
        return vydRobotyService.getOneByNazvaVyduRoboty(nazvaVyduRoboty);}
}
