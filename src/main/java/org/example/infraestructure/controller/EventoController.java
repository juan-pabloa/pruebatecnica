package org.example.infraestructure.controller;
import org.example.models.entities.Evento;
import org.example.models.ports.IEventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController("/iasapi")
public class EventoController {

    private IEventoService service;

    @Autowired
    public EventoController (IEventoService service){
    this.service = service;
    }

    @PostMapping("/event")
    public Mono<Evento> guardarEvento (Evento evento){
        return service.agregarEvento(evento);
    }

    @DeleteMapping("/event/{id}")
    public Mono<Void> eliminarEvento (@PathVariable String id){
        return service.eliminarEvento(id);
    }

    @GetMapping("/event/{id}")
    public Mono<Evento> buscarEvento (@PathVariable String id){
        return service.buscarEvento(id);
    }

    @PutMapping("/event")
    public Mono<Evento> actualizarEvento (Evento evento){
        return service.agregarEvento(evento);
    }

    @GetMapping("/event/listar")
    public Flux<Evento> listarEvento () {
        return service.Listar();
    }
}
