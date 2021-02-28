package com.coursework.demo.repository;

import com.coursework.demo.entity.Order;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface OrderRepository extends PagingAndSortingRepository<Order, Long> {
    @Query("""
            SELECT o FROM Order o
            JOIN o.crew c 
            WHERE c.captain = :captain
            """)
    List<Order> findAllByCaptain(String captain);
}
