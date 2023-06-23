package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Alignment {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "alignment")
    private String alignment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alignment alignment1 = (Alignment) o;
        return id == alignment1.id && Objects.equals(alignment, alignment1.alignment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alignment);
    }
}
