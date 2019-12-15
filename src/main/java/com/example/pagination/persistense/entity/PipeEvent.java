package com.example.pagination.persistense.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "pipe_events")
public class PipeEvent {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "pipename")
    private String pipeName;

    @Column(name = "created")
    private Timestamp created;

    @OneToMany(mappedBy = "pipe")
    private List<MarkingEvent> markingEvents;

    public List<MarkingEvent> getMarkingEvents() {
        return markingEvents;
    }

    public void setMarkingEvents(List<MarkingEvent> markingEvents) {
        this.markingEvents = markingEvents;
    }

    public PipeEvent() {
    }

    public PipeEvent(String pipeName, Timestamp created) {
        this.pipeName = pipeName;
        this.created = created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public Timestamp getCreated() {
        return created;
    }

    public void setCreated(Timestamp created) {
        this.created = created;
    }
}
