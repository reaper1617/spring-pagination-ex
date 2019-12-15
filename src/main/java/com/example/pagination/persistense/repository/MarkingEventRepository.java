package com.example.pagination.persistense.repository;

import com.example.pagination.persistense.entity.MarkingEvent;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface MarkingEventRepository extends PagingAndSortingRepository<MarkingEvent, Integer>,
        JpaSpecificationExecutor<MarkingEvent> {
}
