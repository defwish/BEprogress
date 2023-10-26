package com.employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;


@Data
@AllArgsConstructor


public class EmployeeDTO {
    @NotEmpty
    @Size(min = 3, max = 20)
    private String firstName;

    @NotEmpty
    @Email
    @Size(min = 3, max = 30)
    @Pattern(regexp = "^[A-Za-z0-9+_.-]+@(raiffeisen.ro)$", message = "Te rog introdu o adresa de email valida")
    private String email;

    @NotEmpty
    @NotBlank
    @Size(min = 3, max = 10)
    private String position;

    @NotEmpty
    @Size(min = 5, max = 50)
    private String company;
}

