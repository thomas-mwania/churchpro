package com.churchpro.repository;

import com.churchpro.domain.CmsMemberDesignations;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsMemberDesignationsRepository extends PagingAndSortingRepository<CmsMemberDesignations, Integer> {}
