/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework;

//import java.util.ArrayList;

/**
 *
 * @author aluno
 */
public abstract class Dispositivo   {
    protected Conteudo conteudo;
    protected Paragrafo paragrafo;
    protected Link link;
    protected Lista lista;
    protected Responsividade responsividade;

    public Responsividade getResponsividade() {
        return this.responsividade;
    }

    public void setResponsividade(Responsividade responsividade) {
        this.responsividade = responsividade;
    }

    public Conteudo getConteudo() {
        return this.conteudo;
    }

    public void setConteudo(Conteudo conteudo) {
        this.conteudo = conteudo;
    }
    
    
    public Paragrafo getParagrafo() {
        return this.paragrafo;
    }

    public void setParagrafo(Paragrafo paragrafo) {
        this.paragrafo = paragrafo;
    }

    public Link getLink() {
        return this.link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public Lista getLista() {
        return this.lista;
    }

    public void setLista(Lista lista) {
        this.lista = lista;
    }
    
          

    
}
