package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;
public class AutorTest {
    
    @test
    public void testGetNacionalidade() {
        Autor autor = new Autor();
        autor.setNacionalidade("Brasileiro");
        assertEquals("Brasileiro", autor.getNacionalidade());
    }

    @test
    public void testSetNacionalidade() {
        Autor autor = new Autor();
        autor.setNacionalidade("Brasileiro");
        assertEquals("Brasileiro", autor.getNacionalidade());
    }

    @test
    public void testGetObras_Publicadas() {
        Autor autor = new Autor();
        autor.setObras_Publicadas("Java Basico", "Java Avançado");
        assertEquals("Java Basico", "Java Avançado", autor.getObras_Publicadas());
    }

    @test
    public void testSetObras_Publicadas() {
        Autor autor = new Autor();
        autor.setObras_Publicadas("Java Basico", "Java Avançado");
        assertEquals("Java Basico", "Java Avançado", autor.getObras_Publicadas());
    }
}