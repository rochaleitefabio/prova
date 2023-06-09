package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class GerenteTest {

    private Gerente gerenteTest;

    @BeforeEach
    void setUp() {
    	gerenteTest = Cliente.builder().nome("João Soares Silva").build();
    }
    
    @Test
    void testeUpper() {
        final String result = gerenteTest.getNomeMaiusculo();

        assertThat(result).isEqualTo("JOÃO SOARES SILVA");
    }

    @Test
    void testeName() {
        final String result = gerenteTest.getName();

        assertThat(result).isEqualTo("João Soares Silva");
    }
    
    @Test
    void testAbbreviation() {
        final String result = gerenteTest.getAbbreviation();

        assertThat(result).isEqualTo("João S. Silva");
    }

    @Test
    void testeFirst() {
        // Setup
        // Run the test
        final String result = gerenteTest.getFirst();

        // Verify the results
        assertThat(result).isEqualTo("João");
    }

    @Test
    void testeLast() {
        final String result = gerenteTest.getLast();

        assertThat(result).isEqualTo("Soares Silva");
    }

}
