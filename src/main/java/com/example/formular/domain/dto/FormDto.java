package com.example.formular.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Data
public class FormDto {

    private int id;

    private String kindOfRequest;

    @NotEmpty(message = "The Policy Number can't be empty")
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "Policy number is invalid!!")
    private String policyNumber;

    @NotEmpty(message = "The Name can't be empty")
    @Size(min=2, max=20, message = "Name should be minimum 4 and maximum 20")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Name is invalid!!")
    private String name;

    @NotEmpty(message = "The Surname can't be empty")
    @Size(min=2, max=20, message = "Surname should be minimum 4 and maximum 20")
    @Pattern(regexp = "^[a-zA-Z]+$", message = "Surname is invalid!!")
    private String surname;

    @Size(max=5000, message = "Text should be maximum 5000")
    private String yourRequest = " ";
}
