package net.tecgurus.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import net.tecgurus.spring.model.Escuela;

@Configuration
@ComponentScan("net.tecgurus.spring")
public class AppConfig {
	
	@Bean
	public Escuela escuelaDos() {
		Escuela escuela = new Escuela();
		escuela.setNombre("Tec Gurus TEST");
		escuela.setDireccion("Rio reforma #515");
		escuela.setTelefono("12345678910");
		return escuela;
	}
}
