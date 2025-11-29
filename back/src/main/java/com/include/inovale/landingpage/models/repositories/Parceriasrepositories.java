package com.include.inovale.landingpage.models.repositories;

import com.include.inovale.landingpage.models.entities.Parceria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Parceriasrepositories extends JpaRepository<Parceria, Long> {
}