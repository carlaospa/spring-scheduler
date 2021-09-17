package com.carlaospa.springjob.spring.scheduler.entity;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "settings")
public class Setting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STATUS", nullable = false)
    private Boolean status;

    @Column(name = "CRIATED")
    private Date date;

    public Long getId() {
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Setting(){

    }

    public Setting(Boolean status, Date date) {
        this.status = status;
        this.date = date;
    }

    public Setting(Long id, Boolean status, Date date) {
        this.id = id;
        this.status = status;
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Setting setting = (Setting) o;
        return id.equals(setting.id) &&
                Objects.equals(status, setting.status) &&
                Objects.equals(date, setting.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, date);
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", status=" + status +
                ", date=" + date +
                '}';
    }
}
