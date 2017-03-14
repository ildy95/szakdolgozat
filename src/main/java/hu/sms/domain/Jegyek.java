package hu.sms.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Jegyek")
public class Jegyek {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private int jegy;
	
	@Enumerated(EnumType.STRING)
	private Orak mibol;
	
	private String beirtanev;
	
	private Date beirasdatum;
	
	private String jegyok;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getJegy() {
		return jegy;
	}

	public void setJegy(int jegy) {
		this.jegy = jegy;
	}

	public Orak getMibol() {
		return mibol;
	}

	public void setMibol(Orak mibol) {
		this.mibol = mibol;
	}

	public String getBeirtanev() {
		return beirtanev;
	}

	public void setBeirtanev(String beirtanev) {
		this.beirtanev = beirtanev;
	}

	public Date getBeirasdatum() {
		return beirasdatum;
	}

	public void setBeirasdatum(Date beirasdatum) {
		this.beirasdatum = beirasdatum;
	}

	public String getJegyok() {
		return jegyok;
	}

	public void setJegyok(String jegyok) {
		this.jegyok = jegyok;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((beirasdatum == null) ? 0 : beirasdatum.hashCode());
		result = prime * result + ((beirtanev == null) ? 0 : beirtanev.hashCode());
		result = prime * result + jegy;
		result = prime * result + ((jegyok == null) ? 0 : jegyok.hashCode());
		result = prime * result + ((mibol == null) ? 0 : mibol.hashCode());
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
		Jegyek other = (Jegyek) obj;
		if (beirasdatum == null) {
			if (other.beirasdatum != null)
				return false;
		} else if (!beirasdatum.equals(other.beirasdatum))
			return false;
		if (beirtanev == null) {
			if (other.beirtanev != null)
				return false;
		} else if (!beirtanev.equals(other.beirtanev))
			return false;
		if (jegy != other.jegy)
			return false;
		if (jegyok == null) {
			if (other.jegyok != null)
				return false;
		} else if (!jegyok.equals(other.jegyok))
			return false;
		if (mibol != other.mibol)
			return false;
		return true;
	}
}
