package org.example.application;

import org.example.models.entities.Evento;
import org.example.models.ports.IEventoRepository;
import org.example.models.ports.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EventoService implements IEventoService {

    private IEventoRepository repository;

    @Autowired
    public EventoService(IEventoRepository repository){
        this.repository = repository;
    }

    @Override
    public Flux<Evento> Listar() {
        return repository.Listar();
    }

    @Override
    public Mono<Evento> agregarEvento(Evento evento) {
        return  repository.save(evento);

    }

    @Override
    public Mono<Void> eliminarEvento(String id) {
        return repository.eliminarEvento(id);
    }

    @Override
    public Mono<Evento> actualizarEvento(Evento evento) {
        return repository.actualizarEvento(evento);
    }

    @Override
    public Mono<Evento> buscarEvento(String id) {
        return repository.buscarEventoPorId(id);
    }
}
