package com.example.demo.repository;

import com.example.demo.entity.Group;
import com.example.demo.entity.Service;
import com.example.demo.entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {
}