package org.app.service.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class Angajat extends Persoana {
	private Integer codAngajat;
	private Integer nrContract;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Evaluare>listaEvaluari = new ArrayList<Evaluare>();

	public Integer getCodAngajat() {
		return codAngajat;
	}

	public void setCodAngajat(Integer codAngajat) {
		this.codAngajat = codAngajat;
	}

	public Integer getNrContract() {
		return nrContract;
	}

	public void setNrContract(Integer nrContract) {
		this.nrContract = nrContract;
	}

	public List<Evaluare> getListaEvaluari() {
		return listaEvaluari;
	}

	public void setListaEvaluari(List<Evaluare> listaEvaluari) {
		this.listaEvaluari = listaEvaluari;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((codAngajat == null) ? 0 : codAngajat.hashCode());
		result = prime * result + ((listaEvaluari == null) ? 0 : listaEvaluari.hashCode());
		result = prime * result + ((nrContract == null) ? 0 : nrContract.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Angajat other = (Angajat) obj;
		if (codAngajat == null) {
			if (other.codAngajat != null)
				return false;
		} else if (!codAngajat.equals(other.codAngajat))
			return false;
		if (listaEvaluari == null) {
			if (other.listaEvaluari != null)
				return false;
		} else if (!listaEvaluari.equals(other.listaEvaluari))
			return false;
		if (nrContract == null) {
			if (other.nrContract != null)
				return false;
		} else if (!nrContract.equals(other.nrContract))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Angajat [codAngajat=" + codAngajat + ", nrContract=" + nrContract + ", listaEvaluari=" + listaEvaluari
				+ "]";
	}

	public Angajat(String adresa, String cNP, Date dataNasterii, String email, String numePrenume, String telefon,
			Integer codAngajat, Integer nrContract, List<Evaluare> listaEvaluari) {
		super(adresa, cNP, dataNasterii, email, numePrenume, telefon);
		this.codAngajat = codAngajat;
		this.nrContract = nrContract;
		this.listaEvaluari = listaEvaluari;
	}

	public Angajat(Integer codAngajat, Integer nrContract, List<Evaluare> listaEvaluari) {
		super();
		this.codAngajat = codAngajat;
		this.nrContract = nrContract;
		this.listaEvaluari = listaEvaluari;
	}

	public Angajat() {
		super();
	}
	
	
}
