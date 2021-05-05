package com.example.h2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.h2.model.entity.DemoEntity;

public interface DemoRepository extends JpaRepository<DemoEntity, Integer>{

}
