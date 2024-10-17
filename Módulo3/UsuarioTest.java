package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class UsuarioTest {
    @Test
    public void testGetIdade() {
        Usuario usuario = new Usuario();
        usuario.setIdade(21);
        assertEquals(21, usuario.getIdade());
    }

    @Test
    public void testSetIdade() {
        Usuario usuario = new Usuario();
        usuario.setIdade(21);
        assertEquals(21, usuario.getIdade());
    }
    

    @Test
    public void testGetNome_Usuario() {
        Usuario usuario = new Usuario();
        usuario.setNome_Usuario("Gabriel");
        assertEquals("Gabriel", usuario.getNome_Usuario());
    }

    @Test
    public void testSetNome_Usuario() {
        Usuario usuario = new Usuario();
        usuario.setNome_Usuario("Gabriel");
        assertEquals("Gabriel", usuario.getNome_Usuario());
    }

    @Test
    public void testGetHistorico_Emprestimo() {
        Emprestimo[] historico_emprestimo = new Emprestimo[2];
        historico_emprestimo[0] = new Emprestimo("Java Basico");
        historico_emprestimo[1] = new Emprestimo("Java Avançado");
        pessoa.setHistorico_Emprestimo(historico_emprestimo);

        assertArrayEquals(historico_emprestimo, usuario.getHistorico_Emprestimo());
    }

    @Test
    public void testSetHistorico_Emprestimo() {
        Usuario usuario = new Usuario("Gabriel");
        
        Emprestimo[] historico_emprestimo = new Emprestimo[2];
        historico_emprestimo[0] = new Emprestimo(null);
        historico_emprestimo[1] = new Emprestimo(null);
        pessoa.setLivros(historico_emprestimo);
        
        assertArrayEquals(historico_emprestimo, usuario.getHistorico_Emprestimo());
    }
}