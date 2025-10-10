package JulioL3mos.controllers;

import JulioL3mos.data.dto.PersonDTO;
import JulioL3mos.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/person")
@RestController
public class PersonController {

    @Autowired
    private PersonServices service;

    // 1) GET /person -> listar todas as pessoas
    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE)
    public List<PersonDTO> findAll() {
        return service.findAll();
    }

    // 2) GET /person/{id} -> buscar por id
    @GetMapping(
            value = "/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTO findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    // 3) POST /person -> criar (alterado de GET para POST)
    @PostMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public PersonDTO create(@RequestBody PersonDTO person) {
        return service.create(person);
    }

    // 4) PUT /person -> atualizar (alterado de GET para PUT)
    @PutMapping(
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public PersonDTO update(@RequestBody PersonDTO person) {
        return service.update(person);
    }

    // 5) DELETE /person/{id} -> deletar por id
    @DeleteMapping(value = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.noContent().build();// Retorna 204 No Content
    }
}
