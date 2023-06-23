package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Gender {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "gender")
    private String gender;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gender gender1 = (Gender) o;
        return id == gender1.id && Objects.equals(gender, gender1.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gender);
    }
}
