package com.sasha.SE_02.Task6;

/**
 * Created by Александра on 16.10.2016.
 */
public class NuclearSubmarine {
    private Engine engine = new Engine();
    String name;

    public NuclearSubmarine(String name) {
        this.name = name;
    }

    public NuclearSubmarine() {
        name = "Toporik";
    }

    public void startSwim() {
        if (!engine.status) {
            engine.status = true;
            System.out.println(name + " is swim");
            engine.print();
        }
    }

    public void stopSwim() {
        if (engine.status) {
            engine.status = false;
            System.out.println(name + " isn't swim");
            engine.print();
        }
    }

    class Engine {
        public boolean status = false;
        private String name = "Tarahtelka";

        void print() {
            if (status) System.out.println(name + " tarah-tarah");
        }
    }
}
