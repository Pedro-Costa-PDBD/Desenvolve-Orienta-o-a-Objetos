package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class ArtigoTest {
    @Test
    public void testGetTitulo() {
        Artigo artigo = new Artigo();
        artigo.setTitulo("Entendendo Compiladores");
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    public void testSetTitulo() {
        Artigo artigo = new Artigo();
        artigo.setTitulo("Entendendo Compiladores");
        assertEquals("Entendendo Compiladores", artigo.getTitulo());
    }

    @Test
    public void testGetAutor() {
        Autor autor = new Autor();
        autor.setAutor("Fernanda");
        assertEquals("Fernanda", autor.getAutor());
    }

    @Test
    public void testSetAutor() {
        Autor autor = new Autor();
        autor.setAutor("Fernanda");
        assertEquals("Fernanda", autor.getAutor());
    }

    @Test
    public void testGetGenero() {
        Artigo artigo = new Artigo();
        artigo.setGenero("tecnologia");
        assertEquals("tecnologia", artigo.getGenero());
    }

    @Test
    public void testSetGenero() {
        Artigo artigo = new Artigo();
        artigo.setGenero("tecnologia");
        assertEquals("tecnologia", artigo.getGenero());
    }

    @Test
    public boolean isPublicado() {
        return publicado;
    }

    @Test
    public void setPublicado(boolean publicado) {
        this.publicado = publicado;
    }

    @Test
    public void validarPublicacao() {
        if(publicado) {
            System.out.println( "O artigo esta Publicado." );
        } else {
            System.out.println( "O artigo NAO esta Publicado." );
        }
    }
}