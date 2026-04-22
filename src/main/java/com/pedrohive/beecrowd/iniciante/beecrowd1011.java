package com.pedrohive.beecrowd.iniciante;

import java.util.Scanner;

public class beecrowd1011 {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

        double  r = sc.nextDouble();
        double  volume = (4.0/3) * 3.14159 * Math.pow(r, 3);
        
        System.out.printf("VOLUME = %.3f\n", volume);
    
    sc.close();
    
    }
}
