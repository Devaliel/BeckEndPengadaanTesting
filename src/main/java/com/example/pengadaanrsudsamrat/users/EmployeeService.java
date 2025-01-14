package com.example.pengadaanrsudsamrat.users;


import com.example.pengadaanrsudsamrat.users.DTO.CreateEmployeeRequestDTO;
import com.example.pengadaanrsudsamrat.users.DTO.CreateEmployeeResponseDTO;
import com.example.pengadaanrsudsamrat.users.DTO.EmployeeRequestDTO;
import com.example.pengadaanrsudsamrat.users.DTO.EmployeeResponseDTO;

public interface EmployeeService {

    EmployeeResponseDTO login(EmployeeRequestDTO employeeRequestDTO);
    CreateEmployeeResponseDTO createEmployee(CreateEmployeeRequestDTO createEmployeeRequestDTO);
}
