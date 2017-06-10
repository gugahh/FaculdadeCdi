package gugahh.faculdade.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import gugahh.faculdade.embeddable.Endereco;

@Entity
@Table(name="PROFESSOR")
public class Professor {
	
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	@Column(name="PROFESSOR_ID", nullable=false)
	long id;
	
	@Column(name="NOME_PROF")
	String nome;
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATA_NASC")
	Date dataNascimento;
	
	@ManyToOne
	@JoinColumn
	Curso curso;
	
	@Embedded
	Endereco endereco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public long getId() {
		return id;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	

}
