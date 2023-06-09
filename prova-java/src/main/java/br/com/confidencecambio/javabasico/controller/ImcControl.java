package br.com.confidencecambio.javabasico.controller;

import static org.springframework.http.HttpStatus.OK;

import javax.validation.constraints.DecimalMin;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.confidencecambio.javabasico.dto.CalculoImcRequest;
import br.com.confidencecambio.javabasico.dto.response.CalculoImcResponse;
import br.com.confidencecambio.javabasico.service.ImcService;
import br.com.confidencecambio.javabasico.service.converter.ImcConverter;
import lombok.RequiredArgsConstructor;

@Validated
@RequiredArgsConstructor
@RestController
public class ImcControl {

    private final ImcService service = null;

    private final ImcConverter converter = null;

    @GetMapping("/imc")
    public ResponseEntity<CalculoImcResponse> calculoIMC(
            @RequestParam(value = "altura", required = true) @DecimalMin(value = "1") Double altura , 
            @RequestParam(value = "peso") 					 @DecimalMin(value = "1") Double peso) {
        
        return new ResponseEntity<>(service.calculaIMC(converter.toModel(CalculoImcRequest.builder().peso(peso).altura(altura).build())), OK);
    }
}
