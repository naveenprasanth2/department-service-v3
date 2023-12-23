package net.javaguides.departmentservice.service.inter;

import net.javaguides.departmentservice.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {

    DepartmentDto saveDepartment(DepartmentDto departmentDto);

    DepartmentDto findDepartmentById(Long id);

    List<DepartmentDto> findAllDepartments();
}
