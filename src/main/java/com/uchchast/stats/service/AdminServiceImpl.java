package com.uchchast.stats.service;

import com.uchchast.stats.entity.dto.GroupDataTransferObject;
import com.uchchast.stats.entity.dto.NewStudInsertDataTransformObject;
import com.uchchast.stats.repo.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public List<String> getGroups() {
        return adminRepository.getGroups();
    }

    @Override
    public List<String> getGroupNumbers() {
        return adminRepository.getGroupNumbers();
    }

    @Override
    public List<String> getDates() {
        return adminRepository.getDates();
    }

    @Override
    public List<String> getAssessments() {
        return adminRepository.getAssessments();
    }

    @Override
    public List<String> getDisciplineByGroup(GroupDataTransferObject group) {
        return adminRepository.getDisciplineByGroup(group);
    }

    @Override
    public String insertStudData(NewStudInsertDataTransformObject studInsertDataTransformObject) {
        return adminRepository.insertStudData(studInsertDataTransformObject);
    }
}
