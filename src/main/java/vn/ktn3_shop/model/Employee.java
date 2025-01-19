package vn.ktn3_shop.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Entity
@Table(name = "employees")
@Getter
@Setter
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Department cannot be empty!")
    private String department;

    @NotBlank(message = "Position cannot be empty!")
    private String position;

    private Instant startDate;
    private Instant endDate;
}
