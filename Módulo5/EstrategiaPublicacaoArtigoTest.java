package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class EstrategiaPublicacaoArtigoTest {
    @Test
    public void testGetPublicar() {
        Publicavel estrategiapublicacaoartigo = new UsuarioDecorator(estrategiapublicacaoartigo);
        estrategiapublicacaoartigo.publicar();
    }

    @Test
    public void testSetPublicar() {
        Publicavel estrategiapublicacaoartigo = new UsuarioDecorator(estrategiapublicacaoartigo);
        estrategiapublicacaoartigo.publicar();
    }
}
