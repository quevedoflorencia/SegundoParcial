package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Objects;

public class Consumidor {

	private Integer dni;
	private String nombre;
	private HashSet<MedioDePago>mediosDePago;

	public Consumidor(Integer dni, String nombre) {
		// TODO Auto-generated constructor stub
		this.dni=dni;
		this.nombre=nombre;
		this.mediosDePago=new HashSet<MedioDePago>();
	}

	public HashSet<MedioDePago> getMediosDePago() {
		return mediosDePago;
	}

	public void setMediosDePago(HashSet<MedioDePago> mediosDePago) {
		this.mediosDePago = mediosDePago;
	}

	public Integer getDni() {
		return dni;
	}
public void agregarMedioDePago(MedioDePago medioDePago) {
	this.mediosDePago.add(medioDePago);
}
	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Consumidor other = (Consumidor) obj;
		return Objects.equals(dni, other.dni);
	}

	



}
