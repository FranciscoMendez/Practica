package ec.ajax.Controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import ec.ajax.Modelo.ciudad;

@ManagedBean
public class selectOneMenu2 {
	
	
	private String parametroCiudad;
	private ciudad encontrado = new ciudad(""); 
	private ArrayList<String> ciudad = new ArrayList<>();
	private List<ciudad> nombreciudad = new ArrayList(Arrays.asList(
			new ciudad ("quito"), 
			new ciudad ("TERUEL"),
			new ciudad ("Florencia"),
			new ciudad ("Paris")
			));
	
	public ciudad getEncontrado() {
		return encontrado;
	}

	public void setEncontrado(ciudad encontrado) {
		this.encontrado = encontrado;
	}

	public ArrayList<String> getCiudad() {
		return ciudad;
	}

	public void setCiudad(ArrayList<String> ciudad) {
		this.ciudad = ciudad;
	}

	public List<ciudad> getNombreciudad() {
		return nombreciudad;
	}

	public void setNombreciudad(List<ciudad> nombreciudad) {
		this.nombreciudad = nombreciudad;
	}

	public selectOneMenu2 () {
		for(ciudad p:nombreciudad) {
			ciudad.add(p.getCiudad());
		}
	}
	
	public String getParametroCiudad() {
		return parametroCiudad;
	}

	public void setParametroCiudad(String parametroCiudad) {
		this.parametroCiudad = parametroCiudad;
	}

	public String validarPais() {
		for(ciudad c:nombreciudad) {
			if(c.getCiudad().equals(parametroCiudad)) {
				encontrado = c;
			}
		}
		return null;
	}
}
