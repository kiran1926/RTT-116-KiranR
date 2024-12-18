package com.example.module309.form;

import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty(message = "Office Id is required.")
    @Size(max = 50, message = "Office Id must be less than 50 characters")
    private Integer officeId;

    @NotEmpty(message = "Job Title is required.")
    @Size(max = 50, message = "Job Title must be less than 50 characters")
    private String jobTitle;

    @NotEmpty(message = "Extension is required.")
    @Size(max = 50, message = "Extension must be less than 50 characters")
    private String extension;

    @NotEmpty(message = "Reports To is required.")
    @Size(max = 50, message = "Reports To must be less than 50 characters")
    private Integer reportsTo;

    @NotEmpty(message = "Vacation Hours is required.")
    @Size(max = 50, message = "Vacation Hours must be less than 50 characters")
    private Integer vacationHours;

    @NotEmpty(message = "Profile Image is required.")
    @Size(max = 50, message = "Profile Image must be less than 50 characters")
    private String profileImageUrl;


}
