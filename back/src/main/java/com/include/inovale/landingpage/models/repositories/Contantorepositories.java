package com.include.inovale.landingpage.models.repositories;

import com.include.inovale.landingpage.models.entities.Contanto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Contantorepositories extends JpaRepository<Contanto, Long> {
}
