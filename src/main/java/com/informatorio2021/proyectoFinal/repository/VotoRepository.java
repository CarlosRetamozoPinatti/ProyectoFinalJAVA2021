package com.informatorio2021.proyectoFinal.repository;

import com.informatorio2021.proyectoFinal.entity.Voto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VotoRepository extends JpaRepository<Voto, Long> {
    List<Voto> findByUsuarioId(Long usuarioId);

}
