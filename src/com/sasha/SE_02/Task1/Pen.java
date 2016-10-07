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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pen pen = (Pen) o;

        if (type != null ? !type.equals(pen.type) : pen.type != null) return false;
        if (colour != null ? !colour.equals(pen.colour) : pen.colour != null) return false;
        return producer != null ? producer.equals(pen.producer) : pen.producer == null;

    }

    @Override
    public int hashCode() {
        int result = type != null ? type.hashCode() : 0;
        result = 31 * result + (colour != null ? colour.hashCode() : 0);
        result = 31 * result + (producer != null ? producer.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Pen{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                ", producer='" + producer + '\'' +
                '}';
    }

    public String toStringMy() {
        return this.getClass().getSimpleName() + " Type: " + type + "   Colour: " + colour + "  Producer: " + producer;
    }

    public boolean equals1(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Pen pen = (Pen) o;
        return ((this.type).equals(pen.type) && (this.colour).equals(pen.colour) && (this.producer).equals(pen.producer));
    }

    public int hashCodeMy() {
        int hashCode = (type == null) ? 0 : type.hashCode();
        hashCode = 31 * hashCode + ((colour == null) ? 0 : colour.hashCode());
        hashCode = 31 * hashCode + ((producer == null) ? 0 : producer.hashCode());
        return hashCode;
    }
}
