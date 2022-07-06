package com.demo.mvc;


import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

@Controller
public class Controlador {
	
	
	// en principio, método debería devolver el código de estado HTTP 201 (CREATED)
	@ResponseStatus(HttpStatus.CREATED)
	public String mostrarFormulario2() {
	// pero se devuelve el código de estado NOT_FOUND (404)
	throw new ResponseStatusException(HttpStatus.NOT_FOUND);
	}
	@RequestMapping("/mostrarFormulario3")
	// se accede al valor de la cabecera accept-language y se almacena en la variable
	//acceptLanguage
	public String mostrarFormulario(@RequestHeader("accept-language") String
	acceptLanguage) {
	System.out.println("El valor de la cabecera accept-language es " + acceptLanguage);
	return "formulario-hola";
	}
	@RequestMapping("/mostrarFormulario2")
	public String mostrarFormulario(@RequestHeader Map<String, String> cabeceras) {
	// se recorren todos los elementos de la cabecera
	cabeceras.forEach((clave, valor) -> {

	System.out.println(clave + ": " + valor);
	});
	return "formulario-hola";
	}
		
	// http://localhost:8080/mostrarFormulario
	@RequestMapping("/mostrarFormulario")
	public String mostrarFormulario() {
	// /WEB-INF/views/formulario-hello.jsp
	return "formulario-hola";
	}
	// http://localhost:8080/procesarFormulario
	@RequestMapping("/procesarFormulario")
	public String procesarFormulario(HttpServletRequest request, Model model) {
	// /WEB-INF/views/hello.jsp
		// se extrae el valor del atributo name del campo del formulario formulario
		String nombre = request.getParameter("nombre");
		// si el usuario no ha introducido ningún valor (null), entonces se iguala a una
		//cadena vacía
		String mensaje = (nombre == null) ? "undefined" : nombre.toUpperCase();
		System.out.println("El valor enviado por el usuario es " + mensaje);
		// crear un nuevo elemento en el modelo
		model.addAttribute("mensaje", mensaje);	
		
	return "hola";
	}
		
		@RequestMapping
		public String muestraPagina() {
			
			return "paginaEjemplo";
		
			
		}
		
		
}
