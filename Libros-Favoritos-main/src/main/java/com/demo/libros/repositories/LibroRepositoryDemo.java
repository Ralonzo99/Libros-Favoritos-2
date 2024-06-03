package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryDemo implements LibroRepository {

    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryDemo() {
    	libros.add(new Libro(1, "Así habló Zaratustra", "Friedrich Nietzsche", "B. Bauzá", 1931));
        libros.add(new Libro(2, "Moby-Dick", "Herman Melville", "Harper & Brothers", 1851));
        libros.add(new Libro(3, "La naranja mecánica", "Anthony Burgess", "William Heinemann", 1962));
        libros.add(new Libro(4, "Berserk", "Kentaro Miura", " Hakusensha", 1989));
        libros.add(new Libro(5, "American Psycho", "Bret Easton Ellis", "Vintage Books", 1991));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectando a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectando a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
