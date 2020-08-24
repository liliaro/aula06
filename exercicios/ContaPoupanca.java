package exemplo01.exercicios;

public class ContaPoupanca extends Conta{
    
    private static float taxaOperacao;

    public ContaPoupanca(int num,float saldo){
        super(num, saldo);
    }

    @Override
    public void sacar(float valor){
        if ((valor+taxaOperacao) < getSaldoConta()){
            super.sacar(valor+taxaOperacao);
        }
    }

    @Override
    public String obterDados(){
        return super.obterDados()+"\nTaxa Operação: "+taxaOperacao;
    }

    public static float getTaxaOperacao() {
        return taxaOperacao;
    }

    public static void setTaxaOperacao(float taxaOperacao) {
        ContaPoupanca.taxaOperacao = taxaOperacao;
    }

    
}