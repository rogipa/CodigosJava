package Basica;

public class Celula {
	
	private Celula proxima;
	private Celula anterior;
	private Object objeto;
	
	public Celula(Celula proxima, Celula anterior, Object objeto) {
		super();
		this.proxima = proxima;
		this.anterior = anterior;
		this.objeto = objeto;
	}

	public Celula(Celula proxima, Object objeto) {
		super();
		this.proxima = proxima;
		this.objeto = objeto;
	}

	public Celula(Object objeto) {
		super();
		this.objeto = objeto;
	}

	public Celula getProxima() {
		return proxima;
	}

	public void setProxima(Celula proxima) {
		this.proxima = proxima;
	}

	public Celula getAnterior() {
		return anterior;
	}

	public void setAnterior(Celula anterior) {
		this.anterior = anterior;
	}

	public Object getObjeto() {
		return objeto;
	}

	public void setObjeto(Object objeto) {
		this.objeto = objeto;
	}
	
	
	
	

}
