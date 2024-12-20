package com.example.module309.form;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private Integer id;

    @NotEmpty(message = "First Name is required.")
    @Size(max = 50, message = "First Name must be less than 50 characters")
    private String firstName;

    @NotEmpty(message = "Last Name is required.")
    @Size(max = 50, message = "Last Name must be less than 50 characters")
    private String lastName;

    @NotEmpty(message = "Email is required.")
    @Size(max = 50, message = "Email must be less than 50 characters")
    private String email;

    @NotEmpty(message = "Job Title is required.")
    @Size(max = 50, message = "Job Title must be less than 50 characters")
    private String jobTitle;

    @NotEmpty(message = "Extension is required.")
    @Size(max = 5, message = "Extension must be less than 5 characters")
    private String extension;


    private Integer reportsTo;

    @NotNull(message = "Vacation Hours is required.")
    private Integer vacationHours;

    private String profileImageUrl;

    private Integer officeId;
}
