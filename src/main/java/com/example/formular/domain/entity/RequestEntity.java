package com.example.formular.domain.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "kind_of_request")
public class RequestEntity {

        @Id
        @GeneratedValue
        private int id;

        @Column(name = "kind_of_request")
        private String kindOfRequest;

}
