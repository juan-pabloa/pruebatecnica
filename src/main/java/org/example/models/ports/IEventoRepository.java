package org.example.models.ports;

import org.example.models.entities.Evento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEventoRepository {

    public Flux<Evento> Listar();
    public Mono<Evento> save(Evento evento);
    public Mono<Void> eliminarEvento(String id);
    public Mono<Evento> actualizarEvento(Evento evento);

    public Mono<Evento> buscarEventoPorId (String id);



}
