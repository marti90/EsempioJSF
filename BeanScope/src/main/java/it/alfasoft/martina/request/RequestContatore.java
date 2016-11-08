package it.alfasoft.martina.request;

import java.io.Serializable;

//import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
//import javax.faces.bean.RequestScoped;
//import javax.faces.bean.SessionScoped;

@ManagedBean(name="contatore", eager=true)
//@RequestScoped                                       incrementa solo una volta
//@SessionScoped                                       incrementa ogni volta che clicco sul bottone, ogni browser ha un contatore diverso
//@ApplicationScoped                                   incrementa di uno ogni volta che clicco sul bottone, ma c'è un solo bean per tutti i browser
@ViewScoped                                          //incrementa finchè non cambio pagina, se cambio pagina non funziona
public class RequestContatore implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int cnt;
	
	public RequestContatore(){
		setCnt(0);
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	public String incrementa(){
		
		this.cnt++;
		return "secondaPaginaPerViewScope";
	}
}
