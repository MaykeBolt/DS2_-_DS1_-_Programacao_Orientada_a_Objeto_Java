/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1javapoo04082023;

/**
 *
 * @author adven
 */
public class RacingCar extends NormalCar {
    String hability;    
    
    RacingCar (String carro, String fabricante, String cor, String potencia, String combust, String hability) {
        super(carro, fabricante, cor, potencia, combust);
        this.hability = hability;
        
        
    }

}
