package com.projectengcomjr.engcompjr.Repository;

import com.projectengcomjr.engcompjr.Entities.ServicoEntities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicoRepository extends JpaRepository<ServicoEntities, Long> {
}
