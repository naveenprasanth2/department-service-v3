package net.javaguides.departmentservice.service.impl;

import lombok.AllArgsConstructor;
import net.javaguides.departmentservice.dto.DepartmentDto;
import net.javaguides.departmentservice.entity.Department;
import net.javaguides.departmentservice.mapper.AutoDepartmentMapper;
import net.javaguides.departmentservice.repository.DepartmentRepository;
import net.javaguides.departmentservice.service.inter.DepartmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService {
    private final DepartmentRepository departmentRepository;

    @Override
    public DepartmentDto saveDepartment(DepartmentDto departmentDto) {
        Department department = AutoDepartmentMapper.MAPPER.mapToDepartment(departmentDto);
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(departmentRepository.save(department));
    }

    @Override
    public DepartmentDto findDepartmentById(Long id) {
        Department department = departmentRepository.findById(id).orElseThrow();
        return AutoDepartmentMapper.MAPPER.mapToDepartmentDto(department);
    }

    @Override
    public List<DepartmentDto> findAllDepartments() {
        List<Department> departmentList = departmentRepository.findAll();
        return departmentList.stream().map(AutoDepartmentMapper.MAPPER::mapToDepartmentDto).toList();
    }
}
