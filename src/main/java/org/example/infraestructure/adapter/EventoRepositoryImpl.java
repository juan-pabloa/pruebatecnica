package org.example.infraestructure.adapter;

import lombok.NoArgsConstructor;
import org.example.models.entities.Evento;
import org.example.models.ports.IEventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@NoArgsConstructor
public class EventoRepositoryImpl implements IEventoRepository {

    private EventoRepository repository;

    @Autowired
    public EventoRepositoryImpl (EventoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Flux<Evento> Listar() {
        return repository.findAll();
    }

    @Override
    public Mono<Evento> save(Evento evento) {
        return repository.save(evento);
    }


    @Override
    public Mono<Void> eliminarEvento(String id) {
        return repository.deleteById(id);
    }

    @Override
    public Mono<Evento> actualizarEvento(Evento evento) {
        return repository.save(evento);
    }

    @Override
    public Mono<Evento> buscarEventoPorId(String id) {
        return repository.findById(id);
    }
}
