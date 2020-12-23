package com.churchpro.repository;

import com.churchpro.domain.CmsMembers;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CmsMembersRepository extends PagingAndSortingRepository<CmsMembers, Integer> {}
