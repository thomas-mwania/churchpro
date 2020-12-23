package com.churchpro.repository;

import com.churchpro.domain.CmsLocalChurch;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsLocalChurchRepository extends PagingAndSortingRepository<CmsLocalChurch, Integer> {}
