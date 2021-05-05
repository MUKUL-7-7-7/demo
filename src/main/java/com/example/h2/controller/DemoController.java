package com.example.h2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.h2.dao.DemoRepository;
import com.example.h2.model.dto.DemoDto;
import com.example.h2.model.entity.DemoEntity;



@RestController
public class DemoController {
	@Autowired
	public DemoRepository demoRepository;

	@PostMapping("/addDetails")
	public String setDemoDetails(@RequestBody DemoDto dto) {
		DemoEntity demoEntity = new DemoEntity();
		demoEntity.setEmp_name(dto.getEmp_name());
		demoEntity.setEmp_age(dto.getEmp_age());
		demoEntity.setEmp_department(dto.getEmp_department());
		demoRepository.save(demoEntity);
		
	return "Successfully Added";	
	}
	
	@GetMapping("/getAll")
	public List<DemoEntity> getAllDemo(){
		return demoRepository.findAll();
	}
	
}
