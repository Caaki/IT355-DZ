package com.it355.dz08.entiteti;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Comic {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id")
    private int id;
    @Basic
    @Column(name = "comic_name")
    private String comicName;
    @Basic
    @Column(name = "issue")
    private Integer issue;
    @Basic
    @Column(name = "publish_month")
    private Integer publishMonth;
    @Basic
    @Column(name = "publish_year")
    private Integer publishYear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComicName() {
        return comicName;
    }

    public void setComicName(String comicName) {
        this.comicName = comicName;
    }

    public Integer getIssue() {
        return issue;
    }

    public void setIssue(Integer issue) {
        this.issue = issue;
    }

    public Integer getPublishMonth() {
        return publishMonth;
    }

    public void setPublishMonth(Integer publishMonth) {
        this.publishMonth = publishMonth;
    }

    public Integer getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(Integer publishYear) {
        this.publishYear = publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comic comic = (Comic) o;
        return id == comic.id && Objects.equals(comicName, comic.comicName) && Objects.equals(issue, comic.issue) && Objects.equals(publishMonth, comic.publishMonth) && Objects.equals(publishYear, comic.publishYear);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, comicName, issue, publishMonth, publishYear);
    }
}
