package it.alfasoft.martina.request;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;
@ManagedBean(name="utente",eager=true)
public class Utente implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String username;
	private String password;
	private int eta;
	private String cellulare;
	private String codiceFiscale;
	
	public Utente(){
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getEta() {
		return eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getCellulare() {
		return cellulare;
	}

	public void setCellulare(String cellulare) {
		this.cellulare = cellulare;
	}

	public String getCodiceFiscale() {
		return codiceFiscale;
	}

	public void setCodiceFiscale(String codiceFiscale) {
		this.codiceFiscale = codiceFiscale;
	}
	
	public void validazioneCodFiscale(FacesContext context, 
			                          UIComponent component,
			                          Object value) throws ValidatorException{
		
		if(value==null){
			return;
		}
		String dato=value.toString();
		if(dato.startsWith("AAA")){
			FacesMessage msg= new FacesMessage("Il Codice Fiscale è SBAGLIATO!");
			throw new ValidatorException(msg);
		}
		
	}

}
