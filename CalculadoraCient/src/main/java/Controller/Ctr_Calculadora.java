package Controller;
import Model.Calculadora;
import javax.swing.JOptionPane;

public class Ctr_Calculadora {
    
    Calculadora calculadora = new Calculadora();
   
    
    
    public void Reiniciar(){
        calculadora.setNumero1(0);
        calculadora.setNumero2(0);
        calculadora.setResultado(0);
        calculadora.setNumero1(0);
        calculadora.setOperador("");
    }
    
    //métodos p/ view
    public void setNumero1(String numero1){
        calculadora.setNumero1(Double.parseDouble(numero1));
    }
    
    public double getNumero1(){
        
        return calculadora.getNumero1();
    }
    
    public void setNumero2(String numero2){
        calculadora.setNumero2(Double.parseDouble(numero2));
    }
        
    public void setOperador(String operador){
        calculadora.setOperador(operador);
    }
    
    public void setResultado(String resultado){
        calculadora.setResultado(Double.parseDouble(resultado));
    }
    
    public String getResultado(){
        return Double.toString(calculadora.getResultado());
    }
    
    public double getMemoria() {
        return calculadora.getMemoria();
    }
    
    public String getAuxText() {
        return calculadora.getAuxText();
    }

    public void setAuxText(String AuxText) {
        calculadora.setAuxText(AuxText);
    }

    public double getAuxValor() {
        return calculadora.getAuxValor();
    }

    public void setAuxValor(double auxValor) {
        calculadora.setAuxValor(auxValor);
    }
    
    
    public void SelecionaOperadoracao(){
        if (calculadora.getOperador() == "+"){
            somar(calculadora.getNumero1(), calculadora.getNumero2());
        }
        if (calculadora.getOperador() == "-"){
            subtrair(calculadora.getNumero1(), calculadora.getNumero2());
        }
        if (calculadora.getOperador() == "*"){
            multiplicar(calculadora.getNumero1(), calculadora.getNumero2());
        }
        if (calculadora.getOperador() == "/"){
            dividir(calculadora.getNumero1(), calculadora.getNumero2());
        }
        if (calculadora.getOperador() == "%"){
            divRest(calculadora.getNumero1(), calculadora.getNumero2());
        }
        /*if (calculadora.getOperador() == "exp"){
            calculadora.calcularExp(calculadora.getNumero1(), calculadora.getNumero2());
        }
        */

    }
    
    //métodos de operações
    public double somar(double numero1, double numero2){
        
        calculadora.setResultado(numero1 + numero2);
        
        return calculadora.getResultado();
    }
    public double subtrair(double numero1, double numero2){
        
        calculadora.setResultado(numero1 - numero2);
        
        return calculadora.getResultado();
    }
    
    public double multiplicar(double numero1, double numero2){
        calculadora.setResultado(numero1 * numero2);
        
        return calculadora.getResultado();
    }
    
    public double dividir(double numero1, double numero2){
        calculadora.setResultado(numero1 / numero2);
        
        return calculadora.getResultado();
    }
    
    public double divRest(double numero1, double numero2){
        calculadora.setResultado(numero1 % numero2);
        
        return calculadora.getResultado();
    }
    
    public double calcularExp(double numero1){
        
        calculadora.setResultado(Math.exp(numero1));
        
        return calculadora.getResultado();
    }
    
    public void calcularTan(String painel){
        
        calculadora.setNumero1(Math.toRadians(Double.parseDouble(painel)));
        
        calculadora.setResultado(Math.tan (calculadora.getNumero1()) );
    }
    
    public void calcularSin(String painel){
        
        calculadora.setNumero1(Math.toRadians(Double.parseDouble(painel)));
        
        calculadora.setResultado(Math.sin(calculadora.getNumero1()));
    }
    
    public void calcularCos(String painel){
        
        calculadora.setNumero1(Math.toRadians(Double.parseDouble(painel)));
        
        calculadora.setResultado(Math.cos(calculadora.getNumero1()));
    }
    
    //  metodos da memória
    
    public void btnMC(){
        calculadora.setMemoria(0);
    }
    
    public double getMR(){
        return calculadora.getMemoria();
    }
    
    public void btnMmenos(double auxValor){
        calculadora.setMemoria(auxValor -= calculadora.getMemoria() );
    }
    
    public void btnMmais(double auxValor){
        calculadora.setMemoria(auxValor += calculadora.getMemoria() );
    }
    
}
