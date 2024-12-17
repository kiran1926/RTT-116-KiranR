package com.example.module309.form;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateCustomerFormBean {

    // THIS IS CALLED A POJO - plain Old Java Object

    //this object is called a FormBean
    // this is analogous to a DTO data transfer Object
    // this is NEVER EVER an entity

    @Pattern(regexp = "[A-Za-z0-9\\s]+",message = "Company Name must contain only numbers, letter, and spaces.")
    @NotEmpty(message = "Company name is required.")
    @Size(min = 2, max = 50, message = "Company Name must be between 2 and 50 characters")
    private String companyName;

    @NotEmpty(message = "First Name is required.")
    @Size(max = 50, message = "First Name must be less than 50 characters")
    //can use @Length for min max as well
    private String firstName;

    @NotEmpty(message = "Last Name is required.")
    @Size(max = 50, message = "Last Name must be less than 50 characters")
    private String lastName;

    @NotEmpty(message = "Phone number is required.")
    private String phone;

    @NotEmpty(message = "Address Line 1 is required.")
    @Size(max = 50, message = "Address Line1 must be less than 50 characters")
    private String addressLine1;

    @NotEmpty(message = "City name is required.")
    @Size(max = 50, message = "City Name must be less than 50 characters")
    private String city;

    @NotEmpty(message ="Country Name is required.")
    @Size(max = 50, message = "Country Name must be less than 50 characters")
    private String country;

}
