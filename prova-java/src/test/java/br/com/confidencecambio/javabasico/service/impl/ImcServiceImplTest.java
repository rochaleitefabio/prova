package br.com.confidencecambio.javabasico.service.impl;

import br.com.confidencecambio.javabasico.dto.response.CalculoImcResponse;
import br.com.confidencecambio.javabasico.model.Imc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ImcServiceImplTest {

    private ImcServiceImpl serviceImplTest;

    @BeforeEach
    void setUp() {
		// iniciando
        serviceImplTest = new ImcServiceImpl();
    }

    @Test
    void testeCalculo() {

        final Imc model = Imc.builder().altura(1.0).peso(50.0).build();

        final CalculoImcResponse expected = CalculoImcResponse.builder().altura(1.0).peso(50.0).imc(50.0).build();

        final var result = serviceImplTest.calculoIMC(model);

        assertThat(result).isEqualTo(expected);
    }
}
