package br.com.confidencecambio.javabasico.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RoboTest {

    private Robo roboTest;

    @BeforeEach
    void setUp() {
    	roboTest = Robo.builder().name("João Soares Silva").build();
    }
    
    @Test
    void testeUpper() {
        final String result = roboTest.getNomeMaiusculo();

        assertThat(result).isEqualTo("JOÃO SOARES SILVA");
    }

    @Test
    void testeName() {
        final String result = roboTest.getName();

        assertThat(result).isEqualTo("João Soares Silva");
    }
    
    @Test
    void testAbbreviation() {
        final String result = roboTest.getAbbreviation();

        assertThat(result).isEqualTo("João S. Silva");
    }

    @Test
    void testeFirst() {
        // Setup
        // Run the test
        final String result = roboTest.getFirst();

        // Verify the results
        assertThat(result).isEqualTo("João");
    }

    @Test
    void testeLast() {
        final String result = roboTest.getLast();

        assertThat(result).isEqualTo("Soares Silva");
    }
}
