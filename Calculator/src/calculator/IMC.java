

package calculator;


class IMC {

    static void calculaIMC() {
        float imc;
        LeDados r = new LeDados();
        r.leValores();
        imc = r.valor1/(r.valor2*r.valor2);
        if(imc<18.5)
            System.out.println("Imc: "+imc+" Está abaixo do peso ideal");
        else if(imc<25)
            System.out.println("Imc: "+imc+" Está com o peso ideal");
        else if(imc<30)
            System.out.println("Imc: "+imc+" Está acima do peso ideal");
        else if(imc<35)
            System.out.println("Imc: "+imc+" Está Obeso Grau I");
        else if(imc<40)
            System.out.println("Imc: "+imc+" Está Obeso Grau II");
        else
            System.out.println("Imc: "+imc+" Está Obeso Grau III");
    }
    
}
