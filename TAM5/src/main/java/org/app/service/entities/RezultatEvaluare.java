package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;

@Entity
public class RezultatEvaluare extends Evaluare {
	private Date dataAfisare;
	private Double punctaj;
	private String status;
	public Date getDataAfisare() {
		return dataAfisare;
	}
	public void setDataAfisare(Date dataAfisare) {
		this.dataAfisare = dataAfisare;
	}
	public Double getPunctaj() {
		return punctaj;
	}
	public void setPunctaj(Double punctaj) {
		this.punctaj = punctaj;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public RezultatEvaluare(Integer idEvaluare, String denumire, String tip, Date dataSustinere, Date dataAfisare,
			Double punctaj, String status) {
		super(idEvaluare, denumire, tip, dataSustinere);
		this.dataAfisare = dataAfisare;
		this.punctaj = punctaj;
		this.status = status;
	}
	public RezultatEvaluare() {
		super();
	}
	@Override
	public String toString() {
		return "RezultatEvaluare [dataAfisare=" + dataAfisare + ", punctaj=" + punctaj + ", status=" + status + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((dataAfisare == null) ? 0 : dataAfisare.hashCode());
		result = prime * result + ((punctaj == null) ? 0 : punctaj.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		RezultatEvaluare other = (RezultatEvaluare) obj;
		if (dataAfisare == null) {
			if (other.dataAfisare != null)
				return false;
		} else if (!dataAfisare.equals(other.dataAfisare))
			return false;
		if (punctaj == null) {
			if (other.punctaj != null)
				return false;
		} else if (!punctaj.equals(other.punctaj))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	
}
