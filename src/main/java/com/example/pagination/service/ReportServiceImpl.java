package com.example.pagination.service;

import com.example.pagination.model.FilterDto;
import com.example.pagination.model.MarkingEventDto;
import com.example.pagination.model.PipeEventDto;
import com.example.pagination.persistense.entity.MarkingEvent;
import com.example.pagination.persistense.entity.PipeEvent;
import com.example.pagination.persistense.repository.PipeEventRepository;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    private PipeEventRepository pipeEventRepository;


    @Autowired
    public ReportServiceImpl(PipeEventRepository pipeEventRepository) {
        this.pipeEventRepository = pipeEventRepository;
    }

    @Override
    public Page<PipeEventDto> get(int pageNum, int pageSize, String sortBy, Sort.Direction direction) {

        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(direction, sortBy));
        Page<PipeEvent> page = pipeEventRepository.findAll(pageable);

        return page.map(this::map);
    }

    @Override
    public Page<PipeEvent> getFiltered(int pageNum,
                                       int pageSize,
                                       String sortBy,
                                       Sort.Direction direction,
                                       FilterDto filterDto) {

        Pageable pageable = PageRequest.of(pageNum, pageSize, Sort.by(direction, sortBy));
//        Page<PipeEvent> page = pipeEventRepository.findAll(pageable);

//        Page<PipeEvent> page = pipeEventRepository.findAllByMarkingEventsStatus(pageable, filterDto.getMarkingStatus());
        Page<PipeEvent> page = pipeEventRepository.findAllByMarkingEventsIdAndMarkingEventsStatus(pageable,
                filterDto.getMarkingId(),
                filterDto.getMarkingStatus());


        return page;
    }

    private PipeEventDto map(PipeEvent e) {
        List<MarkingEvent> markingEvents = e.getMarkingEvents();
        List<MarkingEventDto> markingEventDtos = markingEvents.stream()
                .map(el -> new MarkingEventDto(el.getId(), el.getStatus())).collect(Collectors.toList());

        PipeEventDto pipeEventDto = new PipeEventDto(
                e.getId(), e.getPipeName(), e.getCreated(), markingEventDtos
        );
        return pipeEventDto;
    }

}
