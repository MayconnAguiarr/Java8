package movies.application;

import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import movies.model.Client;
import movies.model.Location;
import movies.model.Movie;
import movies.repository.Movies;

public class ApplicationMovies {

	public static void main(String[] args) {
		System.out.printf("------------ Filmes Cadastrados -------------- \n");
		
		System.out.printf("%-30s %s\n", "Nome:", "Data de lançamento:");
		
		Movies movies = new Movies();		
		movies.all().forEach(m -> {
			System.out.printf("%-30s %s\n", m.getName(),
				m.getReleaseDate().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		});
		
		System.out.printf("------------ Filmes locados -------------- \n");
		
		List<Movie> rentedMovies = Arrays.asList(movies.findByCode(0), movies.findByCode(2));
		Location location = new Location(rentedMovies, new Client("Maycon Aguiar"));
		
		location.printReceipt();			
	}
}
