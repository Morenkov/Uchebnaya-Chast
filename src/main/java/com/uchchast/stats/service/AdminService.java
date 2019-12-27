package com.uchchast.stats.service;

import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.NewStudInsertDataTransformObject;

import java.util.List;

public interface AdminService {

    List<String> getGroups();

    List<String> getGroupNumbers();

    List<String> getDates();

    List<String> getAssessments();

    List<String> getDisciplineByGroup(GroupDataTransferObject group);

    String insertStudData(NewStudInsertDataTransformObject studInsertDataTransformObject);
}
