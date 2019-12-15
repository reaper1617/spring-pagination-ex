package com.example.pagination.service;

import com.example.pagination.model.PipeEventDto;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ReportService {

    Page<PipeEventDto> get(int pageNum, int pageSize, String sortBy);
}
