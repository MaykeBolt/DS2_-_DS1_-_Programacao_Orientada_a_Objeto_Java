/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ds1javapoo04082023;

/**
 *
 * @author adven
 */
public class Motor extends Carcaca{
    String potencia;
    String combustivel;
    
    public Motor(String carro, String fabricante, String cor, String potencia, String combust) {
        super(carro, fabricante, cor);
        this.potencia = potencia;
        this.combustivel = combust;
    }
}
