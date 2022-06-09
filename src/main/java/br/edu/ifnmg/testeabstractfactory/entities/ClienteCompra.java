/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory.entities;

import br.edu.ifnmg.testeabstractfactory.interfaces.AbstractCarro;

/**
 *
 * @author Lucas
 */
public class ClienteCompra implements AbstractCarro {

    private String nome;
    private AbstractCarro carro;

    public ClienteCompra(String nome, AbstractCarro carro) {
        this.nome = nome;
        this.carro = carro;
    }

    @Override
    public String getInformacao() {
        return nome + " comprou o " + carro.getInformacao();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCarro(AbstractCarro carro) {
        this.carro = carro;
    }

}
