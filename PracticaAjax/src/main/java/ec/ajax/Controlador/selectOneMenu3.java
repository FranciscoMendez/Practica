package ec.ajax.Controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import ec.ajax.Modelo.parroquia;

@ManagedBean
public class selectOneMenu3 {
	
	
	private String parametroParroquia;
	private parroquia encontrado = new parroquia(""); 
	private ArrayList<String> parroquia = new ArrayList<>();
	private List<parroquia> nombreparroquia = new ArrayList(Arrays.asList(
			new parroquia ("Checa"), 
			new parroquia ("San Jose"),
			new parroquia ("Puerto Milan"),
			new parroquia ("Auvegne")
			));
	
	

	public parroquia getEncontrado() {
		return encontrado;
	}

	public void setEncontrado(parroquia encontrado) {
		this.encontrado = encontrado;
	}

	public ArrayList<String> getParroquia() {
		return parroquia;
	}

	public void setParroquia(ArrayList<String> parroquia) {
		this.parroquia = parroquia;
	}

	public List<parroquia> getNombreparroquia() {
		return nombreparroquia;
	}

	public void setNombreparroquia(List<parroquia> nombreparroquia) {
		this.nombreparroquia = nombreparroquia;
	}

	public selectOneMenu3 () {
		for(parroquia p:nombreparroquia) {
			parroquia.add(p.getParroquia());
		}
	}
	
	
	public String getParametroParroquia() {
		return parametroParroquia;
	}

	public void setParametroParroquia(String parametroParroquia) {
		this.parametroParroquia = parametroParroquia;
	}

	public String validarPais() {
		for(parroquia p:nombreparroquia) {
			if(p.getParroquia().equals(parametroParroquia)) {
				encontrado = p;
			}
		}
		return null;
	}
}
