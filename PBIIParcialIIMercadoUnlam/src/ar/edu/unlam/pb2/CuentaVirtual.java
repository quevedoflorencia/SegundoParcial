package ar.edu.unlam.pb2;

public class CuentaVirtual extends MedioDePago implements Transferible {

	
	private String cVU_ESPERADO;
	private String eNTIDAD_ESPERADA;

	public CuentaVirtual(String cVU_ESPERADO, String eNTIDAD_ESPERADA, String tITULAR_ESPERADO) {
		super(tITULAR_ESPERADO);
		this.cVU_ESPERADO=cVU_ESPERADO;
		this.eNTIDAD_ESPERADA=eNTIDAD_ESPERADA;
	}

	@Override
	public String getEntidad() {
		// TODO Auto-generated method stub
		return this.eNTIDAD_ESPERADA;
	}

	public Object getCvu() {
		// TODO Auto-generated method stub
		return this.cVU_ESPERADO;
	}

	

}
