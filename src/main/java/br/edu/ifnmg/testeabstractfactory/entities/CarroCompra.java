/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifnmg.testeabstractfactory.entities;

import br.edu.ifnmg.testeabstractfactory.interfaces.AbstractCarro;
import java.awt.event.AWTEventListener;

/**
 *
 * @author Lucas
 */
public class CarroCompra implements AbstractCarro {

    private String modelo;

    public CarroCompra(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String getInformacao() {
        return "Carro comprado de modelo: " + modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
