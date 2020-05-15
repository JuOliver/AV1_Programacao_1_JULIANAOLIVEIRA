/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author Juliana
 */
public abstract class Conta {
    private String titular;
    private int numero;
    private String agencia;
    double saldo;
    private String dataAbert;

    /* Questão 7 - Justificativa 
    Usei a estrutura condicional if e else. No if se a conta for uma conta corrente então ele vai
    retornar todas as informações referentes a essa conta. Se não, vai retornar as
    informações referentes a conta poupança.
    */
    @Override
    public String toString() {
        boolean contaCorrente = false;
       if(contaCorrente){
       return "\nConta" + "\nTitular= " + titular + "\nNumero= " + numero
                + "\nAgencia= " + agencia + "\nSaldo= " + saldo + 
                "\nData de Abertura= "+ dataAbert + "\nTaxa de 8%= "+ taxaAdministracao() 
                + "\nLimite= "+limite();
       }
        else{
        return "\nConta" + "\nTitular= " + titular + "\nNumero= " + numero
                + "\nAgencia= " + agencia + "\nSaldo= " + saldo + 
                "\nData de Abertura= "+ dataAbert + "\nPorcentagem Rendimento= "+ porcentagemRendimento()
                +"\nDia Rendimento= "+ diaRendimento() ;
    }
        
    }
    
    public abstract double taxaAdministracao(); 
    public abstract double limite();
    public abstract double porcentagemRendimento();
    public abstract double diaRendimento();
    
    
 public interface Tributavel {
 public double getValorImposto();
}
    
    boolean sacar(double valor){
        if (valor> 0){
            if (this.saldo >= valor){
            this.saldo -= valor;
            return true;
            } else
            System.out.println("Saldo disponivel para movimentação é: "+ this.saldo);
            
        }
    return false;
    }
    
    
    boolean deposito(double valor){
        this.saldo += valor;
        return true;
    }
    
    boolean transferir (Conta contaDestino, double valor){
    boolean retirou = sacar(valor);
    if (retirou){
        contaDestino.deposito(valor);
        return true;
    }
    else{
        return false;
    }
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbert() {
        return dataAbert;
    }

    public void setDataAbert(String dataAbert) {
        this.dataAbert = dataAbert;
    }


    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

   

   
    
    
}
