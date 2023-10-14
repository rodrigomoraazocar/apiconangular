package br.com.roroprojects.apiconangular.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "clientes")
@Getter // Lombok - asi no necesito hacer los getters and setters
@Setter // Lombok - asi no necesito hacer los getters and setters
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codigo;
	private String nome;
	private String cidade;
	private int idade;
	

}
