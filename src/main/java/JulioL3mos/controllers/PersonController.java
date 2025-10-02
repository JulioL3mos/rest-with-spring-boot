package JulioL3mos.controllers;

import JulioL3mos.PersonServices;
import JulioL3mos.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/person")
@RestController
public class PersonController {

    @Autowired
    private PersonServices service;

    // 1) GET /person -> listar todas as pessoas
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll() {
        return service.findAll();
    }

    // 2) GET /person/{id} -> buscar por id
    @GetMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") String id) {
        return service.findById(id);
    }

    // 3) POST /person -> criar (alterado de GET para POST) [passo 1 do plano]
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    // 4) PUT /person -> atualizar (alterado de GET para PUT) [passo 2 do plano]
    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    // 5) DELETE /person/{id} -> deletar por id (corrigido para incluir path variable) [passo 3 do plano]
    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") String id) {
        service.delete(id);
    }
}
