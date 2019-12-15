package com.example.pagination.persistense.repository;

import com.example.pagination.persistense.entity.PipeEvent;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PipeEventRepository extends PagingAndSortingRepository<PipeEvent, Integer>,
        JpaSpecificationExecutor<PipeEvent> {

    @Query(nativeQuery = false,
    value = "from PipeEvent pe join fetch MarkingEvent me where me.status = :status")
    Page<PipeEvent> findAllFiltered(Pageable pageable, @Param("status") String markingEventStatus );

    @EntityGraph(value = "pipe_events.marking_events", type = EntityGraph.EntityGraphType.LOAD)
    Page<PipeEvent> findAllByMarkingEventsStatus(Pageable pageable, String status);


    @EntityGraph(value = "pipe_events.marking_events", type = EntityGraph.EntityGraphType.LOAD)
    Page<PipeEvent> findAllByMarkingEventsIdAndMarkingEventsStatus(Pageable pageable, Integer id, String status);
}
