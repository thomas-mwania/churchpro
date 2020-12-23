package com.churchpro.repository;

import com.churchpro.domain.CmsParishes;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsParishesRepository extends PagingAndSortingRepository<CmsParishes, Integer> {}
