package com.include.inovale.landingpage.models.repositories;

import com.include.inovale.landingpage.models.entities.CasosSuceso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasosSucesorepositories extends JpaRepository<CasosSuceso, Long> {
}