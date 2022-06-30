package ar.edu.unlam.pb2;

public class MedioDePago {
	
	
	private String titular;
	
	
	public MedioDePago(String titularEsperado) {
		
		
		this.titular = titularEsperado;
		
	}


	public String getTitularEsperado() {
		return titular;
	}


	public void setTitularEsperado(String titularEsperado) {
		this.titular = titularEsperado;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	
}
