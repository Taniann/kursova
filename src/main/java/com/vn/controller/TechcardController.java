package com.vn.controller;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

/**
 * Created by nadezhda on 20.12.16.
 */
@RestController
@RequestMapping(path = "/tehcards")
public class TechcardController {

    @Autowired
    private TechcardService techcardService;

    @RequestMapping(path = "/{id}")
    public Techcard getById(@PathVariable long id) {
        return techcardService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Techcard addTechcard(@RequestBody Techcard techcard) {
        return techcardService.addTechcard(techcard);
    }

    @RequestMapping(value = "/delete/{idTechCarty}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idTechCarty") Long idTechCarty) {

         techcardService.delete(idTechCarty);
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public Techcard editTechcard(@RequestBody Techcard techcard) {
        return techcardService.editTechcard(techcard);
    }

    @RequestMapping
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

