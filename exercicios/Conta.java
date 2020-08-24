package exemplo01.exercicios;

public class Conta {
    
    private int numConta;
    private float saldoConta;

    public Conta(int num,float saldo){
        this.numConta = num;
        this.saldoConta = saldo;
    }

    public String obterDados(){
        return "Número conta: "+numConta+"\nSaldo conta: "+saldoConta;
    }

    public void depositar(float valor){
        saldoConta = saldoConta + valor;
    }

    public void sacar(float valor){
        saldoConta = saldoConta - valor;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(float saldoConta) {
        this.saldoConta = saldoConta;
    }

    
}
