package entities;

public class Pessoa {
	
	private String nome;
	private Integer id;
	private String nomeSala;
	private Integer idSala;
	
	public Pessoa() {
		
	}


	public Pessoa(String nome, Integer id, String nomeSala, Integer idSala) {
		this.nome = nome;
		this.id = id;
		this.nomeSala = nomeSala;
		this.idSala = idSala;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNomeSala() {
		return nomeSala;
	}


	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public Integer getIdSala() {
		return idSala;
	}


	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}


	@Override
	public String toString() {
		return "Pessoa: " + nome + "," + " ID: " + id + "," +  "Sala: " + nomeSala + "ID sala: " + idSala;
	}

	
}
