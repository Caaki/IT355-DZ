package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Colour {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "colour")
    private String colour;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Colour colour1 = (Colour) o;
        return id == colour1.id && Objects.equals(colour, colour1.colour);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, colour);
    }
}
