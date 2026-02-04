package com.xworkz.employee.external;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="employee_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries({
        @NamedQuery(name = "findByName", query = "SELECT e FROM EmployeeEntity e WHERE e.Name = :Nameby"),
        @NamedQuery(name = "findByPhno", query = "SELECT e FROM EmployeeEntity e WHERE e.phno = :phby"),
        @NamedQuery(name = "findByEmail", query = "SELECT e FROM EmployeeEntity e WHERE e.email = :emailby"),
        @NamedQuery(name = "findByPhnoAndEmail", query = "SELECT e FROM EmployeeEntity e WHERE e.phno = :phby AND e.email = :emailby"),
        @NamedQuery(name = "findByAgeGreater", query = "SELECT e FROM EmployeeEntity e WHERE e.Age > :ageby"),
        @NamedQuery(name = "getCount", query = "SELECT COUNT(e) FROM EmployeeEntity e"),
        @NamedQuery(name = "getMaxAge", query = "SELECT MAX(e.Age) FROM EmployeeEntity e"),
        @NamedQuery(name = "getMinAge", query = "SELECT MIN(e.Age) FROM EmployeeEntity e"),
        @NamedQuery(name = "getAllNames", query = "SELECT e.Name FROM EmployeeEntity e")
})

public class EmployeeEntity {

    @Id
    private int id;
    private String Name;
    private int Age;
    private int phno;
    private String email;


}
