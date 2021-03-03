package ru.geekbrains.webapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.geekbrains.webapp.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
