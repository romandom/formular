package com.example.formular.convertor;


import com.example.formular.domain.dto.FormDto;
import com.example.formular.domain.entity.FormEntity;

public class FormConverter {
	
	public static FormEntity transform(FormDto formDto){
		FormEntity formEntity = new FormEntity();
		formEntity.setId(formDto.getId());
		formEntity.setName(formDto.getName());
		formEntity.setSurname(formDto.getSurname());
		formEntity.setKindOfRequest(formDto.getKindOfRequest());
		formEntity.setPolicyNumber(formDto.getPolicyNumber());
		formEntity.setYourRequest(formDto.getYourRequest());
		return formEntity;
	}

}
