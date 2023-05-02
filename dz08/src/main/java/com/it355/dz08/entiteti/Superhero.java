package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Superhero {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "superhero_name")
    private String superheroName;
    @Basic
    @Column(name = "full_name")
    private String fullName;
    @Basic
    @Column(name = "gender_id")
    private Integer genderId;
    @Basic
    @Column(name = "eye_colour_id")
    private Integer eyeColourId;
    @Basic
    @Column(name = "hair_colour_id")
    private Integer hairColourId;
    @Basic
    @Column(name = "skin_colour_id")
    private Integer skinColourId;
    @Basic
    @Column(name = "race_id")
    private Integer raceId;
    @Basic
    @Column(name = "publisher_id")
    private Integer publisherId;
    @Basic
    @Column(name = "alignment_id")
    private Integer alignmentId;
    @Basic
    @Column(name = "height_cm")
    private Integer heightCm;
    @Basic
    @Column(name = "weight_kg")
    private Integer weightKg;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuperheroName() {
        return superheroName;
    }

    public void setSuperheroName(String superheroName) {
        this.superheroName = superheroName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getGenderId() {
        return genderId;
    }

    public void setGenderId(Integer genderId) {
        this.genderId = genderId;
    }

    public Integer getEyeColourId() {
        return eyeColourId;
    }

    public void setEyeColourId(Integer eyeColourId) {
        this.eyeColourId = eyeColourId;
    }

    public Integer getHairColourId() {
        return hairColourId;
    }

    public void setHairColourId(Integer hairColourId) {
        this.hairColourId = hairColourId;
    }

    public Integer getSkinColourId() {
        return skinColourId;
    }

    public void setSkinColourId(Integer skinColourId) {
        this.skinColourId = skinColourId;
    }

    public Integer getRaceId() {
        return raceId;
    }

    public void setRaceId(Integer raceId) {
        this.raceId = raceId;
    }

    public Integer getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(Integer publisherId) {
        this.publisherId = publisherId;
    }

    public Integer getAlignmentId() {
        return alignmentId;
    }

    public void setAlignmentId(Integer alignmentId) {
        this.alignmentId = alignmentId;
    }

    public Integer getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(Integer heightCm) {
        this.heightCm = heightCm;
    }

    public Integer getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(Integer weightKg) {
        this.weightKg = weightKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Superhero superhero = (Superhero) o;
        return id == superhero.id && Objects.equals(superheroName, superhero.superheroName) && Objects.equals(fullName, superhero.fullName) && Objects.equals(genderId, superhero.genderId) && Objects.equals(eyeColourId, superhero.eyeColourId) && Objects.equals(hairColourId, superhero.hairColourId) && Objects.equals(skinColourId, superhero.skinColourId) && Objects.equals(raceId, superhero.raceId) && Objects.equals(publisherId, superhero.publisherId) && Objects.equals(alignmentId, superhero.alignmentId) && Objects.equals(heightCm, superhero.heightCm) && Objects.equals(weightKg, superhero.weightKg);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, superheroName, fullName, genderId, eyeColourId, hairColourId, skinColourId, raceId, publisherId, alignmentId, heightCm, weightKg);
    }
}
