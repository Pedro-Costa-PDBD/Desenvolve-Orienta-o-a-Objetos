package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class LivroTest {
    @Test
    public void testGetTitulo() {
        Livro livro = new Livro();
        livro.setTitulo("Java Basico");
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        Livro livro = new Livro();
        livro.setTitulo("Java Basico");
        assertEquals("Java Basico", livro.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        autor.setAutor("Jess");
        assertEquals("Jess", autor.getAutor());
    }

    @Test
    public void testSetAutor() {
        Autor autor = new Autor();
        autor.setAutor("Jess");
        assertEquals("Jess", autor.getAutor());
    }

    @Test
    public void testGetGenero() {
        Livro livro = new Livro();
        livro.setGenero("Tecnologia");
        assertEquals("Tecnologia", livro.getGenero());
    }

    @Test
    public void testSetGenero() {
        Livro livro = new Livro();
        livro.setGenero("Tecnologia");
        assertEquals("Tecnologia", livro.getGenero());
    }

    @Test
    public void testGetvalidarDisponibilidade() {
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
        livro.validarDisponibilidade(livro1);
        livro.validarDisponibilidade(livro2);
    }

    @Test
    public void testSetvalidarDisponibilidade() {
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);
        livro.validarDisponibilidade(livro1);
        livro.validarDisponibilidade(livro2);
    }
}