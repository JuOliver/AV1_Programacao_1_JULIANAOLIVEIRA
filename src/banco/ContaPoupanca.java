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
public class ContaPoupanca extends Conta{
    private double porcentagemRendimento;
    private double diaRendimento;

    public double getPorcentagemRendimento() {
        return porcentagemRendimento;
    }

    public void setPorcentagemRendimento(double porcentagemRendimento) {
        this.porcentagemRendimento = porcentagemRendimento;
    }

    public double getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(double diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    @Override
    public double taxaAdministracao() {
        return 0;
                }

    @Override
    public double limite() {
        return 0;
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
