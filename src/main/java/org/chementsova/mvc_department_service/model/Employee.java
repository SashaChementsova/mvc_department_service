package org.chementsova.mvc_department_service.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "name", nullable = false)
    private String name;

    @Column (name = "office", nullable = false)
    private int office;

    @Column (name = "phone", nullable = false)
    private String phone;

    @ManyToOne (fetch = FetchType.EAGER)
    @JoinColumn (name = "department_id")
    @JsonIgnoreProperties ("employees")
    private Department department;

    @Override
    public String toString() {
        return "Employee" +
                "\n id = " + id +
                "\n name = " + name +
                "\n office = " + office +
                "\n phone = " + phone +
                "\n department = " + department.getName();
    }

    public Employee(String name, int office, String phone, Department department) {
        this.name = name;
        this.office = office;
        this.phone = phone;
        this.department = department;
    }

    public Employee(String name, int office, String phone) {
        this.name = name;
        this.office = office;
        this.phone = phone;
    }
}

