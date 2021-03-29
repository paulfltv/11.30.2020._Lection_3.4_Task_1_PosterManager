package ru.netology.repository;

import ru.netology.domain.MoviePoster;

public class MoviePosterRepository {
	private MoviePoster[] items = new MoviePoster[0];

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

	public void save(MoviePoster item) {
		int length = items.length + 1;
		MoviePoster[] tmp = new MoviePoster[length];
		System.arraycopy(items, 0, tmp, 0, items.length);
		int lastIndex = tmp.length - 1;
		tmp[lastIndex] = item;
		items = tmp;
	}

	public MoviePoster findById(int id) {

		for (MoviePoster item : items) {
			if (item.getId() == id) {
				return item;
			}
		}
		return null;
	}

	public MoviePoster[] findAll() {
		return items;
	}

	public void removeById(int id) {
		int length = items.length - 1;
		MoviePoster[] tmp = new MoviePoster[length];
		int index = 0;
		for (MoviePoster item : items) {
			if (item.getId() != id) {
				tmp[index] = item;
				index++;
			}
		}
		items = tmp;
	}

	public void removeAll(MoviePoster[] items, MoviePoster value) {
		int length = items.length;
		if (length > 0)
			items[0] = value;
		for (int i = 1; i < length; i += i)
			System.arraycopy(items, 0, items, i, Math.min((length - i), i));
	}
}
