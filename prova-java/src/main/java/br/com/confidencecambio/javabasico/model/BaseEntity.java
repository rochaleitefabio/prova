package br.com.confidencecambio.javabasico.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder(toBuilder = true)
public abstract class BaseEntity {
	
	
	//Nome não pode ser nulo
	//Nome não pode ser vazio
	@NotNull
    @NotBlank
    private String name;
    

	//Nome não pode conter espaços extras no início e no fim
    public String getName() {
        return this.name.trim();
    }

    //Deve ser possível obter o primeiro nome
    public String getFirst() {
        var aux = this.name.split(" ");

        return aux.length > 0 ? aux[0] : "";
    }

    //Retornar o último nome
    public String getLast() {
    	var aux = this.name.split(" ");

    	return aux.length > 0 ? name.substring(aux[0].length()) : "";
    }

    //Retornar o nome abreviado.
    public String getAbbreviation() {

        var aux = this.name.split(" ");
        StringBuilder abreviado = new StringBuilder(aux[0]);

        if (aux.length > 2) {
            for (int i = 1; i < (aux.length - 1); i++) {
                abreviado.append(" ").append(aux[i].toCharArray()[0]).append(".");
            }
        }

        return abreviado.append(" ").append(aux[aux.length - 1]).toString();
    }

    //Retornar o nome todo em letras maiúsculas.
    public String getNomeMaiusculo() {
        return this.name.toUpperCase();
    }
}
