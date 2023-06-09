package br.com.confidencecambio.javabasico.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CalculoImcResponse {
	
	
    private Double altura;
    
    
    private Double peso;
    
    
    public Double getAltura() {
		return altura;
	}


	public void setAltura(Double altura) {
		this.altura = altura;
	}


	public Double getPeso() {
		return peso;
	}


	public void setPeso(Double peso) {
		this.peso = peso;
	}


	public Double getImc() {
		return imc;
	}


	public void setImc(Double imc) {
		this.imc = imc;
	}


	private Double imc;
}
