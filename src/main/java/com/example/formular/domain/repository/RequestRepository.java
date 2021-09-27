package com.example.formular.domain.repository;

import com.example.formular.domain.entity.RequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RequestRepository  extends JpaRepository<RequestEntity, Integer> {

    List<RequestEntity> findAll();
}
