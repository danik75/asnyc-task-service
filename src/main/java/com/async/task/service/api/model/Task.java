package com.async.task.service.api.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Task {
    @Id
    @SequenceGenerator(
            name = "task_id_sequence",
            sequenceName = "task_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_id_sequence"
    )
    private Integer id;
    private String name;
    private String status;
    private Date createDate;
    private  Date lastUpdate;

    public Task(Integer id, String name, String status, Date createDate, Date lastUpdate) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    public Task(String name, String status, Date createDate, Date lastUpdate) {
        this.name = name;
        this.status = status;
        this.createDate = createDate;
        this.lastUpdate = lastUpdate;
    }

    public Task() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task task)) return false;
        return Objects.equals(getId(), task.getId()) && Objects.equals(getName(), task.getName()) && Objects.equals(getStatus(), task.getStatus()) && Objects.equals(getCreateDate(), task.getCreateDate()) && Objects.equals(getLastUpdate(), task.getLastUpdate());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getStatus(), getCreateDate(), getLastUpdate());
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                ", createDate=" + createDate +
                ", lastUpdate=" + lastUpdate +
                '}';
    }
}
