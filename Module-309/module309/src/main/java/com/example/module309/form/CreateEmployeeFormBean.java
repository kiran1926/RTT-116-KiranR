package com.example.module309.form;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class CreateEmployeeFormBean {

    private String firstName;
    private String lastName;
    private String email;
    private Integer officeId;
    private String jobTitle;
    private String extension;
    private Integer reportsTo;
    private Integer vacationHours;
    private String profileImageUrl;


}
