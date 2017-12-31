package movies.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

import movies.model.Movie;

public class Movies {

	private static Movie[] movies = {
			new Movie("Sexta-feira 13", LocalDate.of(2010, Month.DECEMBER, 5), new BigDecimal(6)),
			new Movie("Pânico na Floresta", LocalDate.of(2013, Month.MARCH, 12), new BigDecimal(6)),
			new Movie("Pesadelo", LocalDate.of(2015, Month.JANUARY, 19), new BigDecimal(6)),
			new Movie("Elysium", LocalDate.of(2017, Month.APRIL, 2), new BigDecimal(10)),
			new Movie("12 Anos de Escravidão", LocalDate.of(2014, Month.MAY, 14), new BigDecimal(6)) };

	public List<Movie> all() {
		return Arrays.asList(movies);
	}
	
	public Movie findByCode(int code) {
		return movies[code];
	}
}
