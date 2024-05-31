package org.example.models.ports;

import org.example.models.entities.Evento;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IEventoService {

    public Flux<Evento> Listar();

    public Mono<Evento> agregarEvento (Evento evento);

    public Mono<Void> eliminarEvento(String id);

    public Mono<Evento> actualizarEvento(Evento evento);

    public Mono<Evento> buscarEvento (String id);
}
