package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Departament {
	@Id
	@GeneratedValue
	private Integer codDepartament;
	private String denumire;
	private Integer nrMembri;
	private String tip;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Pozitie>pozitiiDepartament = new ArrayList<Pozitie>();
	
	public Departament() {
		super();
	}

	public Departament(Integer codDepartament, String denumire, Integer nrMembri, String tip,
			List<Pozitie> pozitiiDepartament) {
		super();
		this.codDepartament = codDepartament;
		this.denumire = denumire;
		this.nrMembri = nrMembri;
		this.tip = tip;
		this.pozitiiDepartament = pozitiiDepartament;
	}

	@Override
	public String toString() {
		return "Departament [codDepartament=" + codDepartament + ", denumire=" + denumire + ", nrMembri=" + nrMembri
				+ ", tip=" + tip + ", pozitiiDepartament=" + pozitiiDepartament + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codDepartament == null) ? 0 : codDepartament.hashCode());
		result = prime * result + ((denumire == null) ? 0 : denumire.hashCode());
		result = prime * result + ((nrMembri == null) ? 0 : nrMembri.hashCode());
		result = prime * result + ((pozitiiDepartament == null) ? 0 : pozitiiDepartament.hashCode());
		result = prime * result + ((tip == null) ? 0 : tip.hashCode());
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
		Departament other = (Departament) obj;
		if (codDepartament == null) {
			if (other.codDepartament != null)
				return false;
		} else if (!codDepartament.equals(other.codDepartament))
			return false;
		if (denumire == null) {
			if (other.denumire != null)
				return false;
		} else if (!denumire.equals(other.denumire))
			return false;
		if (nrMembri == null) {
			if (other.nrMembri != null)
				return false;
		} else if (!nrMembri.equals(other.nrMembri))
			return false;
		if (pozitiiDepartament == null) {
			if (other.pozitiiDepartament != null)
				return false;
		} else if (!pozitiiDepartament.equals(other.pozitiiDepartament))
			return false;
		if (tip == null) {
			if (other.tip != null)
				return false;
		} else if (!tip.equals(other.tip))
			return false;
		return true;
	}

	public Integer getCodDepartament() {
		return codDepartament;
	}

	public void setCodDepartament(Integer codDepartament) {
		this.codDepartament = codDepartament;
	}

	public String getDenumire() {
		return denumire;
	}

	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}

	public Integer getNrMembri() {
		return nrMembri;
	}

	public void setNrMembri(Integer nrMembri) {
		this.nrMembri = nrMembri;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public List<Pozitie> getPozitiiDepartament() {
		return pozitiiDepartament;
	}

	public void setPozitiiDepartament(List<Pozitie> pozitiiDepartament) {
		this.pozitiiDepartament = pozitiiDepartament;
	}

	
}
