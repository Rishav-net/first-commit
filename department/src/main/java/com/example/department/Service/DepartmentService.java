package com.example.department.Service;


import com.example.department.Entity.Department;
import com.example.department.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long departmentid) {
        return departmentRepository.findBydepartmentid(departmentid);
    }
}
