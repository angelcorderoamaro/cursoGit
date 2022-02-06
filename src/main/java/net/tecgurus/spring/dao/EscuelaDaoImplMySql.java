package net.tecgurus.spring.dao;

import org.springframework.stereotype.Component;

@Component("mySql")
public class EscuelaDaoImplMySql implements IEscuelaDao {

	@Override
	public void crear() {
		System.out.println("Escuela creada con MySQL");

	}

	@Override
	public void eliminar() {
		System.out.println("Escuela eliminada con MySQL");

	}

}
