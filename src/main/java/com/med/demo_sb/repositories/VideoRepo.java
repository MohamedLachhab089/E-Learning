package com.med.demo_sb.repositories;

import com.med.demo_sb.entities.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepo extends JpaRepository<Video, Integer> {
}
