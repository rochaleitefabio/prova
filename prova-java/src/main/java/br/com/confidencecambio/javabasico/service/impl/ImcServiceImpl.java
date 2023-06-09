package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.dto.response.CalculoImcResponse;
import br.com.confidencecambio.javabasico.model.Imc;
import br.com.confidencecambio.javabasico.service.ImcService;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.math.RoundingMode;

@Component
public class ImcServiceImpl implements ImcService {

    @Override
    public CalculoImcResponse calculoIMC(final Imc model) {

        return CalculoImcResponse.builder().peso(model.getPeso()).altura(model.getAltura()).imc(calculoImc(model)).build();
    }

    private Double calculoImc(Imc model) {
        return BigDecimal.valueOf(model.getPeso() / Math.pow(model.getAltura(), 2.0)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}
