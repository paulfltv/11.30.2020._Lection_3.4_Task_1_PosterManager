package ru.netology.manager;
import ru.netology.domain.MoviePoster;

class MoviePosterManager {

	int movieLimit = 10;
	private MoviePoster[] items = new MoviePoster[0];


	public MoviePosterManager() {
	}

	public MoviePosterManager(int movieLimit) {
		this.movieLimit = movieLimit;
	}

	public int getMovieLimit() {
		return movieLimit;
	}
	public void setMovieLimit(int movieLimit) {
		this.movieLimit = movieLimit;
	}

	public void add(MoviePoster item) {
		int length = items.length + 1;
		MoviePoster[] tmp = new MoviePoster[length];
		System.arraycopy(items, 0, tmp, 0, items.length);
		int lastIndex = tmp.length - 1;
		tmp[lastIndex] = item;
		items = tmp;
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
		MoviePoster[] result = new MoviePoster[items.length];
		for (int i = items.length - 5; i < result.length; i++) {
			int index = items.length - i - 1;
			result[i] = items[index];
		}
		return result;
	}
}
