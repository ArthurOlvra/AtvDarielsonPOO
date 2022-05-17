/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadedarielson;

/**
 *
 * @author arthur
 */
public class AtividadeDarielson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //instanciando clientes
       Cliente cliente = new Cliente();
       cliente.setNome("Arthur");
       cliente.setCpf("37484563325");
       cliente.setEndereco("Bairro Piaui");
       
       Cliente cliente2 = new Cliente();
       cliente2.setNome("Marcos");
       cliente2.setCpf("36475834452");
       cliente2.setEndereco("Rua Ceara");
       //instanciando uma conta corrente
       ContaCorrente corrente = new ContaCorrente();
       //setando valores iniciais dos atributos
       corrente.setTitular(cliente);
       corrente.setSaldo(500);
       corrente.setRendimento(0.25);
       //realizando operações com os métodos
       System.out.println(corrente.getTitular().getNome());
       corrente.consultarSaldo();
       
       //instanciando uma conta poupanca
       ContaPoupanca poupanca = new ContaPoupanca();
       //setando valores iniciais dos atributos
       poupanca.setSaldo(1500.50);
       poupanca.setTitular(cliente2);       
       //realizando operações com os métodos
       System.out.println(poupanca.getTitular().getNome());
       poupanca.depositar(150.50);
       poupanca.sacar(2000.00);
       poupanca.sacar(51.00);
    }
    
}
