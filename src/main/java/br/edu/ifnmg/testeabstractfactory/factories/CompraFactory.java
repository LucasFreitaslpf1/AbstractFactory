/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory.factories;

import br.edu.ifnmg.testeabstractfactory.entities.CarroCompra;
import br.edu.ifnmg.testeabstractfactory.entities.ClienteCompra;
import br.edu.ifnmg.testeabstractfactory.interfaces.AbstractFactory;

/**
 *
 * @author Lucas
 */
public class CompraFactory implements AbstractFactory<CarroCompra, ClienteCompra> {

    private CompraFactory() {
    }
    public static CompraFactory compraFactory;

    public static CompraFactory getInstancia() {
        if (compraFactory == null) {
            compraFactory = new CompraFactory();
        }
        return compraFactory;
    }

    @Override
    public CarroCompra criarCarro(String modelo) {

        return new CarroCompra(modelo);
    }

    @Override
    public ClienteCompra criarCliente(String nome, String modelocarro) {

        return new ClienteCompra(nome, criarCarro(modelocarro));
    }

}
