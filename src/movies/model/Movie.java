package movies.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Movie {

	private String name;
	private LocalDate releaseDate;
	private BigDecimal value;

	public Movie(String name, LocalDate releaseDate, BigDecimal value) {
		this.name = name;
		this.releaseDate = releaseDate;
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public BigDecimal getValue() {
		return value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
	}	
}
