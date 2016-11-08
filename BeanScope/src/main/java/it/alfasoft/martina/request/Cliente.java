package it.alfasoft.martina.request;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="c", eager=true)
public class Cliente implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String citta;
	private String squadra;
	
	private List<String> cities = new ArrayList<String>();
	private List<String> squadre = new ArrayList<String>();
	private List<String> squadreScelte = new ArrayList<String>();
	
	public Cliente(){
		
		citta="Milano";
		cities.add("Torino");
		cities.add("Milano");
		cities.add("Roma");
		
		squadre.add("Juventus");
		squadre.add("Inter");
		squadre.add("Sampdoria");
	}

	public Cliente(String citta) {
		this.citta = citta;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<String> getCities() {
		return cities;
	}

	public void setCities(List<String> cities) {
		this.cities = cities;
	}

	public String getSquadra() {
		return squadra;
	}

	public void setSquadra(String squadra) {
		this.squadra = squadra;
	}

	public List<String> getSquadre() {
		return squadre;
	}

	public void setSquadre(List<String> squadre) {
		this.squadre = squadre;
	}

	public List<String> getSquadreScelte() {
		return squadreScelte;
	}

	public void setSquadreScelte(List<String> squadreScelte) {
		this.squadreScelte = squadreScelte;
	}

}
