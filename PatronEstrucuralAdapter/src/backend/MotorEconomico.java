/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author HP PAVILON
 */
public class MotorEconomico extends Motor {

    public MotorEconomico(){
        super();
        System.out.println("Creando motor económico...");
    }

    @Override
    public void encender() {
        System.out.println("Encendiendo motor económico.");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el motor económico.");
    }

    @Override
    public void apagar() {
        System.out.println("Apagando motor económico.");
    }
}
