package com.example.formular.convertor;

import com.example.formular.domain.dto.KindOfRequestDto;
import com.example.formular.domain.entity.RequestEntity;

public class KindOfRequestConvertor {

    public static KindOfRequestDto transform(RequestEntity requestEntity){

        KindOfRequestDto kindOfRequestDto = new KindOfRequestDto();
        kindOfRequestDto.setKindOfRequest(requestEntity.getKindOfRequest());
        return kindOfRequestDto;
    }

}
