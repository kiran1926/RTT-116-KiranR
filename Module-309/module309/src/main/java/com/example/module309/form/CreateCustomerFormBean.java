package com.example.module309.form;

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

    private String companyName;
    private String firstName;
    private String lastName;
    private String phone;
    private String addressLine1;
    private String city;
    private String country;

}
