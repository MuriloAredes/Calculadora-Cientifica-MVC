/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author vinic
 */
public class Calculadora {
    //atributos 
    private double numero1;
    private double numero2;
    private String operador;
    private double resultado;
    private double memoria;
    private String auxText;
    private double auxValor;
    
    public void Calculadora(){
        numero1 = 0;
        numero2 = 0;
        resultado = 0;
        operador = "";
        memoria = 0;
        //variaveis auxiliares
        auxText = "";
        auxValor = 0;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double getMemoria() {
        return memoria;
    }

    public void setMemoria(double memoria) {
        this.memoria = memoria;
    }

    public String getAuxText() {
        return auxText;
    }

    public void setAuxText(String auxText) {
        this.auxText = auxText;
    }

    public double getAuxValor() {
        return auxValor;
    }

    public void setAuxValor(double auxValor) {
        this.auxValor = auxValor;
    }
    
    
}
