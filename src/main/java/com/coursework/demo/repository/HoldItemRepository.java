package com.coursework.demo.repository;

import com.coursework.demo.entity.HoldItem;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HoldItemRepository extends PagingAndSortingRepository<HoldItem, Long> {
}
