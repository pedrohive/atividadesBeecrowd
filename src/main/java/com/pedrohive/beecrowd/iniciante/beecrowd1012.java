package com.pedrohive.beecrowd.iniciante;

import java.util.Scanner;

public class beecrowd1012{
    
    public static void main(String[] args){
        
    
    Scanner sc = new Scanner(System.in);
    
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    
    double triangulo = (a * c) / 2;
    double circulo = 3.14159 * (c * c);
    double trapézio = ((a + b) * c) / 2;
    double quadrado = Math.pow(b, 2);
    double retangulo = a * b;
    
    System.out.printf("TRIANGULO: %.3f\n", triangulo);
    System.out.printf("CIRCULO: %.3f\n", circulo);
    System.out.printf("TRAPEZIO: %.3f\n", trapézio);
    System.out.printf("QUADRADO: %.3f\n", quadrado);
    System.out.printf("RETANGULO: %.3f\n", retangulo);
    
    }
}
