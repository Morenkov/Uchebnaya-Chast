package com.uchchast.stats.repo;

import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.StudDataTransferObject;

import java.util.List;
import java.util.Map;

public interface ProgressionRepository {

    List<Map<String, Object>> getProgressionByStudName(StudDataTransferObject studDataTransferObjectDto);

    List<Map<String, Object>> getProgressionByStudGroup(GroupDataTransferObject groupDataTransferObject);

    Integer getPeopleCountInGroup(String groupName, String groupNum);

    Integer getDisciplineCountGroup(String groupName, String groupNum);

    List<Map<String, Object>> getAllDvoichinki();
}
