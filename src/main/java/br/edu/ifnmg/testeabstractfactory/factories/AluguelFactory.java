/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory.factories;

import br.edu.ifnmg.testeabstractfactory.entities.CarroAluguel;
import br.edu.ifnmg.testeabstractfactory.entities.ClienteAluguel;
import br.edu.ifnmg.testeabstractfactory.interfaces.AbstractFactory;

/**
 *
 * @author Lucas
 */
public class AluguelFactory implements AbstractFactory<CarroAluguel,ClienteAluguel>{
    
    private AluguelFactory(){}
    private static AluguelFactory alugaFactory;
    
    public static AluguelFactory getInstancia(){
        if(alugaFactory == null)
            alugaFactory = new AluguelFactory();
        
        return alugaFactory;
    }

    @Override
    public CarroAluguel criarCarro(String modelo) {
        
        return new CarroAluguel(modelo);
    }

    @Override
    public ClienteAluguel criarCliente(String nome, String modeloCarro) {
        
        return new ClienteAluguel(nome, criarCarro(modeloCarro));
    }
}