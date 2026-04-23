package com.pedrohive.beecrowd.iniciante;

import java.util.Scanner;

    public class beecrowd1014 {
        
        public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        double x = sc.nextDouble();
        double y = sc.nextDouble();
            
        double resultado = x / y;
        
        System.out.printf("%.3f km/l", resultado);
        
        sc.close();
        
        }
    }