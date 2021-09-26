package com.example.formular.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "form")
public class FormEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "kind_of_request")
	private String kindOfRequest;
	
	@Column(name = "policy_number")
	private String policyNumber;

	private String name;

	private String surname;

	@Column(name = "your_request")
	private String yourRequest;

}
