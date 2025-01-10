package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {

    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDTO() {
    }

    public PersonDTO(String name, Long id, Double salary, Long departmentId) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.departmentId = departmentId;
    }

    public PersonDTO(Person person) {
        this.name = person.getName();
        this.id = person.getId();
        this.salary = person.getSalary();
        this.departmentId = person.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }
}
