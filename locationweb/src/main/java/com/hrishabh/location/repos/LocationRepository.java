package com.hrishabh.location.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.hrishabh.location.entities.Location;

public interface LocationRepository extends JpaRepository<Location, Integer> {

}
