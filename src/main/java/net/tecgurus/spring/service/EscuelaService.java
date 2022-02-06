package net.tecgurus.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import net.tecgurus.spring.dao.IEscuelaDao;

@Component
public class EscuelaService {
	
	@Autowired
	@Qualifier("mongoDb")
	private IEscuelaDao escuelaDao;
	
	public void crear() {
		escuelaDao.crear();
	}
	
	public void eliminar() {
		escuelaDao.eliminar();
	}
}
