package org.app.service.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pontaj {
	@ManyToOne(cascade = CascadeType.ALL)
	private Angajat codAngajat;
	@Id
	private Integer idPontaj;
	private Date data;
	private Integer oraDelogare;
	private Integer oraLogare;
	public Angajat getCodAngajat() {
		return codAngajat;
	}
	public void setCodAngajat(Angajat codAngajat) {
		this.codAngajat = codAngajat;
	}
	public Integer getIdPontaj() {
		return idPontaj;
	}
	public void setIdPontaj(Integer idPontaj) {
		this.idPontaj = idPontaj;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Integer getOraDelogare() {
		return oraDelogare;
	}
	public void setOraDelogare(Integer oraDelogare) {
		this.oraDelogare = oraDelogare;
	}
	public Integer getOraLogare() {
		return oraLogare;
	}
	public void setOraLogare(Integer oraLogare) {
		this.oraLogare = oraLogare;
	}
	public Pontaj(Angajat codAngajat, Integer idPontaj, Date data, Integer oraDelogare, Integer oraLogare) {
		super();
		this.codAngajat = codAngajat;
		this.idPontaj = idPontaj;
		this.data = data;
		this.oraDelogare = oraDelogare;
		this.oraLogare = oraLogare;
	}
	public Pontaj() {
		super();
	}
	@Override
	public String toString() {
		return "Pontaj [codAngajat=" + codAngajat + ", idPontaj=" + idPontaj + ", data=" + data + ", oraDelogare="
				+ oraDelogare + ", oraLogare=" + oraLogare + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAngajat == null) ? 0 : codAngajat.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((idPontaj == null) ? 0 : idPontaj.hashCode());
		result = prime * result + ((oraDelogare == null) ? 0 : oraDelogare.hashCode());
		result = prime * result + ((oraLogare == null) ? 0 : oraLogare.hashCode());
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
		Pontaj other = (Pontaj) obj;
		if (codAngajat == null) {
			if (other.codAngajat != null)
				return false;
		} else if (!codAngajat.equals(other.codAngajat))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (idPontaj == null) {
			if (other.idPontaj != null)
				return false;
		} else if (!idPontaj.equals(other.idPontaj))
			return false;
		if (oraDelogare == null) {
			if (other.oraDelogare != null)
				return false;
		} else if (!oraDelogare.equals(other.oraDelogare))
			return false;
		if (oraLogare == null) {
			if (other.oraLogare != null)
				return false;
		} else if (!oraLogare.equals(other.oraLogare))
			return false;
		return true;
	}
	
	
}
