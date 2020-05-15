/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import banco.Conta.Tributavel;

/**
 *
 * @author Juliana
 */
public class ContaCorrente extends Conta implements Tributavel{
    private double taxaAdministracao;
    private double limite;
    
    @Override
    public double taxaAdministracao() {
        return saldo-=0.08;
    }
    
    @Override
    public double limite() {
        return limite = 2.000;
    }
    
    @Override
    public double getValorImposto(){
    return this.getSaldo()*0.01;
    }

    public double getTaxaAdministracao() {
        return taxaAdministracao;
    }

    public void setTaxaAdministracao(double taxaAdministracao) {
        this.taxaAdministracao = taxaAdministracao;
    }
    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public double porcentagemRendimento() {
        return 0;
        
    }

    @Override
    public double diaRendimento() {
        return 0;
    }

    

    

    
   

    

    

    
}
