package hu.sms.domain;

import java.util.Date;
import java.util.List;

import javax.enterprise.inject.Default;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Felhasznalok")
public class Felhasznalo {

	@Id
	@NotNull
	private String azonosito;
	
	@NotNull
	private String nev;

	private String szulhely;

	private Date szulido;

	private int irszam;

	private String utca;

	private int hazszam;
	
	private String jelszo = "asdasd123";
	
	private String szuloijelszo = "asd123";
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private Szerepkor szerepkor;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Ellenorzo ell;

	boolean persisted = false;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Osztaly oszt;

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public String getSzulhely() {
		return szulhely;
	}

	public void setSzulhely(String szulhely) {
		this.szulhely = szulhely;
	}

	public Date getSzulido() {
		return szulido;
	}

	public void setSzulido(Date szulido) {
		this.szulido = szulido;
	}

	public int getIrszam() {
		return irszam;
	}

	public void setIrszam(int irszam) {
		this.irszam = irszam;
	}

	public String getUtca() {
		return utca;
	}

	public void setUtca(String utca) {
		this.utca = utca;
	}

	public int getHazszam() {
		return hazszam;
	}

	public void setHazszam(int hazszam) {
		this.hazszam = hazszam;
	}

	public String getAzonosito() {
		return azonosito;
	}

	public void setAzonosito(String azonosito) {
		this.azonosito = azonosito;
	}

	public String getJelszo() {
		return jelszo;
	}

	public void setJelszo(String jelszo) {
		this.jelszo = jelszo;
	}

	public Szerepkor getSzerepkor() {
		return szerepkor;
	}

	public void setSzerepkor(Szerepkor szerepkor) {
		this.szerepkor = szerepkor;
	}

	public Ellenorzo getEll() {
		return ell;
	}

	public void setEll(Ellenorzo ell) {
		this.ell = ell;
	}

	public boolean isPersisted() {
		return persisted;
	}

	public void setPersisted(boolean persisted) {
		this.persisted = persisted;
	}

	public Osztaly getOszt() {
		return oszt;
	}

	public void setOszt(Osztaly oszt) {
		this.oszt = oszt;
	}

	public String getSzuloijelszo() {
		return szuloijelszo;
	}

	public void setSzuloijelszo(String szuloijelszo) {
		this.szuloijelszo = szuloijelszo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((azonosito == null) ? 0 : azonosito.hashCode());
		result = prime * result + ((ell == null) ? 0 : ell.hashCode());
		result = prime * result + hazszam;
		result = prime * result + irszam;
		result = prime * result + ((jelszo == null) ? 0 : jelszo.hashCode());
		result = prime * result + ((nev == null) ? 0 : nev.hashCode());
		result = prime * result + ((oszt == null) ? 0 : oszt.hashCode());
		result = prime * result + (persisted ? 1231 : 1237);
		result = prime * result + ((szerepkor == null) ? 0 : szerepkor.hashCode());
		result = prime * result + ((szulhely == null) ? 0 : szulhely.hashCode());
		result = prime * result + ((szulido == null) ? 0 : szulido.hashCode());
		result = prime * result + ((utca == null) ? 0 : utca.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Felhasznalo other = (Felhasznalo) obj;
		if (azonosito == null) {
			if (other.azonosito != null)
				return false;
		} else if (!azonosito.equals(other.azonosito))
			return false;
		if (ell == null) {
			if (other.ell != null)
				return false;
		} else if (!ell.equals(other.ell))
			return false;
		if (hazszam != other.hazszam)
			return false;
		if (irszam != other.irszam)
			return false;
		if (jelszo == null) {
			if (other.jelszo != null)
				return false;
		} else if (!jelszo.equals(other.jelszo))
			return false;
		if (nev == null) {
			if (other.nev != null)
				return false;
		} else if (!nev.equals(other.nev))
			return false;
		if (oszt == null) {
			if (other.oszt != null)
				return false;
		} else if (!oszt.equals(other.oszt))
			return false;
		if (persisted != other.persisted)
			return false;
		if (szerepkor != other.szerepkor)
			return false;
		if (szulhely == null) {
			if (other.szulhely != null)
				return false;
		} else if (!szulhely.equals(other.szulhely))
			return false;
		if (szulido == null) {
			if (other.szulido != null)
				return false;
		} else if (!szulido.equals(other.szulido))
			return false;
		if (utca == null) {
			if (other.utca != null)
				return false;
		} else if (!utca.equals(other.utca))
			return false;
		return true;
	}

	

}
