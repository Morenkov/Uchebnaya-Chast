package com.uchchast.stats.repo;

import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.NewStudInsertDataTransformObject;

import java.util.List;

public interface AdminRepository {

    List<String> getGroups();

    List<String> getGroupNumbers();

    List<String> getDates();

    List<String> getAssessments();

    List<String> getDisciplineByGroup(GroupDataTransferObject group);

    String insertStudData(NewStudInsertDataTransformObject newStudInsertDataTransformObject);
}
