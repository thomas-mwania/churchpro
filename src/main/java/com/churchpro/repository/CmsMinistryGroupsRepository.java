package com.churchpro.repository;

import com.churchpro.domain.CmsMinistryGroups;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsMinistryGroupsRepository extends PagingAndSortingRepository<CmsMinistryGroups, Integer> {}
