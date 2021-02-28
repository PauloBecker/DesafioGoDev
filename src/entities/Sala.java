package entities;

public class Sala {
	
	private String nomeSala;
	
	public Sala() {
		
	}

	public Sala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	public String getNomeSala() {
		return nomeSala;
	}

	public void setNomeSala(String nomeSala) {
		this.nomeSala = nomeSala;
	}

	@Override
	public String toString() {
		return "Sala " + nomeSala;
	}

	
	
}
