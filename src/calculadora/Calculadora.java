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
    static double ans;
    public double  suma (double a , double b){
        ans = a+b;
        return ans;
    } 
    public double  resta (double a , double b){
        ans = a-b;
        return ans;
    }
    public double  multiplica (double a , double b){
        ans = a*b;
        return ans;
    }
    public double  divide (double a , double b){
        ans = a/b;
        return ans;
    }
    public  double suma (double a){
        ans = a+ans;
        return ans;
    } 
    public  double resta (double a){
        ans = a-ans;
        return ans;
    }
    public  double multiplica (double a){
        ans = a*ans;
        return ans;
    }
    public  double divide (double a){
        ans = a/ans;
        return ans;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here   
    }   
}
