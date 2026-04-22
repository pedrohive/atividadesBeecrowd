package com.pedrohive.beecrowd.iniciante;

import java.util.Scanner;

public class beecrowd1013 {
    
    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        int soma = (a + b + Math.abs(a - b)) / 2;
        int soma2 = (soma + c + Math.abs(soma - c)) / 2;
        
        System.out.println(soma2 + " eh maior");
    }
}