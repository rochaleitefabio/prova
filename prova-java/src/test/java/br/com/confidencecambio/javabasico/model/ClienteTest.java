package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClienteTest {

    private Cliente clienteTest;

    @BeforeEach
    void setUp() {
        clienteTest = Cliente.builder().nome("João Soares Silva").build();
    }
    
    @Test
    void testeUpper() {
        final String result = clienteTest.getNomeMaiusculo();

        assertThat(result).isEqualTo("JOÃO SOARES SILVA");
    }

    @Test
    void testeName() {
        final String result = clienteTest.getName();

        assertThat(result).isEqualTo("João Soares Silva");
    }
    
    @Test
    void testAbbreviation() {
        final String result = clienteTest.getAbbreviation();

        assertThat(result).isEqualTo("João S. Silva");
    }

    @Test
    void testeFirst() {
        // Setup
        // Run the test
        final String result = clienteTest.getFirst();

        // Verify the results
        assertThat(result).isEqualTo("João");
    }

    @Test
    void testeLast() {
        final String result = clienteTest.getLast();

        assertThat(result).isEqualTo("Soares Silva");
    }


}
