package org.app.service.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ContractMunca {
	@Id
	@GeneratedValue
	private Integer idContract;
	@ManyToOne(cascade=CascadeType.ALL)
	private Angajat nrContract;
	private Date dataIncheiere;
	private String observatii;
	private Double salariu;
	public Integer getIdContract() {
		return idContract;
	}
	public void setIdContract(Integer idContract) {
		this.idContract = idContract;
	}
	public Angajat getNrContract() {
		return nrContract;
	}
	public void setNrContract(Angajat nrContract) {
		this.nrContract = nrContract;
	}
	public Date getDataIncheiere() {
		return dataIncheiere;
	}
	public void setDataIncheiere(Date dataIncheiere) {
		this.dataIncheiere = dataIncheiere;
	}
	public String getObservatii() {
		return observatii;
	}
	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}
	public Double getSalariu() {
		return salariu;
	}
	public void setSalariu(Double salariu) {
		this.salariu = salariu;
	}
	public ContractMunca(Integer idContract, Angajat nrContract, Date dataIncheiere, String observatii,
			Double salariu) {
		super();
		this.idContract = idContract;
		this.nrContract = nrContract;
		this.dataIncheiere = dataIncheiere;
		this.observatii = observatii;
		this.salariu = salariu;
	}
	public ContractMunca() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataIncheiere == null) ? 0 : dataIncheiere.hashCode());
		result = prime * result + ((idContract == null) ? 0 : idContract.hashCode());
		result = prime * result + ((nrContract == null) ? 0 : nrContract.hashCode());
		result = prime * result + ((observatii == null) ? 0 : observatii.hashCode());
		result = prime * result + ((salariu == null) ? 0 : salariu.hashCode());
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
		ContractMunca other = (ContractMunca) obj;
		if (dataIncheiere == null) {
			if (other.dataIncheiere != null)
				return false;
		} else if (!dataIncheiere.equals(other.dataIncheiere))
			return false;
		if (idContract == null) {
			if (other.idContract != null)
				return false;
		} else if (!idContract.equals(other.idContract))
			return false;
		if (nrContract == null) {
			if (other.nrContract != null)
				return false;
		} else if (!nrContract.equals(other.nrContract))
			return false;
		if (observatii == null) {
			if (other.observatii != null)
				return false;
		} else if (!observatii.equals(other.observatii))
			return false;
		if (salariu == null) {
			if (other.salariu != null)
				return false;
		} else if (!salariu.equals(other.salariu))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ContractMunca [idContract=" + idContract + ", nrContract=" + nrContract + ", dataIncheiere="
				+ dataIncheiere + ", observatii=" + observatii + ", salariu=" + salariu + "]";
	}
	
	
}
