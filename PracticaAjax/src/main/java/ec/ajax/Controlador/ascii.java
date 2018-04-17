package ec.ajax.Controlador;


import javax.faces.bean.ManagedBean;

@ManagedBean
public class ascii {
	//hola
	private int ascii;
	private char tecla;
	
	public int getAscii() {
		return ascii;
	}

	public void setAscii(int ascii) {
		this.ascii = ascii;
	}

	public char getTecla() {
		return tecla;
	}

	public void setTecla(char tecla) {
		this.tecla = tecla;
	}

	public String codigoAscii(){
		ascii = (int)tecla;
		return null;
	}

}
