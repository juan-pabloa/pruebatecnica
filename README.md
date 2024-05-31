Este es un microservicio donde se van a poder gestionar los eventos.


Cuenta con diferentes endpoints http

Un servicio Post - que te va permitir guardar un nuevo evento.
http:localhost:8787/iasapi/event

request: {
    "id":"",
    "name":"",
    "location":"",
    "date":""
}
 
response: un objeto del evento creado

Un servicio delete - que te va permitir eliminar un evento por medio del id, que viajara en la url.
http:localhost:8787/iasapi/event/{id}


Un servicio Get que te permitira listar los eventos creados
http:localhost:8787/iasapi/event/listar

response: una lista de [ {
    "id":"",
    "name":"",
    "location":"",
    "date":""
}]


Un servicio Put que te va permitir actualizar los aventos
http:localhost:8787/iasapi/event