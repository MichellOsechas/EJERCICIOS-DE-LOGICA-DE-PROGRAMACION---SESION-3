/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.proyecto1;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

/**
 *
 * @author admin
 */

public class Proyecto1 {

        public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    public static void main(String[] args) {
      /* 
        //EJERCICIO 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del cateto 1: ");              
        int cateto1 = sc.nextInt();
        System.out.print("Ingrese el valor del cateto 2: ");
        int cateto2 = sc.nextInt();
        double hipotenusa = Math.sqrt((Math.pow(cateto1, 2 )) + (Math.pow(cateto2, 2 )));
        System.out.println("La hipotenusa es: " + hipotenusa);
         
        
        //EJERCICIO 2
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = sc.nextInt();                                    
        if(num % 2 == 0)
        System.out.println("Su numero es par");
        else 
        System.out.println("Su numero es impar");
        

        //EJERCICIO 3
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del angulo1: ");
        int angulo1 = sc.nextInt();
        System.out.print("Ingrese el valor del angulo2: ");
        int angulo2 = sc.nextInt();
        int angulo3 = 180 - (angulo1 + angulo2);
        System.out.println("El tercer angulo es: " + angulo3);
         

        //EJERCICIO 4
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double primernum = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double segundonum = sc.nextDouble();
        System.out.print("Ingrese el tercer numero: ");
        double tercernum = sc.nextDouble(); 
        double promedio = (primernum + segundonum + tercernum) / 3; 
        System.out.println("El promedio es: " + promedio);

        //EJERCICIO 5
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.next ();
        System.out.println(nombre.length());
        
        //EJERCICIO 6
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base del triangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triaungulo:");
        double altura = sc.nextDouble();
        double area = base * altura /2;
        System.out.println("El area del triangulo es: + " + area);
        

        //EJERCICIO 7
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa un numero: ");
        double num = sc.nextDouble();
        num = Math.sqrt(num);
        System.out.println(num);
           

        //EJERCICIO 8
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingresea el segundo numero: ");
        int num2 = sc.nextInt();
        int num;
          if(num1>num2)
             num = num1 % num2;
          else 
             num = num2 % num1;
             if (num==0)
        System.out.println("el MCD de (num1) y (num2) es: " + );
        int result;
             else if (num1 > num2);
             result= num2 % num;
             else (num2 > num1);
             result = num1 % num;
        System.out.println(result);
        
        
         /* 
         
        //EJERCICIO 9
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa una palabra: ");
        String palabra = sc.next();
        System.out.print("La palabra invertida es: " + reverse(palabra));
        

        //EJERCICIO 10
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base del rectangulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del rectangulo:");
        double altura = sc.nextDouble();
        double area = base * altura;
        System.out.println("El area del rectangulo es: + " + area);
        */
    }
}