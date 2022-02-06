package net.tecgurus.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import net.tecgurus.spring.config.AppConfig;
import net.tecgurus.spring.model.Curso;
import net.tecgurus.spring.model.Escuela;
import net.tecgurus.spring.model.Estudiante;
import net.tecgurus.spring.service.EscuelaService;

/**
 * Hello world!
 *
 */
public class App {
	
	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		
		applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Curso curso = new Curso();
		curso.setNombre("React desde cero");
		curso.setPrecio(5200.78);
		
//		Curso cursoEnSpring = applicationContext.getBean("curso",Curso.class);
//		
//		System.out.println("Java: " + curso.getNombre());
//		System.out.println("Spring: " + cursoEnSpring.getNombre());
//		
//		cursoEnSpring.setNombre("Editado desde java");
//		System.out.println("Spring Editado: " + cursoEnSpring.getNombre());
//		
//		Curso cursoEnSpringDos = applicationContext.getBean("curso", Curso.class);
//		System.out.println("cursoEnSpringDos: " + cursoEnSpringDos.getNombre());
		
//		Escuela escuela = applicationContext.getBean("escuela",Escuela.class);
//		System.out.println(escuela.getNombre());
//		escuela.setNombre("Nombre editado");
		
		/*Escuela escuelaDos = applicationContext.getBean("escuela", Escuela.class);
		System.out.println(escuelaDos.getNombre());*/	
		
//		Estudiante estudiante = applicationContext.getBean("estudiante", Estudiante.class);
//		
//		System.out.println("Escuela: " + estudiante.getEscuela().getNombre() );
//		System.out.println("Curso: " + estudiante.getCurso().getNombre());
		
		
		EscuelaService escuelaService = applicationContext.getBean(EscuelaService.class);
		escuelaService.crear();
		escuelaService.eliminar();
	}
}
