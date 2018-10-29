package org.app.service.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Persoana {
	private String adresa;
	@Id
	private String CNP;
	private Date dataNasterii;
	private String email;
	private String numePrenume;
	private String telefon;
	public String getAdresa() {
		return adresa;
	}
	public void setAdresa(String adresa) {
		this.adresa = adresa;
	}
	public String getCNP() {
		return CNP;
	}
	public void setCNP(String cNP) {
		CNP = cNP;
	}
	public Date getDataNasterii() {
		return dataNasterii;
	}
	public void setDataNasterii(Date dataNasterii) {
		this.dataNasterii = dataNasterii;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumePrenume() {
		return numePrenume;
	}
	public void setNumePrenume(String numePrenume) {
		this.numePrenume = numePrenume;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public Persoana(String adresa, String cNP, Date dataNasterii, String email, String numePrenume, String telefon) {
		super();
		this.adresa = adresa;
		CNP = cNP;
		this.dataNasterii = dataNasterii;
		this.email = email;
		this.numePrenume = numePrenume;
		this.telefon = telefon;
	}
	public Persoana() {
		super();
	}
	@Override
	public String toString() {
		return "Persoana [adresa=" + adresa + ", CNP=" + CNP + ", dataNasterii=" + dataNasterii + ", email=" + email
				+ ", numePrenume=" + numePrenume + ", telefon=" + telefon + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CNP == null) ? 0 : CNP.hashCode());
		result = prime * result + ((adresa == null) ? 0 : adresa.hashCode());
		result = prime * result + ((dataNasterii == null) ? 0 : dataNasterii.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((numePrenume == null) ? 0 : numePrenume.hashCode());
		result = prime * result + ((telefon == null) ? 0 : telefon.hashCode());
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
		Persoana other = (Persoana) obj;
		if (CNP == null) {
			if (other.CNP != null)
				return false;
		} else if (!CNP.equals(other.CNP))
			return false;
		if (adresa == null) {
			if (other.adresa != null)
				return false;
		} else if (!adresa.equals(other.adresa))
			return false;
		if (dataNasterii == null) {
			if (other.dataNasterii != null)
				return false;
		} else if (!dataNasterii.equals(other.dataNasterii))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (numePrenume == null) {
			if (other.numePrenume != null)
				return false;
		} else if (!numePrenume.equals(other.numePrenume))
			return false;
		if (telefon == null) {
			if (other.telefon != null)
				return false;
		} else if (!telefon.equals(other.telefon))
			return false;
		return true;
	}

}
