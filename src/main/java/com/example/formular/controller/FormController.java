package com.example.formular.controller;

import com.example.formular.convertor.FormConverter;
import com.example.formular.domain.dto.FormDto;
import com.example.formular.domain.repository.FormRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@AllArgsConstructor
@RequestMapping("/form")
public class FormController {

	private final FormRepository formRepository;

	@GetMapping("/show")
	public String listStudents(Model model) {
		FormDto formDto = new FormDto();
		model.addAttribute("form", formDto);
		return "index";
	}

	@PostMapping("/save")
	@ResponseStatus(HttpStatus.CREATED)
	public String save(@Valid @ModelAttribute("form") FormDto form, BindingResult result, Model model)
	{
		if(result.hasErrors()){
			return "index";
		}
		formRepository.save(FormConverter.transform(form));
		return "saved";
	}
	
}
