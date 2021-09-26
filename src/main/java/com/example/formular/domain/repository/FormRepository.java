package com.example.formular.domain.repository;


import com.example.formular.domain.entity.FormEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FormRepository extends JpaRepository<FormEntity, Integer> {
}
