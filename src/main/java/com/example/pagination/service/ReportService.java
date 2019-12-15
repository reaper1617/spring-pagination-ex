package com.example.pagination.service;

import com.example.pagination.model.FilterDto;
import com.example.pagination.model.PipeEventDto;
import com.example.pagination.persistense.entity.PipeEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface ReportService {

    Page<PipeEventDto> get(int pageNum, int pageSize, String sortBy, Sort.Direction direction);
    Page<PipeEvent> getFiltered(int pageNum, int pageSize, String sortBy, Sort.Direction direction, FilterDto filter);
}
