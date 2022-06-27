package ru.netology.AfishaMosckitoJava;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoviesManagerTest {

    @Test
    public void shouldFindAll() {
        MoviesManager manager = new MoviesManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");

        String[] actual = manager.findAll();
        String[] expected = {
                "f1",
                "f2",
                "f3"
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAllWithLimit() {
        MoviesManager manager = new MoviesManager(12);
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");
        manager.add("f11");
        manager.add("f12");

        String[] actual = manager.findAll();
        String[] expected = {
                "f1",
                "f2",
                "f3",
                "f4",
                "f5",
                "f6",
                "f7",
                "f8",
                "f9",
                "f10",
                "f11",
                "f12",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastWithLimit() {
        MoviesManager manager = new MoviesManager(10);
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");
        manager.add("f11");
        manager.add("f12");

        String[] actual = manager.findLast();
        String[] expected = {
                "f12",
                "f11",
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoulFindLastWithoutLimit() {
        MoviesManager manager = new MoviesManager();
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");

        String[] actual = manager.findLast();
        String[] expected = {
                "f5",
                "f4",
                "f3",
                "f2",
                "f1",
        };

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shoulFindLastOverLimit() {
        MoviesManager manager = new MoviesManager(15);
        manager.add("f1");
        manager.add("f2");
        manager.add("f3");
        manager.add("f4");
        manager.add("f5");
        manager.add("f6");
        manager.add("f7");
        manager.add("f8");
        manager.add("f9");
        manager.add("f10");
        manager.add("f11");
        manager.add("f12");

        String[] actual = manager.findLast();
        String[] expected = {
                "f12",
                "f11",
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3",
                "f2",
                "f1",
        };

        Assertions.assertArrayEquals(expected, actual);
    }


}