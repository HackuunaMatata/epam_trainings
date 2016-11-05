package com.sasha.SE_04.Task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Александра on 05.11.2016.
 */
public class Library implements Serializable {
    private String title;
    private List<Film> films = new ArrayList<>();
    private List<Pair> pairs = new ArrayList<>();

    public Library(String title) {
        this.title = title;
    }

    public void addFilm(Film film) {
        films.add(film);
        for (Actor actor : film.actors) {
            Pair pair = new Pair(actor, film);
            pairs.add(pair);
        }
    }

    public void filmsWithActor(Actor actor) {
        StringBuilder info = new StringBuilder();
        for (Pair pair : pairs) {
            if (pair.getActor() == actor)
                info.append(pair.getFilm());
        }
        System.out.println("Actor: " + actor + "\nFilms:" + info);
    }

    public void deleteFilm(Film film) {
        films.remove(film);
        ListIterator<Pair> iterator = pairs.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().getFilm() == film) iterator.remove();
        }
    }

    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", \nfilms=" + films +
                '}';
    }

    public static void serializeToFile(Library library, File output) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(output);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {

            objectOutputStream.writeObject(library);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Library deserializeFromFile(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            return (Library) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
