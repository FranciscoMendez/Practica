package ec.ajax.Controlador;


import java.util.Date;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class fecha {

	private Date fecha;
	
	
	
	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String calculaFecha() {
		java.util.Date fechaS = new Date();
		fecha =  fechaS;
		return null;
	}
}
