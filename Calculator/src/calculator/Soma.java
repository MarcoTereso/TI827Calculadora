/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculator;

/**
 *
 * @author mtereso
 */
class Soma {
    static void somar() {
     LeDados r = new LeDados();
     r.leValores("Insira um valor","Insira outro valor");
     System.out.println("Soma: "+(r.valor1+r.valor2));     
    }
}
