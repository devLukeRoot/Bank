package banco;

public class contadeBanco {
  private String nome,tipocont;
  private float saldo,numconta;
  private int idade;

    public contadeBanco() {
        
    }

    public void consultarDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Numero da Conta: " + this.getNumconta());
        System.out.println("Tipo da conta: " + this.getTipocont());
    }
    
    public void sacar(float saque){
        if (saque > saldo) {
            
        } else {
        this.saldo = this.saldo - saque;
        }
    }
    
    public void deposito(float depositado){
        this.saldo = this.saldo + depositado;
    }
    
    public void consuSaldo(){
        System.out.println("Saldo atual: " + this.getSaldo());
    }
    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipocont() {
        return tipocont;
    }

    public void setTipocont(String tipocont) {
        this.tipocont = tipocont;
        if (getTipocont() == "poupanca") {
            this.saldo = 50;
        } else if(getTipocont() == "corrente"){
            this.saldo = 100;
        }
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getNumconta() {
        return numconta;
    }

    public void setNumconta(float numconta) {
        this.numconta = numconta;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
  
  
  
}
