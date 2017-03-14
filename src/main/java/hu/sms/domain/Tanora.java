package hu.sms.domain;

import java.io.Serializable;
import java.util.Date;
import javax.inject.Singleton;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Tanora")
@Singleton
public class Tanora implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Enumerated(EnumType.STRING)
	private Orak ora;
	
	private int emelet;
	
	private int terem;
	
	private String nap;
	
	private int idopont;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Orak getOra() {
		return ora;
	}
	public void setOra(Orak ora) {
		this.ora = ora;
	}
	public int getEmelet() {
		return emelet;
	}
	public void setEmelet(int emelet) {
		this.emelet = emelet;
	}
	public int getTerem() {
		return terem;
	}
	public void setTerem(int terem) {
		this.terem = terem;
	}
	public String getNap() {
		return nap;
	}
	public void setNap(String nap) {
		this.nap = nap;
	}
	public int getIdopont() {
		return idopont;
	}
	public void setIdopont(int idopont) {
		this.idopont = idopont;
	}
}
