package com.example.springBootdto.repository;

import com.example.springBootdto.model.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationRepository extends JpaRepository <Location,Long> {

}
