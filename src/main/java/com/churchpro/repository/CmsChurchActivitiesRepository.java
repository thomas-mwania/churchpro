package com.churchpro.repository;

import com.churchpro.domain.CmsChurchActivities;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsChurchActivitiesRepository extends PagingAndSortingRepository<CmsChurchActivities, Integer> {}
