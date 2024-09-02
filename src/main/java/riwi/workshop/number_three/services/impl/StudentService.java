package riwi.workshop.number_three.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import riwi.workshop.number_three.entities.StudentEntity;
import riwi.workshop.number_three.repositories.StudentRepository;
import riwi.workshop.number_three.services.interfaces.IStudentService;

import java.util.List;

@Service
public class StudentService implements IStudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public List<StudentEntity> readAll() {
        return List.of();
    }

    @Override
    public StudentEntity readById(Long aLong) {
        return null;
    }

    @Override
    public StudentEntity save(StudentEntity studentEntity) {
        return null;
    }
}
