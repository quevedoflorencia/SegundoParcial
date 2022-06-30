package ar.edu.unlam.pb2;

public class CuentaBancaria extends MedioDePago implements Transferible{

	private String cBU_ESPERADO;
	private String eNTIDAD_ESPERADA;

	public CuentaBancaria(String cBU_ESPERADO, String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) {
		super(tITULAR_ESPERADO);
		this.cBU_ESPERADO=cBU_ESPERADO;
		this.eNTIDAD_ESPERADA=eNTIDAD_ESPERADA;
	}

	public String getcBU_ESPERADO() {
		return cBU_ESPERADO;
	}

	public void setcBU_ESPERADO(String cBU_ESPERADO) {
		this.cBU_ESPERADO = cBU_ESPERADO;
	}

	

	public String getCbu() {
		// TODO Auto-generated method stub
		return this.cBU_ESPERADO;
	}

	@Override
	public String getEntidad() {
		// TODO Auto-generated method stub
		return this.eNTIDAD_ESPERADA;
	}

	public String getTitular() {
		// TODO Auto-generated method stub
		return super.getTitularEsperado();
	}

}
