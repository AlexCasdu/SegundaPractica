package com.sophos.service;

import com.sophos.entity.PersonasEntity;
import java.util.List;

public interface PersonasService {
	
	public List<PersonasEntity> getPersonas();
	
	public PersonasEntity getPersonasFindById(String id);
	
	public PersonasEntity insertarPersonas(PersonasEntity personasEntity);
	
	public PersonasEntity actualizarPersonas(PersonasEntity personasEntity);
	
	public void eliminarPersona(String id);
}
