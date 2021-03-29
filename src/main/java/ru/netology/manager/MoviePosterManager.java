package ru.netology.manager;

import ru.netology.domain.MoviePoster;
import ru.netology.repository.MoviePosterRepository;

public class MoviePosterManager {

	int movieLimit = 10;
	private MoviePoster[] items = new MoviePoster[0];
	private MoviePosterRepository repository;

	public MoviePosterManager() {
	}

	public MoviePosterManager(int movieLimit) {
		this.movieLimit = movieLimit;
	}

	public MoviePosterManager(MoviePosterRepository repository) {
		this.repository = repository;
	}

	public int getMovieLimit() { return movieLimit; }

	public void setMovieLimit(int movieLimit) { this.movieLimit = movieLimit; }

	public void add(MoviePoster item) {
		repository.save(item);
	}

	public MoviePoster[] getAll() {
		MoviePoster[] result = new MoviePoster[items.length];
		for (int i = 0; i < result.length; i++) {
			int index = items.length - i - 1;
			result[i] = items[index];
		}
		return result;
	}

	public MoviePoster[] getLast() {
		int length = items.length;
		if (length >= movieLimit) {
			length = movieLimit;
			MoviePoster[] result = new MoviePoster[length];
			for (int i = 0; i < result.length; i++) {
				int index = items.length - i - 1;
				result[i] = items[index];
			}
			return result;
		}
	}

	public void removeById(int id) {
		repository.removeById(id);
	}
}
