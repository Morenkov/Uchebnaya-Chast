package com.uchchast.stats.controller.rest;

import com.uchchast.stats.entity.Grade;
import com.uchchast.stats.entity.NamedGrade;
import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.StudDataTransferObject;
import com.uchchast.stats.service.ProgressionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class ProfileRestController {

    private final ProgressionService progressionService;

    @Autowired
    public ProfileRestController(ProgressionService progressionService) {
        this.progressionService = progressionService;
    }

    @PostMapping("/profile/getByName")
    @ResponseBody
    public Map<String, List<Grade>> getProgressionByStudName(@RequestBody final StudDataTransferObject studDataTransferObject){
        return progressionService.getProgression(studDataTransferObject);
    }

    @PostMapping("/profile/getByGroup")
    @ResponseBody
    public Map<String, List<NamedGrade>> getProgressionByGroupName(@RequestBody final GroupDataTransferObject groupDataTransferObject){
        return progressionService.getProgression(groupDataTransferObject);
    }

    @PostMapping("/profile/getDvoichniki")
    @ResponseBody
    public Map<String, List<Grade>> getAllDvoichniki(){
        return progressionService.getDvoichniki();
    }
}
