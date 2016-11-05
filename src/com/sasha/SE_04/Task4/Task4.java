package com.sasha.SE_04.Task4;

import java.io.File;

/**
 * Created by Александра on 05.11.2016.
 */
public class Task4 {
    public static void main(String[] args) {
        Actor evans = new Actor("Chris Evans");
        Actor renner = new Actor("Jeremy Renner");
        Actor scarlett = new Actor("Scarlett Johansson");
        Actor benedict = new Actor("Benedict Cumberbatch");

        Film boleyn = new Film("The Other Boleyn Girl", 2008);
        Film hobbit = new Film("The Hobbit: An Unexpected Journey", 2012);

        Film prestige = new Film("The Prestige", 2006);
        Film avengers = new Film("The Avengers", 2012);

        Film arrival = new Film("Arrival", 2016);
        Film mission = new Film("Mission: Impossible - Ghost Protocol", 2011);

        Film number = new Film("What's Your Number?", 2011);
        Film fantastic = new Film("Fantastic Four", 2005);

        boleyn.addActor(benedict);
        hobbit.addActor(benedict);
        prestige.addActor(scarlett);
        avengers.addActor(evans);
        avengers.addActor(scarlett);
        avengers.addActor(renner);
        arrival.addActor(renner);
        mission.addActor(renner);
        number.addActor(evans);
        fantastic.addActor(evans);

        Library newLibrary = new Library("newLibrary");
        newLibrary.addFilm(boleyn);
        newLibrary.addFilm(hobbit);
        newLibrary.addFilm(prestige);
        newLibrary.addFilm(avengers);
        newLibrary.addFilm(arrival);
        newLibrary.addFilm(mission);
        newLibrary.addFilm(number);
        newLibrary.addFilm(fantastic);

        System.out.println(newLibrary.toString());
        newLibrary.deleteFilm(avengers);
        System.out.println("=================================================================");
        System.out.println(newLibrary.toString());
        System.out.println("=================================================================");
        newLibrary.filmsWithActor(benedict);
        System.out.println("=================================================================");
        
        File file = new File("C:\\Java\\IdeaProjects\\epam_trainings\\src\\com\\sasha\\SE_04\\Task4\\serialized.txt");
        Library.serializeToFile(newLibrary, file);
        Library lib = Library.deserializeFromFile(file);
        System.out.println(lib);


    }
}
