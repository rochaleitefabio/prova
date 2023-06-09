package br.com.confidencecambio.javabasico.service;

import br.com.confidencecambio.javabasico.dto.response.CalculoImcResponse;
import br.com.confidencecambio.javabasico.model.Imc;

public interface ImcService {
    CalculoImcResponse calculoIMC(Imc model);
}
