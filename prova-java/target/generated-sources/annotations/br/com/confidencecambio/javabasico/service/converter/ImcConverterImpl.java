package br.com.confidencecambio.javabasico.service.converter;

import br.com.confidencecambio.javabasico.dto.CalculoImcRequest;
import br.com.confidencecambio.javabasico.dto.CalculoImcRequest.CalculoImcRequestBuilder;
import br.com.confidencecambio.javabasico.model.Imc;
import br.com.confidencecambio.javabasico.model.Imc.ImcBuilder;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-06-13T19:22:56-0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.18 (Oracle Corporation)"
)
@Component
public class ImcConverterImpl implements ImcConverter {

    @Override
    public Imc toModel(CalculoImcRequest dto) {
        if ( dto == null ) {
            return null;
        }

        ImcBuilder imc = Imc.builder();

        imc.altura( dto.getAltura() );
        imc.peso( dto.getPeso() );

        return imc.build();
    }

    @Override
    public CalculoImcRequest fromModel(Imc model) {
        if ( model == null ) {
            return null;
        }

        CalculoImcRequestBuilder calculoImcRequest = CalculoImcRequest.builder();

        calculoImcRequest.altura( model.getAltura() );
        calculoImcRequest.peso( model.getPeso() );

        return calculoImcRequest.build();
    }
}
