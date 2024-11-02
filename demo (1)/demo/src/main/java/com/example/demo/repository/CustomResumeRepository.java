package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Resume;

public interface CustomResumeRepository extends JpaRepository<Resume, Long> {
}
