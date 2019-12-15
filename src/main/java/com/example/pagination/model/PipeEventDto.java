package com.example.pagination.model;

import com.example.pagination.persistense.entity.MarkingEvent;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

public class PipeEventDto {

    private int pipeId;

    private String pipeName;

    private Timestamp pipeCreated;

    private List<MarkingEventDto> markingEvents;

    public PipeEventDto(int pipeId, String pipeName, Timestamp pipeCreated, List<MarkingEventDto> markingEvents) {
        this.pipeId = pipeId;
        this.pipeName = pipeName;
        this.pipeCreated = pipeCreated;
        this.markingEvents = markingEvents;
    }

    public int getPipeId() {
        return pipeId;
    }

    public void setPipeId(int pipeId) {
        this.pipeId = pipeId;
    }

    public String getPipeName() {
        return pipeName;
    }

    public void setPipeName(String pipeName) {
        this.pipeName = pipeName;
    }

    public Timestamp getPipeCreated() {
        return pipeCreated;
    }

    public void setPipeCreated(Timestamp pipeCreated) {
        this.pipeCreated = pipeCreated;
    }

    public List<MarkingEventDto> getMarkingEvents() {
        return markingEvents;
    }

    public void setMarkingEvents(List<MarkingEventDto> markingEvents) {
        this.markingEvents = markingEvents;
    }
}
