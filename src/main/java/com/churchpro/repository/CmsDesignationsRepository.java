package com.churchpro.repository;

import com.churchpro.domain.CmsDesignations;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsDesignationsRepository extends PagingAndSortingRepository<CmsDesignations, Integer> {}
