package ec.ajax.Controlador;


import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class contadorControlador {

	private int contador;

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	
	public String Recalcular() {
		this.contador = contador + 1;
		return contador+"";
	}
	
	
}
