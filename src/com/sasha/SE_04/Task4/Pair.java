package com.sasha.SE_04.Task4;

import java.io.Serializable;

/**
 * Created by Александра on 05.11.2016.
 */
public class Pair implements Serializable{
    private Actor actor;
    private Film film;

    public Pair(Actor actor, Film film) {
        this.actor = actor;
        this.film = film;
    }

    public Actor getActor() {
        return actor;
    }

    public Film getFilm() {
        return film;
    }
}
