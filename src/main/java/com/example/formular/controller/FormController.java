package com.example.formular.controller;

import com.example.formular.convertor.FormConverter;
import com.example.formular.convertor.KindOfRequestConvertor;
import com.example.formular.domain.dto.FormDto;
import com.example.formular.domain.dto.KindOfRequestDto;
import com.example.formular.domain.repository.FormRepository;
import com.example.formular.domain.repository.RequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@AllArgsConstructor
@RequestMapping("/form")
public class FormController {

	private final FormRepository formRepository;
	private final RequestRepository requestRepository;

	@GetMapping("/show")
	public String listStudents(Model model) {
		FormDto formDto = new FormDto();
		List<KindOfRequestDto> list = new ArrayList<>(requestRepository.findAll()
				.stream().map(KindOfRequestConvertor::transform).collect(Collectors.toList()));
		model.addAttribute("form", formDto);
		model.addAttribute("request", list);
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
