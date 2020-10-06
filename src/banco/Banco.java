package banco;

import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {
    contadeBanco c1 = new contadeBanco();
    c1.setNome("AZEITONA");
    c1.setTipocont("corrente");
    c1.setNumconta(32164);
    c1.setIdade(32);
    
    
    int opcao = 0;

    do{

        System.out.println("\n                  =========================");
        System.out.println("                  |    1 – Cadastrar Cliente |");
        System.out.println("                  |    2 – Sacar             |");
        System.out.println("                  |    3 – Depositar         |");
        System.out.println("                  |    4 – Consultar Saldo   |");
        System.out.println("                  |    5 – Consultar Dados   |");
        System.out.println("                  |    6 – Sair              |");
        System.out.println("                   =========================\n");

        Scanner op = new Scanner(System.in);
        opcao = op.nextInt();
        Scanner dados = new Scanner(System.in);
        switch (opcao){
                    case 1:
                        contadeBanco c2 = new contadeBanco();
                        System.out.println("Cadastrar Cliente");
                        System.out.println("Digite seu nome: ");
                        c2.setNome(dados.next());
                        System.out.println("Digite sua idade: ");
                        c2.setIdade(dados.nextInt());
                        System.out.println("Digite o tipo de conta que deseja: ");
                        c2.setTipocont(dados.next());
                        System.out.println("Digite um numero para representar sua conta: ");
                        c2.setNumconta(dados.nextFloat());
                        System.out.println("Conta criada com sucesso!!!");
                        System.out.println("Nome: " + c2.getNome() + "\nIdade: " + c2.getIdade() + "\nTipo da conta: " + c2.getTipocont() + "\nNumero da conta: " + c2.getTipocont());
                      break;
                    case 2:
                        System.out.println("Sacar");
                        System.out.println("Digite o valor a ser sacado: ");
                        c1.sacar(dados.nextFloat());
                        System.out.println("Saque efetuado com sucesso\nsaldo atual: " + c1.getSaldo());
                        break;
                    case 3:
                        System.out.println("Depositar");
                        System.out.println("Digite o valor a ser depositado: ");
                        c1.deposito(dados.nextFloat());
                        System.out.println("Deposito efetuado com sucesso!!\nSaldo atual: " + c1.getSaldo());
                        break;
                    case 4:
                        System.out.println("Consultar Saldo ");
                        System.out.println("Saldo: " + c1.getSaldo());
                        break;
                    case 5:
                        System.out.println("Consultar Dados");
                        System.out.println("Nome: " + c1.getNome());
                        System.out.println("Numero da Conta: " + c1.getNumconta());
                        System.out.println("Tipo da conta: " + c1.getTipocont());
                        break;
                    case 6:
                        System.out.println("Sair");
                        break;

                }
        }while(opcao != 6);

}
}
   
