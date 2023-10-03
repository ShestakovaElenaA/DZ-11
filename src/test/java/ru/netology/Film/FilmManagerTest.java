package ru.netology.Film;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class FilmManagerTest {

    Film film1 = new Film(1, "Бладшот");
    Film film2 = new Film(2, "Вперёд");
    Film film3 = new Film(3, "Отлель Белград");
    Film film4 = new Film(4, "Джентельмены");
    Film film5 = new Film(5, "Человек-неведимка");
    Film film6 = new Film(6, "Тролли.Мировой тур");
    Film film7 = new Film(7, "Номер один");


    @Test
    public void testadd3() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = FilmManager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testadd1() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film1);

        Film[] expected = {film1};
        Film[] actual = FilmManager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testadd0() {
        FilmManager FilmManager = new FilmManager();

        Film[] expected = {};
        Film[] actual = FilmManager.getFilms();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindAll1() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film6);

        Film[] expected = {film6};
        Film[] actual = FilmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindAll0() {
        FilmManager FilmManager = new FilmManager();

        Film[] expected = {};
        Film[] actual = FilmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindAll5() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film3);
        FilmManager.add(film4);
        FilmManager.add(film5);

        Film[] expected = {film5, film4, film3, film2, film1};
        Film[] actual = FilmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindAll5random() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film3);
        FilmManager.add(film6);
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film5);

        Film[] expected = {film5, film2, film1, film6, film3};
        Film[] actual = FilmManager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast5of5withalimit5() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film3);
        FilmManager.add(film6);
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film5);

        Film[] expected = {film5, film2, film1, film6, film3};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast5of6withalimit5() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film3);
        FilmManager.add(film6);
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film5);
        FilmManager.add(film4);

        Film[] expected = {film4, film5, film2, film1, film6};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast5of4withalimit5() {
        FilmManager FilmManager = new FilmManager();
        FilmManager.add(film3);
        FilmManager.add(film6);
        FilmManager.add(film1);
        FilmManager.add(film2);

        Film[] expected = {film2, film1, film6, film3};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast5of0withalimit5() {
        FilmManager FilmManager = new FilmManager();

        Film[] expected = {};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast3of3withalimit3() {
        FilmManager FilmManager = new FilmManager(3);
        FilmManager.add(film3);
        FilmManager.add(film6);
        FilmManager.add(film1);

        Film[] expected = {film1, film6, film3};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast3of5withalimit3() {
        FilmManager FilmManager = new FilmManager(3);
        FilmManager.add(film1);
        FilmManager.add(film2);
        FilmManager.add(film3);
        FilmManager.add(film4);
        FilmManager.add(film5);

        Film[] expected = {film5, film4, film3};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast3of2withalimit3() {
        FilmManager FilmManager = new FilmManager(3);
        FilmManager.add(film1);
        FilmManager.add(film2);

        Film[] expected = {film2, film1};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testfindlast3of0withalimit3() {
        FilmManager FilmManager = new FilmManager(3);

        Film[] expected = {};
        Film[] actual = FilmManager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}