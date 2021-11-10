package basicas;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Cliente implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nome;
	private String endereco;
	private String email;
	private String fone;
	
	@ManyToOne
	@JoinColumn(name="cartegoria_id", nullable=false)
	private Categoria categoria;
	
	
	public Cliente() {}
	
	public Cliente(String nome, String endereco, String email, String fone, Categoria categoria) {
		super();
		this.nome = nome;
		this.endereco = endereco;
		this.email = email;
		this.fone = fone;
		this.categoria=categoria;

	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
	
	

	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", email=" + email + ", fone=" + fone
				+ ", Categoria=" + categoria.getDescricao() +  "]";
	}
	
	
	
	
	
	
	

}
