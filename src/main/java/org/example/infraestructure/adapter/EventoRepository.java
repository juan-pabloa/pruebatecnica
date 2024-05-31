package org.example.infraestructure.adapter;

import org.example.models.entities.Evento;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends R2dbcRepository <Evento, String> {
}
