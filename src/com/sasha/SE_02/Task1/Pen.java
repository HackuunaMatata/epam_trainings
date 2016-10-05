package com.sasha.SE_02.Task1;

/**
 * Created by Александра on 05.10.2016.
 */
public class Pen {
    private String type;
    private String colour;
    private String producer;

    public Pen() {
        type = "gelpen";
        colour = "black";
        producer = "ErichKrause";
    }

    public Pen(String type, String colour, String producer) {
        this.type = type;
        this.colour = colour;
        this.producer = producer;
    }

    public String toString() {
        return this.getClass().getSimpleName() + " Type: " + type + "   Colour: " + colour + "  Producer: " + producer;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        Pen pen = (Pen) o;
        return ((this.type).equals(pen.type) && (this.colour).equals(pen.colour) && (this.producer).equals(pen.producer));
    }

    public int hashCode() {
        int hashCode = (type == null) ? 0 : type.hashCode();
        hashCode = 31 * hashCode + ((colour == null) ? 0 : colour.hashCode());
        hashCode = 31 * hashCode + ((producer == null) ? 0 : producer.hashCode());
        return hashCode;
    }
}
