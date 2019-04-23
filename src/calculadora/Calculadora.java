/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author PC04
 */
public class Calculadora {
    
    public static double suma (double a , double b){
        return a+b;
    } 
    public static double resta (double a , double b){
        return a-b;
    }
    public static double multiplica (double a , double b){
        return a*b;
    }
    public static double divide (double a , double b){
        return a/b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int res;
        int suma;
        int multiplica;
        int divide;

        System.out.println(divide(8,2));   
    }   
}
