
package banco;

public class Banco {

    public static void main(String[] args) {
      
    /*  
      ContaCorrente ccAfonso = new ContaCorrente();
      ccAfonso.setTitular("Afonso P Lima");
      ccAfonso.setNumero(123);
      ccAfonso.setAgencia("0123-1");
      ccAfonso.setSaldo(20.00);
      ccAfonso.setDataAbert("24.02.2008");
     
      System.out.println(endAfonso.getBairro());
      
      //questão 3  
      System.out.println(ccAfonso.toString());
      */
      
      //questão 4 
      //primeira conta
      ContaPoupanca cpAmanda = new ContaPoupanca();
      cpAmanda.setTitular("Amanda Lira");
      cpAmanda.setNumero(346);
      cpAmanda.setAgencia("0987-9");
      cpAmanda.setSaldo(5.00);
      cpAmanda.setDataAbert("04.01.2000");
      
        
      //Deposito
      cpAmanda.deposito(3.00);
      
      //saca
      cpAmanda.sacar(2.00);
     
      
      
      //segunda conta
      
      ContaPoupanca cpBianca = new ContaPoupanca();
      cpBianca.setTitular("Bianca Fonseca");
      cpBianca.setNumero(792);
      cpBianca.setAgencia("7925-6");
      cpBianca.setSaldo(500.00);
      cpBianca.setDataAbert("25.03.2000");
     
      
      //deposito
      cpBianca.deposito(200);
      
      //transferencia
      cpBianca.transferir(cpAmanda, 100);
      
      System.out.println(cpAmanda.toString());
      System.out.println("\n"+cpBianca.toString());
      
     
      
      /*questão 8
      ContaCorrente ccNaldo = new ContaCorrente();
      ccNaldo.deposito(5);
      System.out.println(ccNaldo.getValorImposto());*/
     
      
      
      /*Questão 6
      Como eu ja havia criado as classes ContaCorrente e ContaPoupanca, deu erro somente na hora de rodar o codigo
      foi esse:
     
      Exception in thread "main" java.lang.UnsupportedOperationException: Not supported yet.
	at banco.ContaPoupanca.taxaAdministracao(ContaPoupanca.java:34)
	at banco.Conta.toString(Conta.java:24)
	at banco.Banco.main(Banco.java:46)
C:\Users\Juliana\AppData\Local\NetBeans\Cache\8.2\executor-snippets\run.xml:53: Java returned: 1
FALHA NA CONSTRUÇÃO (tempo total: 2 segundos)
      
      Pois havia errado na hora de usar o toString para exibir as informação.
      */
     
     
      
    }
    
}
