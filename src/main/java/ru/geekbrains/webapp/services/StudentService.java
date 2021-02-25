package ru.geekbrains.webapp.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.geekbrains.webapp.entities.Student;
import ru.geekbrains.webapp.repositories.StudentRepository;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    public void save(Map<String, String> params) {
        Student student = new Student();
        student.setId(null);
        student.setFirstName(params.get("firstName"));
        student.setLastName(params.get("lastName"));
        student.setAge(Integer.valueOf(params.get("age")));
        studentRepository.save(student);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}
