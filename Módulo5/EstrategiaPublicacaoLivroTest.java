package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class EstrategiaPublicacaoLivroTest {
    @Test
    public void testGetPublicar() {
        Publicavel estrategiapublicacaolivro = new UsuarioDecorator(estrategiapublicacaolivro);
        estrategiapublicacaolivro.publicar();
    }

    @Test
    public void testSetPublicar() {
        Publicavel estrategiapublicacaolivro = new UsuarioDecorator(estrategiapublicacaolivro);
        estrategiapublicacaolivro.publicar();
    }
}
