package ru.netology.Film;

public class FilmManager {
    public Film[] films = new Film[0];
    private int limit;

    public FilmManager(int limit) {
        this.limit = limit;
    }

    public FilmManager() {
        this.limit = 5;
    }

    public void add(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        this.films = tmp;
    }

    public Film[] getFilms() {
        return films;
    }

    public Film[] findAll() {
        Film[] reversed = new Film[films.length];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = films[films.length - 1 - i];
        }
        return reversed;
    }

    public Film[] findLast() {
        int resultlengh;
        if (films.length < limit) {
            resultlengh = films.length;
        } else {
            resultlengh = limit;
        }
        Film[] tmp = new Film[resultlengh];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - 1 - i];
        }
        return tmp;
    }
}
