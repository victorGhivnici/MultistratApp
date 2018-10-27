package org.app.service.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Pozitie {
	@Id
	@GeneratedValue
	private Integer idPozitie;
	private String denumire;
	private String observatii;
	public Integer getIdPozitie() {
		return idPozitie;
	}
	public void setIdPozitie(Integer idPozitie) {
		this.idPozitie = idPozitie;
	}
	public String getDenumire() {
		return denumire;
	}
	public void setDenumire(String denumire) {
		this.denumire = denumire;
	}
	public String getObservatii() {
		return observatii;
	}
	public void setObservatii(String observatii) {
		this.observatii = observatii;
	}
	public Pozitie(Integer idPozitie, String denumire, String observatii) {
		super();
		this.idPozitie = idPozitie;
		this.denumire = denumire;
		this.observatii = observatii;
	}
	public Pozitie() {
		super();
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((denumire == null) ? 0 : denumire.hashCode());
		result = prime * result + ((idPozitie == null) ? 0 : idPozitie.hashCode());
		result = prime * result + ((observatii == null) ? 0 : observatii.hashCode());
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
		Pozitie other = (Pozitie) obj;
		if (denumire == null) {
			if (other.denumire != null)
				return false;
		} else if (!denumire.equals(other.denumire))
			return false;
		if (idPozitie == null) {
			if (other.idPozitie != null)
				return false;
		} else if (!idPozitie.equals(other.idPozitie))
			return false;
		if (observatii == null) {
			if (other.observatii != null)
				return false;
		} else if (!observatii.equals(other.observatii))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Pozitie [idPozitie=" + idPozitie + ", denumire=" + denumire + ", observatii=" + observatii + "]";
	}
	
}
