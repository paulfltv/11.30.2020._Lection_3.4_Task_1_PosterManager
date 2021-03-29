package ru.netology.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;

import static org.junit.jupiter.api.Assertions.*;

class MoviePosterRepositoryTest {

	@Test
	void shouldSaveOne() {
		MoviePosterRepository repository = new MoviePosterRepository();
		MoviePoster eleventh = new MoviePoster();

		repository.save(eleventh);

		MoviePoster[] expected = new MoviePoster[] {eleventh};
		MoviePoster[] actual = repository.findAll();
		assertArrayEquals(expected, actual);
	}

	@Test
	void shouldRemoveIfExists() {
		MoviePosterRepository repository = new MoviePosterRepository();
		int idToRemove = 1;
		MoviePoster first = new MoviePoster(
				1, 1, "Bloodshot", "action", 16, true);
		MoviePoster second = new MoviePoster(
				2, 2, "Onward", "animated", 6, true);
		MoviePoster third = new MoviePoster(
				3, 3, "Hotel 'Belgrade'", "comedy", 6, true);
		MoviePoster fourth = new MoviePoster(
				4, 4, "The Gentlemen", "action", 18, true);
		MoviePoster fifth = new MoviePoster(
				5, 5, "The Invisible Man", "horror", 18, true);
		MoviePoster sixth = new MoviePoster(
				6, 6, "Trolls World Tour", "animated", 6, false);
		MoviePoster seventh = new MoviePoster(
				7, 7, "Number One", "comedy", 12, false);
		MoviePoster eighth = new MoviePoster(
				8, 8, "Storm Boy", "adventure", 6, false);
		MoviePoster ninth = new MoviePoster(
				9, 9, "Tosca", "music", 16, false);
		MoviePoster tenth = new MoviePoster(
				10, 10, "The Founder", "biopic", 16, false);

		repository.add(first);
		repository.add(second);
		repository.add(third);
		repository.add(fourth);
		repository.add(fifth);
		repository.add(sixth);
		repository.add(seventh);
		repository.add(eighth);
		repository.add(ninth);
		repository.add(tenth);

		repository.removeById(idToRemove);

		MoviePoster[] actual = repository.getAll();
		MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
		assertArrayEquals(expected, actual);
	}
	@Test
	@Disabled
	void shouldNotRemoveIfNotExists() {
		MoviePosterRepository repository = new MoviePosterRepository();
		int idToRemove = 11;
		MoviePoster first = new MoviePoster(
				1, 1, "Bloodshot", "action", 16, true);
		MoviePoster second = new MoviePoster(
				2, 2, "Onward", "animated", 6, true);
		MoviePoster third = new MoviePoster(
				3, 3, "Hotel 'Belgrade'", "comedy", 6, true);
		MoviePoster fourth = new MoviePoster(
				4, 4, "The Gentlemen", "action", 18, true);
		MoviePoster fifth = new MoviePoster(
				5, 5, "The Invisible Man", "horror", 18, true);
		MoviePoster sixth = new MoviePoster(
				6, 6, "Trolls World Tour", "animated", 6, false);
		MoviePoster seventh = new MoviePoster(
				7, 7, "Number One", "comedy", 12, false);
		MoviePoster eighth = new MoviePoster(
				8, 8, "Storm Boy", "adventure", 6, false);
		MoviePoster ninth = new MoviePoster(
				9, 9, "Tosca", "music", 16, false);
		MoviePoster tenth = new MoviePoster(
				10, 10, "The Founder", "biopic", 16, false);

		repository.add(first);
		repository.add(second);
		repository.add(third);
		repository.add(fourth);
		repository.add(fifth);
		repository.add(sixth);
		repository.add(seventh);
		repository.add(eighth);
		repository.add(ninth);
		repository.add(tenth);

		repository.removeById(idToRemove);

		MoviePoster[] actual = repository.getAll();
		MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

}