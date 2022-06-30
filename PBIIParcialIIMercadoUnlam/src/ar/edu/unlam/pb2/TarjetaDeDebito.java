 package ar.edu.unlam.pb2;

import java.util.Objects;

public class TarjetaDeDebito extends MedioDePago implements Pagadora {

	private Long numeroEsperado;
	private String fechaDeVencimientoEsperado;
	private Integer codigoDeSeguridadEsperado;
	private Double saldo;

	public TarjetaDeDebito(Long numeroEsperado, String titularEsperado, String fechaDeVencimientoEsperado, Integer codigoDeSeguridadEsperado) {
		super(titularEsperado);
		// TODO Auto-generated constructor stub
		this.numeroEsperado=numeroEsperado;
		this.fechaDeVencimientoEsperado=fechaDeVencimientoEsperado;
		this.codigoDeSeguridadEsperado=codigoDeSeguridadEsperado;
		this.saldo=saldo;
	}

	@Override
	public Long getNumero() {
		// TODO Auto-generated method stub
		return this.numeroEsperado;
	}

	

	@Override
	public int hashCode() {
		return Objects.hash(numeroEsperado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		TarjetaDeDebito other = (TarjetaDeDebito) obj;
		return Objects.equals(numeroEsperado, other.numeroEsperado);
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		// TODO Auto-generated method stub
		return this.codigoDeSeguridadEsperado;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fechaDeVencimientoEsperado;
	}

	public Double setSaldo(Double d) {
		return this.saldo=10000.0;
		
	}

	public Double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return super.getTitularEsperado();
	}

	
	



}
