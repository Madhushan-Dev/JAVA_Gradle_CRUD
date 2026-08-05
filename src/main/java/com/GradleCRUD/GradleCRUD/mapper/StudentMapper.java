package com.GradleCRUD.GradleCRUD.mapper;

import com.GradleCRUD.GradleCRUD.dto.requestDTO.RequestDTO;
import com.GradleCRUD.GradleCRUD.dto.responseDTO.ResponseDTO;
import com.GradleCRUD.GradleCRUD.entities.Student;
import org.mapstruct.Mapper;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(componentModel = "spring",nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface StudentMapper {
    static Student toEntity(RequestDTO dto);
    ResponseDTO toDto(Student student);
}
