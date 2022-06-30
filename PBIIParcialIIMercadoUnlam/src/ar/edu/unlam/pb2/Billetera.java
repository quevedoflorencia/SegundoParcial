package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Billetera {

	private String nombreBilletera;
	private HashSet<Comercio>comercios;
	private HashSet<Consumidor>consumidores;
	

	public Billetera(String nombreBilletera) {
		// TODO Auto-generated constructor stub
		this.nombreBilletera=nombreBilletera;
		this.comercios=new HashSet<Comercio>();
		this.consumidores=new HashSet<Consumidor>();
		
	}

	public HashSet<Consumidor> getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(HashSet<Consumidor> consumidores) {
		this.consumidores = consumidores;
	}

	public String getNombreBilletera() {
		return nombreBilletera;
	}

	public void setNombreBilletera(String nombreBilletera) {
		this.nombreBilletera = nombreBilletera;
	}

	public HashSet<Comercio> getComercios() {
		return comercios;
	}



	public void setComercios(HashSet<Comercio> comercios) {
		this.comercios = comercios;
	}

	public void agregarComercio(Comercio comercio) throws CuitInvalidoException {

		if (Long.toBinaryString(comercio.getCuit()).length()!=11) {
			throw new CuitInvalidoException("Cuit inválido");
		}
		else {
			comercios.add(comercio);
		}

	}

	public void agregarConsumidor(Consumidor consumidor) {

		
		this.consumidores.add(consumidor);
		
	}

	public void agregarMedioDePago(Integer dniCliente, MedioDePago medioDePago) throws NoCoincideTitularException {

		Consumidor consumidorEncontrado=buscarCliente(dniCliente);
		consumidorEncontrado.agregarMedioDePago(medioDePago);
		
		
	}
	
	public Consumidor buscarCliente(Integer dniConsumido) throws NoCoincideTitularException {
		for (Consumidor actual : this.consumidores) {
			if (actual.getDni().equals(dniConsumido)) {
				return actual;
			}
		}
		throw new NoCoincideTitularException("No existe el titular");
	}

	public Integer getCantidadDeMediosDePago(Integer dniConsumidor) throws NoCoincideTitularException {
		Consumidor consumidorEncontrado=buscarCliente(dniConsumidor);
		return consumidorEncontrado.getMediosDePago().size();
		
	}

	public Compra generarCodigoQR(Long cuit, Double d) {
		
		return null;
	}
	


	

}
