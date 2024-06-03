package com.demo.libros.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.libros.models.Libro;
import com.demo.libros.services.LibroService;
import com.demo.libros.utils.LibroException;

import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    // @GetMapping("/libros/{id}")
    // public Libro getLibro(@PathVariable int id) {
    // Libro libro = libroService.getLibro(id);
    // return libro;
    // }

    @GetMapping("/libros/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);

        if (libro == null) {
            throw new LibroException("No se ha encontrado un libro con el " + id);
        }
        return ResponseEntity.ok(libro);
        // Error interno
        // libro.setAutor("nuevo autor");
        // if (libro != null) {
        // return ResponseEntity.ok(libro);
        // } else {
        // return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        // }
    }

    // @PostMapping("/libros")
    // public Libro nuevLibro(@RequestBody Libro libro) {
    // libroService.nuevLibro(libro);
    // return libro;
    // }

    // 201 found
    @PostMapping("/libros")
    public ResponseEntity<Libro> nuevLibro(@RequestBody Libro libro) {
        var new_libro = libroService.nuevLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(new_libro);
    }

}