package com.sophos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sophos.entity.PersonasEntity;
import com.sophos.repository.PersonasRepository;

@Service
public class PersonasServiceImpl implements PersonasService {

	@Autowired
	private PersonasRepository personasRepository;
	
	@Override
	public List<PersonasEntity> getPersonas() {		
		return (List<PersonasEntity>) personasRepository.findAll();
	}

	@Override
	public PersonasEntity getPersonasFindById(String id) {		
		return personasRepository.findById(id).isPresent() ? personasRepository.findById(id).get() 
				: null;
	}

	@Override
	public PersonasEntity insertarPersonas(PersonasEntity personasEntity) {
		return personasRepository.save(personasEntity);
	}

	@Override
	public PersonasEntity actualizarPersonas(PersonasEntity personasEntity) {
		return personasRepository.findById(personasEntity.getIdentificacion()).isPresent() 
				? personasRepository.save(personasEntity) : null;
	}
	
	@Override
	public void eliminarPersona(String id) {
		//personasRepository.findById(id).isPresent()
		personasRepository.deleteById(id);
	}
}
