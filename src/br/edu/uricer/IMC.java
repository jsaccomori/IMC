package br.edu.uricer;

import java.util.Scanner;

public class IMC {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o sexo:");
        String sexo = scanner.nextLine();
        
        System.out.println("Informe a estatura:");
        double estatura = scanner.nextDouble();
        
        System.out.println("Informe o peso:");
        double peso = scanner.nextDouble();
        
        CalculoIMC calculo = new CalculoIMC();
        calculo.setSexo(sexo);
        calculo.setAltura(estatura);
        calculo.setPeso(peso);
        
        int resultado = calculo.calcular();
        
        String msg = resultado == 0 ? "Abaixo do peso" : resultado == 1 ? "Peso Ideal" : "Acima do Peso";
        System.out.println("Resultado: " + msg);
        
    }
    
}
