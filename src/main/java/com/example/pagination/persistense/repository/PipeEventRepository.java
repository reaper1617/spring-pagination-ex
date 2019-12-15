package com.example.pagination.persistense.repository;

import com.example.pagination.persistense.entity.PipeEvent;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PipeEventRepository extends PagingAndSortingRepository<PipeEvent, Integer>,
        JpaSpecificationExecutor<PipeEvent> {

}
