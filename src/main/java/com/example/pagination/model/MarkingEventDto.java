package com.example.pagination.model;

import com.example.pagination.persistense.entity.PipeEvent;

public class MarkingEventDto {
    private int id;
    private String status;

    public MarkingEventDto() {
    }

    public MarkingEventDto(int id, String status) {
        this.id = id;
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
