package hu.sms.domain;

import java.util.EnumMap;

import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Ellenorzo")
public class Ellenorzo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@OneToMany(cascade=CascadeType.ALL, fetch = FetchType.EAGER)
	@MapKeyEnumerated(EnumType.STRING)
	private Map<Orak, Jegyeklista> tantargyak = new EnumMap<Orak, Jegyeklista>(Orak.class);
	
	private boolean megtekintve;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Map<Orak, Jegyeklista> getTantargyak() {
		return tantargyak;
	}

	public void setTantargyak(Map<Orak, Jegyeklista> tantargyak) {
		this.tantargyak = tantargyak;
	}

	public boolean isMegtekintve() {
		return megtekintve;
	}

	public void setMegtekintve(boolean megtekintve) {
		this.megtekintve = megtekintve;
	}
}
