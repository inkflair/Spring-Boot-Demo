package com.example.demo.student;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service // could also be @Component
public class StudentService {

    public List<Student> getStudents() {
        return List.of(new Student(1L,
                "Michael",
                21,
                LocalDate.of(1998, Month.JANUARY, 5),
                "michael@gmail.com"));
    }
}
