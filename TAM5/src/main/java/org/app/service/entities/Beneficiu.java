package org.app.service.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Beneficiu {
	@Id
	@GeneratedValue
	private Integer idBeneficiu;
	private String denumireBeneficiu;
	private Double valoare;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Angajat>listaBeneficii = new ArrayList<Angajat>();
	public Integer getIdBeneficiu() {
		return idBeneficiu;
	}
	public void setIdBeneficiu(Integer idBeneficiu) {
		this.idBeneficiu = idBeneficiu;
	}
	public String getDenumireBeneficiu() {
		return denumireBeneficiu;
	}
	public void setDenumireBeneficiu(String denumireBeneficiu) {
		this.denumireBeneficiu = denumireBeneficiu;
	}
	public Double getValoare() {
		return valoare;
	}
	public void setValoare(Double valoare) {
		this.valoare = valoare;
	}
	public List<Angajat> getListaBeneficii() {
		return listaBeneficii;
	}
	public void setListaBeneficii(List<Angajat> listaBeneficii) {
		this.listaBeneficii = listaBeneficii;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denumireBeneficiu == null) ? 0 : denumireBeneficiu.hashCode());
		result = prime * result + ((idBeneficiu == null) ? 0 : idBeneficiu.hashCode());
		result = prime * result + ((listaBeneficii == null) ? 0 : listaBeneficii.hashCode());
		result = prime * result + ((valoare == null) ? 0 : valoare.hashCode());
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
		Beneficiu other = (Beneficiu) obj;
		if (denumireBeneficiu == null) {
			if (other.denumireBeneficiu != null)
				return false;
		} else if (!denumireBeneficiu.equals(other.denumireBeneficiu))
			return false;
		if (idBeneficiu == null) {
			if (other.idBeneficiu != null)
				return false;
		} else if (!idBeneficiu.equals(other.idBeneficiu))
			return false;
		if (listaBeneficii == null) {
			if (other.listaBeneficii != null)
				return false;
		} else if (!listaBeneficii.equals(other.listaBeneficii))
			return false;
		if (valoare == null) {
			if (other.valoare != null)
				return false;
		} else if (!valoare.equals(other.valoare))
			return false;
		return true;
	}
	public Beneficiu(Integer idBeneficiu, String denumireBeneficiu, Double valoare, List<Angajat> listaBeneficii) {
		super();
		this.idBeneficiu = idBeneficiu;
		this.denumireBeneficiu = denumireBeneficiu;
		this.valoare = valoare;
		this.listaBeneficii = listaBeneficii;
	}
	public Beneficiu() {
		super();
	}
	@Override
	public String toString() {
		return "Beneficiu [idBeneficiu=" + idBeneficiu + ", denumireBeneficiu=" + denumireBeneficiu + ", valoare="
				+ valoare + ", listaBeneficii=" + listaBeneficii + "]";
	}
	
}