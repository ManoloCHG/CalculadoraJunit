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
    
    double ans;
    
    public static int suma (int a , int b){
        return a+b;
    } 
    public static int resta (int a , int b){
        return a-b;
    }
    public static int multiplica (int a , int b){
        return a*b;
    }
    public static int divide (int a , int b){
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
