package ar.edu.unlam.pb2;

import java.util.Objects;

public class TarjetaDeCredito extends MedioDePago implements Pagadora {

	

	private Long nUMERO_ESPERADO;
	private String fECHA_DE_VENCIMIENTO_ESPERADO;
	private Integer cODIGO_DE_SEGURIDAD_ESPERADO;
	private Double lIMITE_COMPRA_EN_PESOS;
	private Double lIMITE_COMPRA_EN_DOLARES;

	public TarjetaDeCredito(Long nUMERO_ESPERADO, String tITULAR_ESPERADO, String fECHA_DE_VENCIMIENTO_ESPERADO,
			Integer cODIGO_DE_SEGURIDAD_ESPERADO, Double lIMITE_COMPRA_EN_PESOS, Double lIMITE_COMPRA_EN_DOLARES) {
		super(tITULAR_ESPERADO);
		this.nUMERO_ESPERADO=nUMERO_ESPERADO;
		this.fECHA_DE_VENCIMIENTO_ESPERADO=fECHA_DE_VENCIMIENTO_ESPERADO;
		this.cODIGO_DE_SEGURIDAD_ESPERADO=cODIGO_DE_SEGURIDAD_ESPERADO;
		this.lIMITE_COMPRA_EN_PESOS=lIMITE_COMPRA_EN_PESOS;
		this.lIMITE_COMPRA_EN_DOLARES=lIMITE_COMPRA_EN_DOLARES;
		
	}

	@Override
	public Long getNumero() {
		// TODO Auto-generated method stub
		return this.nUMERO_ESPERADO;
	}

	@Override
	public Integer getCodigoDeSeguridad() {
		// TODO Auto-generated method stub
		return this.cODIGO_DE_SEGURIDAD_ESPERADO;
	}

	@Override
	public String getFechaDeVencimiento() {
		// TODO Auto-generated method stub
		return this.fECHA_DE_VENCIMIENTO_ESPERADO;
	}

	@Override
	public String getTitular() {
		// TODO Auto-generated method stub
		return super.getTitularEsperado();
	}

	public Double getLimiteDeCompraEnPesos() {
		// TODO Auto-generated method stub
		return this.lIMITE_COMPRA_EN_PESOS;
	}

	public Double getLimiteDeCompraEnDolares() {
		// TODO Auto-generated method stub
		return this.lIMITE_COMPRA_EN_DOLARES;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nUMERO_ESPERADO);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		
		TarjetaDeCredito other = (TarjetaDeCredito) obj;
		return Objects.equals(nUMERO_ESPERADO, other.nUMERO_ESPERADO);
	}

}
