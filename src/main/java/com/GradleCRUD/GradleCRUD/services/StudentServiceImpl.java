package com.GradleCRUD.GradleCRUD.services;

import com.GradleCRUD.GradleCRUD.dto.requestDTO.RequestDTO;
import com.GradleCRUD.GradleCRUD.dto.responseDTO.ResponseDTO;
import com.GradleCRUD.GradleCRUD.entities.Student;
import com.GradleCRUD.GradleCRUD.mapper.StudentMapper;
import com.GradleCRUD.GradleCRUD.repositories.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentRepo studentRepo;

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public ResponseDTO createStudent(RequestDTO requestDTO){
        //DTO->Entity
        Student student= StudentMapper.toEntity(requestDTO);

        Student savedStudent =studentRepo.save(student);

        return studentMapper.toDto(savedStudent);
    }
}
