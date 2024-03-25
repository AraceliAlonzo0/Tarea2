/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea2;
import java.util.Scanner;

/**
 *
 * @author ARACELI
 */
class Tarea2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int tm;
        String nivelT=" ";
        String momentoDia;

        System.out.println("Ingrese momento del dia. (manana, tarde, noche): ");
        momentoDia = sc.nextLine();
    
        System.out.println("Ingrese la temperatura del tanque: ");
        tm = sc.nextInt();
         if (tm<15){
                nivelT="muy buena";
            }
        else if (tm>=15 && tm<=25){
                nivelT="normal";
            }
        else if (tm>25){
                nivelT="peligrosa";
            }
        else{
            System.out.println("error, valor no valido");
        }
        switch(momentoDia){
            case "manana": 
            System.out.println("la temperatura del tanque es: "+nivelT+", para el momento del dia ingresado: "+momentoDia);    
                break;
            case "tarde":
                System.out.println("la temperatura del tanque  es: "+nivelT+", para el momento del dia ingresado: "+momentoDia); 
                break;
            case "noche": 
                System.out.println("la temperatura del tanque es: "+nivelT+", para el momento del dia ingresado: "+momentoDia); 
                break;
            default: System.out.println("Error,ingrese un momento del dia");;   
        }
    }
}