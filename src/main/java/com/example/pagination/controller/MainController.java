package com.example.pagination.controller;

import com.example.pagination.model.FilterDto;
import com.example.pagination.model.PipeEventDto;
import com.example.pagination.persistense.entity.PipeEvent;
import com.example.pagination.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {


    private final ReportService reportService;

    @Autowired
    public MainController(ReportService reportService) {
        this.reportService = reportService;
    }

    @GetMapping("/get")
    public ResponseEntity<Page<PipeEventDto>> get(Integer pageNum,
                                                  Integer pageSize,
                                                  String sortBy,
                                                  Sort.Direction direction){
        return ResponseEntity.ok(reportService.get(pageNum, pageSize, sortBy, direction));
    }

    @GetMapping("/getfiltered")
    public ResponseEntity<Page<PipeEvent>> getFiltered(Integer pageNum,
                                                       Integer pageSize,
                                                       String sortBy,
                                                       Sort.Direction direction,
                                                       FilterDto filters){
        return ResponseEntity.ok(reportService.getFiltered(pageNum,
                pageSize,
                sortBy,
                direction,
                filters));
    }
}
