/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory.interfaces;

/**
 *
 * @author Lucas
 */
public interface AbstractFactory<T,U> {
    
    public T criarCarro(String modelo);
    public U criarCliente(String nome, String modeloCarro);
}
