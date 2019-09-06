package com.sophos.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sophos.entity.PersonasEntity;
import com.sophos.service.PersonasService;

@RestController
@RequestMapping(value="/acd_personas")
public class PersonasAPI {
	
	@Autowired
	private PersonasService personasService;
	
	@GetMapping("")
	public List<PersonasEntity> getPersonas(){
		return personasService.getPersonas();
	}
	
	@GetMapping("/{id}")
	public PersonasEntity getPersonaById(@PathVariable("id") String id) {
		return personasService.getPersonasFindById(id);
	}
	
	@PostMapping("")
	public PersonasEntity insertarPersonas(@RequestBody PersonasEntity personasEntity) {
		return personasService.insertarPersonas(personasEntity);
	}
	
	@PutMapping("")
	public PersonasEntity actualizarPersonas(@RequestBody PersonasEntity personasEntity) {
		return personasService.actualizarPersonas(personasEntity);
	}
	
	@DeleteMapping("/{id}")
	public void eliminarPersonas(@PathVariable("id") String id) {
		personasService.eliminarPersona(id);
	}
}
