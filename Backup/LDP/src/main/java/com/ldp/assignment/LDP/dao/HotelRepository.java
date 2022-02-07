package com.ldp.assignment.LDP.dao;

import com.ldp.assignment.LDP.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel,Integer> {
}
