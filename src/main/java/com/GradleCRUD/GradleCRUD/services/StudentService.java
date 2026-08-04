package com.GradleCRUD.GradleCRUD.services;

import com.GradleCRUD.GradleCRUD.dto.requestDTO.RequestDTO;
import com.GradleCRUD.GradleCRUD.dto.responseDTO.ResponseDTO;

public interface StudentService {
    ResponseDTO createStudent(RequestDTO dto);
}
