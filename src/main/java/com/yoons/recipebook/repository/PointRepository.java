package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.Point;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PointRepository extends JpaRepository<Point,Long> {
}
