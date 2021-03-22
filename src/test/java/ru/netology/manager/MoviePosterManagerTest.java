package ru.netology.manager;
import lombok.Data;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.MoviePoster;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MoviePosterManagerTest {
	@Test
	public void shouldShowMoviesLimit() {
		MoviePosterManager manager = new MoviePosterManager(10);
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

		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);
		manager.add(tenth);

		MoviePoster[] actual = manager.getLast();
		MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldNotShowMoviesOverLimit() {
		MoviePosterManager manager = new MoviePosterManager(10);
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
		MoviePoster eleventh = new MoviePoster(
				11, 11, "Tunnel", "drama", 16, false);

		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);
		manager.add(tenth);
		manager.add(eleventh);

		MoviePoster[] actual = manager.getLast();
		MoviePoster[] expected = new MoviePoster[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowMoviesLessLimit() {
		MoviePosterManager manager = new MoviePosterManager(10);
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


		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);

		MoviePoster[] actual = manager.getLast();
		MoviePoster[] expected = new MoviePoster[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowAllMovies() {
		MoviePosterManager manager = new MoviePosterManager(10);
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
		MoviePoster eleventh = new MoviePoster(
				11, 11, "Tunnel", "drama", 16, false);

		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);
		manager.add(tenth);
		manager.add(eleventh);

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowTenMovies() {
		MoviePosterManager manager = new MoviePosterManager(10);
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

		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);
		manager.add(tenth);

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowNineMovies() {
		MoviePosterManager manager = new MoviePosterManager(10);
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

		manager.add(first);
		manager.add(second);
		manager.add(third);
		manager.add(fourth);
		manager.add(fifth);
		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowFiveMovies() {
		MoviePosterManager manager = new MoviePosterManager(10);
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

		manager.add(sixth);
		manager.add(seventh);
		manager.add(eighth);
		manager.add(ninth);
		manager.add(tenth);

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{tenth, ninth, eighth, seventh, sixth};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowOneMovie() {
		MoviePosterManager manager = new MoviePosterManager(10);
		MoviePoster first = new MoviePoster(
				1, 1, "Bloodshot", "action", 16, true);

		manager.add(first);

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{first};
		assertArrayEquals(expected, actual);
	}

	@Test
	public void shouldShowEmptyPoster() {
		MoviePosterManager manager = new MoviePosterManager();

		MoviePoster[] actual = manager.getAll();
		MoviePoster[] expected = new MoviePoster[]{};
		assertArrayEquals(expected, actual);
	}
}