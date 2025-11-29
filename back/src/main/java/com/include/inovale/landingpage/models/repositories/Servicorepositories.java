package com.include.inovale.landingpage.models.repositories;

import com.include.inovale.landingpage.models.entities.Servico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Servicorepositories extends JpaRepository<Servico, Long> {
}