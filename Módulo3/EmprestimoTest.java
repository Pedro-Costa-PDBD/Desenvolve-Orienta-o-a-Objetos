package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;

import java.beans.Transient;

public class EmprestimoTest {

    @Test
    public void GetData_retirada() {
        Date data_retirada = new Date();
        data_retirada.getData_retirada();
    }

    @Test
    public void SetData_retirada() {
        Date data_retirada = new Date();
        data_retirada.getData_retirada();
    }

    @Test
    public void GetData_devolucao() {
        Date data_devolucao = new Date();
        data_devolucao.getData_devolucao();
    }

    @Test
    public void SetData_devolucao() {
        Date data_devolucao = new Date();
        data_devolucao.getData_devolucao();
    }

    @Test
    public void GetLivro() {
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        livro.setTitulo("Java Basics");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.validarDisponibilidade(true);
        assertEquals("Java Basics", autor, "Tecnologia", true, livro.getLivro());
    }

    @Test
    public void SetLivro() {
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        livro.setTitulo("Java Basics");
        livro.setAutor(autor);
        livro.setGenero("Tecnologia");
        livro.validarDisponibilidade(true);
        assertEquals("Java Basics", autor, "Tecnologia", true, livro.getLivro());
    }

    @Test
    public void GetUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(21);
        usuario.setNome_Usuario("Gabriel");
        assertEquals(21, usuario.getIdade());
        assertEquals("Gabriel", pessoa.getNome_Usuario());
    }

    @Test
    public void SetUsuario() {
        Usuario usuario = new Usuario("Gabriel", 21);
        usuario.setIdade(21);
        usuario.setNome_Usuario("Gabriel");
        assertEquals(21, usuario.getIdade());
        assertEquals("Gabriel", pessoa.getNome_Usuario());
    }
}