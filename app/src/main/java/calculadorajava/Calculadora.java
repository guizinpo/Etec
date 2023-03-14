/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadorajava;

/**
 *
 * @author Admin
 */
public class Calculadora {
    public double somar(double a, double b){
        return a + b;
    }
    public double subtracao(double a, double b){
        return a - b;
    }
    public double multiplicacao(double a, double b){
        return a * b;
    }
    public double divisao(double a, double b){
        if(a == 0){
            return 0;
        }
        else{
            return a / b;
        }
    }
    public double raizq(double x){
        return Math.sqrt(x);
    }
    public double porcentagem(double a, double b){
        return a * b / 100;
    }
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
}
