package com.churchpro.repository;

import com.churchpro.domain.CmsDistricts;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsDistrictsRepository extends PagingAndSortingRepository<CmsDistricts, Integer> {}
