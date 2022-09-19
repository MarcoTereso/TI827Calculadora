/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author mtereso
 */
class Multiplica {
    static void multiplicar() {
     LeDados r = new LeDados();
     r.leValores("Insira um valor","Insira outro valor");
     System.out.println("Multiplicação: "+(r.valor1*r.valor2));     
    }
}
