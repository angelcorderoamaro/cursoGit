package net.tecgurus.spring.dao;

import org.springframework.stereotype.Component;

@Component("mongoDb")
public class EscuelaDaoImplMongoDb implements IEscuelaDao {

	@Override
	public void crear() {
		System.out.println("Escuela creada con Mongo DB");

	}

	@Override
	public void eliminar() {
		System.out.println("Escuela eliminada con Mongo DB");

	}

}
