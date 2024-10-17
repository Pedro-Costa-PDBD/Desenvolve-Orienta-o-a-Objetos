package com.mycompany.app.Model;

import com.mycompany.app.Interface.PublicavelInterface;

class UsuarioDecorator implements PublicavelInterface {
    private PublicavelInterface estrategiapublicacao;

    public  UsuarioDecorator(PublicavelInterface estrategiapublicacao) {
        this.estrategiapublicacao= estrategiapublicacao;
    }

    public void publicar() {
        estrategiapublicacao.publicar();
        System.out.println("Publicando como...");
    }
}