package com.sasha.SE_04.Task4;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Александра on 05.11.2016.
 */
public class Film implements Serializable {
    private String title;
    private int year;
    public List<Actor> actors = new ArrayList<>();

    public Film(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void addActor(Actor actor) {
        actors.add(actor);
    }

    @Override
    public String toString() {
        return "\nFilm{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", actros=" + actors +
                '}';
    }
}
