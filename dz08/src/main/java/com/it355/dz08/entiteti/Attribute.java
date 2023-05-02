package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Attribute {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "attribute_name")
    private String attributeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attribute attribute = (Attribute) o;
        return id == attribute.id && Objects.equals(attributeName, attribute.attributeName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, attributeName);
    }
}
