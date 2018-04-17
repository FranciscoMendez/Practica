package ec.ajax.Controlador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.faces.bean.ManagedBean;
import ec.ajax.Modelo.*;

@ManagedBean
public class selectOneMenu {
	
	
	private String parametroPais;
	private pais encontrado = new pais(""); 
	private ArrayList<String> pais = new ArrayList<>();
	private List<pais> nombrepais = new ArrayList(Arrays.asList(
			new pais ("Ecuador"), 
			new pais ("España"),
			new pais ("Italia"),
			new pais ("Francia")
			));
	
	
	public pais getEncontrado() {
		return encontrado;
	}
	public void setEncontrado(pais encontrado) {
		this.encontrado = encontrado;
	}
	public ArrayList<String> getPais() {
		return pais;
	}
	public void setPais(ArrayList<String> pais) {
		this.pais = pais;
	}
	public List<pais> getNombrepais() {
		return nombrepais;
	}
	public void setNombrepais(List<pais> nombrepais) {
		this.nombrepais = nombrepais;
	}
	
	public selectOneMenu () {
		for(pais p:nombrepais) {
			pais.add(p.getNombrePais());
		}
	}
	
	public String getParametroPais() {
		return parametroPais;
	}
	public void setParametroPais(String parametroPais) {
		this.parametroPais = parametroPais;
	}
	
	public String validarPais() {
		for(pais p:nombrepais) {
			if(p.getNombrePais().equals(parametroPais)) {
				encontrado = p;
			}
		}
		return null;
	}
}
