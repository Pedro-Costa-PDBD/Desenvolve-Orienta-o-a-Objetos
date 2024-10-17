package com.mycompany.app;
import org.junit.Test;
import static org.junit.Assert.*;
public class PessoaTest {
    @Test
    public void testGetNome() {
        Pessoa pessoa = new Pessoa("Jess");
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testSetNome() {
        Pessoa pessoa = new Pessoa("Jess");
        pessoa.setNome("Jess");
        assertEquals("Jess", pessoa.getNome());
    }

    @Test
    public void testGetLivros() {
        Pessoa pessoa = new Pessoa("Jess");
        Autor autor = new Autor("Jess","Brasileira");

        // Define uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro("Java Basico", autor, "tecnologia", true);
        livros[1] = new Livro("Java Avançado", autor,"tecnologia", true);
        pessoa.setLivros(livros);
        
        assertArrayEquals(livros, pessoa.getLivros());
    }

    @Test
    public void testSetLivros() {
        Pessoa pessoa = new Pessoa("Jess");
        
        // Setta uma lista de livros para a pessoa
        Livro[] livros = new Livro[2];
        livros[0] = new Livro(null, null, null, false);
        livros[1] = new Livro(null, null, null, false);
        pessoa.setLivros(livros);

        assertArrayEquals(livros, pessoa.getLivros());
    }
}