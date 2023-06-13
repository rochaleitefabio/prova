package br.com.confidencecambio.javabasico.service.converter;

import br.com.confidencecambio.javabasico.dto.CalculoImcRequest;
import br.com.confidencecambio.javabasico.model.Imc;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ImcConverter {
	
    Imc toModel(CalculoImcRequest dto);
    
    CalculoImcRequest fromModel(Imc model);
}
