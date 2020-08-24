package exemplo01.exercicios;

public class ContaCorrente extends Conta{
    
    private float taxaDeposito;

    public ContaCorrente(int num,float saldo){
        super(num, saldo);
        this.taxaDeposito = 0.10f;
    }

    @Override
    public void sacar(float valor){
        if (valor < getSaldoConta()){
            super.sacar(valor);
        }
    }

    @Override
    public void depositar(float valor){
        setSaldoConta((super.getSaldoConta() + valor)-taxaDeposito);
    }


}