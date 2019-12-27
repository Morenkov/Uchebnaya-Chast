package com.uchchast.stats.service;

import com.uchchast.stats.entity.Grade;
import com.uchchast.stats.entity.NamedGrade;
import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.StudDataTransferObject;

import java.util.List;
import java.util.Map;

public interface ProgressionService {

   Map<String, List<Grade>> getProgression(StudDataTransferObject studDataTransferObject);

   Map<String, List<NamedGrade>> getProgression(GroupDataTransferObject groupDataTransferObject);

   Map<String, List<Grade>> getDvoichniki();

}
