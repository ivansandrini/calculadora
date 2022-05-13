package com.programacaoempar.calculadora;

public class Calculadora {


    public String calcula(String expressao) throws Exception {
        int resultado = 0;

        if(expressao.contains("+")){
            String[] numeros = expressao.split("\\+");

            for (int i = 0; i < numeros.length ; i++) {
                resultado += Integer.valueOf(numeros[i]);
            }
        } else if(expressao.contains("-")){
            String[] numeros = expressao.split("\\-");
            resultado = Integer.valueOf(numeros[0]);

            for (int i = 1; i < numeros.length ; i++) {
                resultado -= Integer.valueOf(numeros[i]);
            }
        } else {
            return "Operação não é válida";
        }

        return String.valueOf(resultado);
    }
}
