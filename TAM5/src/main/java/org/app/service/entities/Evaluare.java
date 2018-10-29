package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Evaluare {
	@Id
	@GeneratedValue
	private Integer idEvaluare;
	private String denumire;
	private String tip;
	private Date dataSustinere;
	public Integer getIdEvaluare() {
		return idEvaluare;
	}
	public void setIdEvaluare(Integer idEvaluare) {
		this.idEvaluare = idEvaluare;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Date getDataSustinere() {
		return dataSustinere;
	}
	public void setDataSustinere(Date dataSustinere) {
		this.dataSustinere = dataSustinere;
	}
	public Evaluare(Integer idEvaluare, String denumire, String tip, Date dataSustinere) {
		super();
		this.idEvaluare = idEvaluare;
		this.denumire = denumire;
		this.tip = tip;
		this.dataSustinere = dataSustinere;
	}
	public Evaluare() {
		super();
	}
	@Override
	public String toString() {
		return "Evaluare [idEvaluare=" + idEvaluare + ", denumire=" + denumire + ", tip=" + tip + ", dataSustinere="
				+ dataSustinere + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataSustinere == null) ? 0 : dataSustinere.hashCode());
		result = prime * result + ((denumire == null) ? 0 : denumire.hashCode());
		result = prime * result + ((idEvaluare == null) ? 0 : idEvaluare.hashCode());
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
		Evaluare other = (Evaluare) obj;
		if (dataSustinere == null) {
			if (other.dataSustinere != null)
				return false;
		} else if (!dataSustinere.equals(other.dataSustinere))
			return false;
		if (denumire == null) {
			if (other.denumire != null)
				return false;
		} else if (!denumire.equals(other.denumire))
			return false;
		if (idEvaluare == null) {
			if (other.idEvaluare != null)
				return false;
		} else if (!idEvaluare.equals(other.idEvaluare))
			return false;
		if (tip == null) {
			if (other.tip != null)
				return false;
		} else if (!tip.equals(other.tip))
			return false;
		return true;
	}
	
	
}
