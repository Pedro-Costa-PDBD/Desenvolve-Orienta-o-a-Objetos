package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class TestUnitario {

    @Test
    public void testGetAutor_ou_Usuario() {
        Autor autor= new Autor(null, null, isAutor_ou_Usuario());
        autor.setAutor_ou_Usuario(false);
        assertEquals(false, autor.getAutor_ou_Usuario());
    }

    @Test
    public void testSetAutor_ou_Usuario() {
        Autor autor= new Autor(null, null, isAutor_ou_Usuario());
        autor.setAutor_ou_Usuario(false);
        assertEquals(false, autor.getAutor_ou_Usuario());
    }
}
