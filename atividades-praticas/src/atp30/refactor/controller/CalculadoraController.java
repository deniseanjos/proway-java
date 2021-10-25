package refactor.controller;

import refactor.model.Calculadora;

public class CalculadoraController {

    public int somar(Calculadora calc){
        int result = calc.number1 + calc.number2;
        return result;
    }

    public int subtrair(Calculadora calc){
        int result = calc.number1 - calc.number2;
        return result;
    }

    public int multiplicar(Calculadora calc){
        int result = calc.number1 * calc.number2;
        return result;
    }

    public int dividir(Calculadora calc){
        int result = calc.number1 / calc.number2;
        return result;
    }
    
}
