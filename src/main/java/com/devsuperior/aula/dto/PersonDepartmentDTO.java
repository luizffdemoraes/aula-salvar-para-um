package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {

    private Long id;
    private String name;
    private Double salary;
    private DepartmentDTO department;

    public PersonDepartmentDTO() {
    }

    public PersonDepartmentDTO(String name, Long id, Double salary, DepartmentDTO department) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
    }

    public PersonDepartmentDTO(Person person) {
        this.name = person.getName();
        this.id = person.getId();
        this.salary = person.getSalary();
        this.department = new DepartmentDTO(person.getDepartment());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public DepartmentDTO getDepartment() {
        return department;
    }

    public void setDepartment(DepartmentDTO department) {
        this.department = department;
    }
}
