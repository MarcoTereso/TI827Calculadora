
package calculator;


class Divide {

    static void dividir() {
     
    LeDados r = new LeDados();
     r.leValores("Insira um valor","Insira outro valor");
     System.out.println("Divisão: "+(r.valor1/r.valor2)); 
    }
    
}
