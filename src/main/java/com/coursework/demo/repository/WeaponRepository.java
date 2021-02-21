package com.coursework.demo.repository;

import com.coursework.demo.entity.Weapon;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface WeaponRepository extends PagingAndSortingRepository<Weapon, Long> {
}
