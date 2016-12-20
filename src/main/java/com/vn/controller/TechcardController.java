package com.vn.controller;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Set;

/**
 * Created by nadezhda on 20.12.16.
 */
@RestController
@RequestMapping(path = "/tehkartka")
public class TechcardController {

    @Autowired
    private TechcardService techcardService;

    @RequestMapping(path = "/{id}")
    public Techcard getById(@PathVariable long id) {
        return techcardService.getById(id);
    }

    @RequestMapping(path = "/add")
    public Techcard addTechcard(@PathVariable Techcard techcard) {
        return techcardService.addTechcard(techcard);
    }

    @RequestMapping("/delete/{idTechCarty}")
    public void delete(@PathVariable("idTechCarty") Long idTechCarty) {

         techcardService.delete(idTechCarty);
    }

    @RequestMapping(path = "/edit")
    public Techcard editTechcard(@PathVariable Techcard techcard) {
        return techcardService.editTechcard(techcard);
    }

    @RequestMapping(path = "/all")
    public List<Techcard> getAll() {
        return techcardService.getAll();}

    @RequestMapping(path = "/idVydannia/{infoProVydannia}")
    public List<Techcard> getAllByInfoProVydannia(@PathVariable InfoProVydannia infoProVydannia) {
        return techcardService.getAllByInfoProVydannia(infoProVydannia);}

    @RequestMapping(path = "/idVyduRoboty/{vydRobotySet}")
    public List<Techcard> getAllByVydRobotySet(@PathVariable Set<VydRoboty> vydRobotySet) {
        return techcardService.getAllByVydRobotySet(vydRobotySet);
    }

    @RequestMapping(path = "/idVykonavtsia/{osobystaInfoVykonavtsia}")
    public List<Techcard> getAllByOsobystaInfoVykonavtsia(@PathVariable OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return techcardService.getAllByOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia);
    }


}

