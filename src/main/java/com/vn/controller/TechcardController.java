package com.vn.controller;

import com.vn.entity.InfoProVydannia;
import com.vn.entity.OsobystaInfoVykonavtsia;
import com.vn.entity.Techcard;
import com.vn.entity.VydRoboty;
import com.vn.service.InfoProVydanniaService;
import com.vn.service.TechcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * Created by nadezhda on 20.12.16.
 */
@RestController
@RequestMapping(path = "/techcards")
public class TechcardController {

    @Autowired
    private TechcardService techcardService;
    @Autowired
    private InfoProVydanniaService infoProVydanniaService;


    @RequestMapping(path = "/{id}")
    public Techcard getById(@PathVariable long id) {
        return techcardService.getById(id);
    }

    @RequestMapping(path = "/add", method = RequestMethod.POST)
    public Techcard addTechcard(@RequestBody Techcard techcard) {
        return techcardService.addTechcard(techcard);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    public String delete(@RequestBody Techcard techcard) {

         techcardService.delete(techcard.getIdTechCarty());
        return "{\n" +
                "  \"data\": []\n" +
                "}";
    }

    @RequestMapping(path = "/edit", method = RequestMethod.POST)
    public Techcard editTechcard(@RequestBody Techcard techcard) {
        return techcardService.editTechcard(techcard);
    }

    @RequestMapping
    public List<Techcard> getAll() {
        return techcardService.getAll();}

    @RequestMapping(path = "/idVydannia/{idVydannia}")
    public List<Techcard> getAllByInfoProVydannia(@PathVariable long idVydannia) {
        return techcardService.getAllByInfoProVydannia(infoProVydanniaService.getById(idVydannia));
    }

    @RequestMapping(path = "/idVyduRoboty/{idVyduRoboty}")
    public List<Techcard> getAllByVydRobotySet(@PathVariable Set<VydRoboty> vydRobotySet) {
        return techcardService.getAllByVydRobotySet(vydRobotySet);
    }

    @RequestMapping(path = "/idVykonavtsia/{idVykonavtsia}")
    public List<Techcard> getAllByOsobystaInfoVykonavtsia(@PathVariable OsobystaInfoVykonavtsia osobystaInfoVykonavtsia) {
        return techcardService.getAllByOsobystaInfoVykonavtsia(osobystaInfoVykonavtsia);
    }

    @RequestMapping(path = "/terminPochatku/{terminPochatku}")
    public List<Techcard> getAllTerminPochatku(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date terminPochatku ) {
        return techcardService.getAllTerminPochatku(terminPochatku);
    }

    @RequestMapping(path = "/terminZakinchennia/{terminZakinchennia}")
    public List<Techcard> getAllTerminZakinchennia(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date terminZakinchennia ) {
        return techcardService.getAllTerminZakinchennia(terminZakinchennia);
    }

    @RequestMapping(path = "/factychnyiPochatok1,factychnyiPochatok2/{factychnyiPochatok1,factychnyiPochatok2 }")
    public List<Techcard> getAllFactychnyiPochatokBetween(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date factychnyiPochatok1, @PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date factychnyiPochatok2 ) {
        return techcardService.getAllFactychnyiPochatokBetween(factychnyiPochatok1,factychnyiPochatok2);
    }

    @RequestMapping(path = "/factychnyiKinec1,factychnyiKinec2/{factychnyiKinec1,factychnyiKinec2}")
    public List<Techcard> getAllFactychnyiKinecBetween(@PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date factychnyiKinec1, @PathVariable @DateTimeFormat(iso= DateTimeFormat.ISO.DATE) Date factychnyiKinec2 ) {
        return techcardService.getAllFactychnyiKinecBetween(factychnyiKinec1, factychnyiKinec2);
    }

    @RequestMapping(path = "/vartistRoboty/{vartistRoboty}")
    public List<Techcard> getAllByVartistRoboty(@PathVariable Double vartistRoboty ) {
        return techcardService.getAllByVartistRoboty(vartistRoboty);
    }

    @RequestMapping(path = "/vartistDruku/{vartistDruku}")
    public List<Techcard> getAllByVartistDruku(@PathVariable Double vartistDruku ) {
        return techcardService.getAllByVartistDruku(vartistDruku);
    }

    @RequestMapping(path = "/sumVartist/{sumVartist}")
    public List<Techcard> getAllBySumVartist(@PathVariable Double sumVartist ) {
        return techcardService.getAllBySumVartist(sumVartist);
    }
}

