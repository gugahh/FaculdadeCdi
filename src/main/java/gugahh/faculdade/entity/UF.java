package gugahh.faculdade.entity;

import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Cacheable
@Entity
public class UF {
	
	@Id
	private String sigla;
	
	@Column(nullable=false)
	private String nome;
	
	public UF() {
		super();
	}
	
	public UF(String sigla, String nome) {
		this();
		this.sigla = sigla;
		this.nome = nome;
	}

}
