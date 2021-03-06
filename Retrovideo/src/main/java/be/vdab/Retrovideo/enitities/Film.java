package be.vdab.Retrovideo.enitities;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class Film {
	
	private final long id;
	@NotNull
	private final long genreId;
	@NotBlank
	private final String titel;
	@NotNull
	private final int voorraad;
	@NotNull
	private int gereserveerd;
	@NotNull
	private final BigDecimal prijs;
	
	public Film(long id, long genreId, String titel, int voorraad, int gereserveerd, BigDecimal prijs) {
		
		this.id = id;
		this.genreId = genreId;
		this.titel = titel;
		this.voorraad = voorraad;
		this.gereserveerd = gereserveerd;
		this.prijs = prijs;
	}
	
	public long getId() {
		
		return id;
	}
	
	public long getGenreId() {
		
		return genreId;
	}
	
	public String getTitel() {
		
		return titel;
	}
	
	public int getVoorraad() {
		
		return voorraad;
	}
	
	public void setGereserveerd(int gereserveerd) {

		this.gereserveerd = gereserveerd;
	}
	
	public int getGereserveerd() {
		
		return gereserveerd;
	}
	
	public BigDecimal getPrijs() {
		
		return prijs;
	}
	
	public int getBeschikbaar() {
		
		return voorraad - gereserveerd;
	}
}
