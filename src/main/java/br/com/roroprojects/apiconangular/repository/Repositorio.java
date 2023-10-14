package br.com.roroprojects.apiconangular.repository;

import org.springframework.data.repository.CrudRepository;


import br.com.roroprojects.apiconangular.model.Cliente;


public interface Repositorio extends CrudRepository<Cliente,Long> {

}
