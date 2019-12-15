package com.example.pagination.persistense.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "marking_events")
public class MarkingEvent {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "fkey", nullable = false)
    private PipeEvent pipe;

    public MarkingEvent() {
    }

    public MarkingEvent(String status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
