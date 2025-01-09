package com.devsuperior.aula.services;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    @Transactional
    public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
        Person person = new Person();
        person.setName(dto.getName());
        person.setSalary(dto.getSalary());

        Department department = departmentRepository.getReferenceById(dto.getDepartment().getId());
        department.setId(dto.getDepartment().getId());

        person.setDepartment(department);
        person = personRepository.save(person);
        return new PersonDepartmentDTO(person);
    }
}
