package hu.sms.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "Osztaly")
public class Osztaly implements Serializable {

	@Id
	@GeneratedValue(strategy= GenerationType.TABLE)
	private Long id;

	private String nev;

	private int evfolyam;
	
	private String teljesnev = evfolyam + nev;

	@OneToMany(cascade= {CascadeType.ALL}, fetch=FetchType.EAGER)
	private List<Felhasznalo> fh;

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Orarend orarend;

	@OneToOne(cascade = CascadeType.MERGE)
	private Felhasznalo osztalyfonok;

	int letszam = fh == null ? 0 : fh.size();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNev() {
		return nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

	public int getEvfolyam() {
		return evfolyam;
	}

	public void setEvfolyam(int evfolyam) {
		this.evfolyam = evfolyam;
	}

	public List<Felhasznalo> getFh() {
		return fh;
	}

	public void setFh(List<Felhasznalo> fh) {
		this.fh = fh;
	}

	public Orarend getOrarend() {
		return orarend;
	}

	public void setOrarend(Orarend orarend) {
		this.orarend = orarend;
	}

	public Felhasznalo getOsztalyfonok() {
		return osztalyfonok;
	}

	public void setOsztalyfonok(Felhasznalo osztalyfonok) {
		this.osztalyfonok = osztalyfonok;
	}

	public int getLetszam() {
		return letszam;
	}

	public void setLetszam(int letszam) {
		this.letszam = letszam;
	}

	public String getTeljesnev() {
		return teljesnev;
	}

	public void setTeljesnev(String teljesnev) {
		this.teljesnev = teljesnev;
	}

}
