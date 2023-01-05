package com.starcast.management.starcastservice.repository;

import com.starcast.management.starcastservice.entity.StarCast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StarCastRepository extends JpaRepository<StarCast, Long> {
    StarCast getStarCastDetailsById(Long id);
}
