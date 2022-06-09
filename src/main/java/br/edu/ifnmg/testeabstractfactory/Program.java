/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory;

import br.edu.ifnmg.testeabstractfactory.entities.CarroAluguel;
import br.edu.ifnmg.testeabstractfactory.entities.CarroCompra;
import br.edu.ifnmg.testeabstractfactory.entities.ClienteAluguel;
import br.edu.ifnmg.testeabstractfactory.entities.ClienteCompra;
import br.edu.ifnmg.testeabstractfactory.factories.AluguelFactory;
import br.edu.ifnmg.testeabstractfactory.factories.CompraFactory;
import br.edu.ifnmg.testeabstractfactory.interfaces.AbstractFactory;

/**
 *
 * @author Lucas
 */
public class Program {
    public static void main(String[] args) {
        
        AbstractFactory abstractFactory = CompraFactory.getInstancia();

        ClienteCompra c1 = (ClienteCompra) abstractFactory.criarCliente("Joao", "Gol");
        CarroCompra cc1 = (CarroCompra) abstractFactory.criarCarro("Wolkswagen");
             
        System.out.println(c1.getInformacao());
        System.out.println(cc1.getInformacao());
        
        
        abstractFactory = AluguelFactory.getInstancia();
        
        ClienteAluguel c2 = (ClienteAluguel) abstractFactory.criarCliente("Pedro", "Fox");
        CarroAluguel ca1 = (CarroAluguel) abstractFactory.criarCarro("Toyota");
        
        System.out.println(c2.getInformacao());
        System.out.println(ca1.getInformacao());
    }   
}
