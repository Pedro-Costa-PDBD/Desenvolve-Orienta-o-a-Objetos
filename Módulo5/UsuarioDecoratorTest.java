package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class UsuarioDecoratorTest {
    @Test
    public void testGetPublicar() {
        Publicavel estrategiapublicacao = new UsuarioDecorator(estrategiapublicacao);
        estrategiapublicacao.publicar();
    }

    @Test
    public void testSetPublicar() {
        Publicavel estrategiapublicacao = new UsuarioDecorator(estrategiapublicacao);
        estrategiapublicacao.publicar();
    }
}