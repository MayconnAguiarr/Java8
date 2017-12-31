package movies.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Location {

	private List<Movie> movies;
	private Client client;
	private LocalDateTime date;
	private Devolution devolution;

	public Location(List<Movie> movies, Client client) {
		this.movies = movies;
		this.client = client;
		this.date = LocalDateTime.now();
		this.generateDevolution();
	}

	private void generateDevolution() {
		this.devolution = new Devolution(LocalDateTime.of(calculateEstimatedDate(), LocalTime.of(19, 0)));
	}

	private LocalDate calculateEstimatedDate() {
		return this.date.plusDays(this.movies.size()).toLocalDate();
	}

	public void printReceipt() {
		System.out.printf("Obrigado %s.\n", this.client.getName());
		System.out.println("Filme(s):");

		BigDecimal total = BigDecimal.ZERO;
		
		for (Movie movie : this.getMovies()) {
			System.out.println(movie.getName());
			total = total.add(movie.getValue());
		}
				
		System.out.printf("Valor total: R$%s\n", total);
		System.out.printf("date devolução: %s",
				this.getDevolution().getExpectedDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public Devolution getDevolution() {
		return devolution;
	}
}
