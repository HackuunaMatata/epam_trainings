package com.sasha.SE_04.Task4;

import java.io.Serializable;

/**
 * Created by Александра on 05.11.2016.
 */
public class Actor implements Serializable {
    private String name;

    public Actor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                '}';
    }
}
