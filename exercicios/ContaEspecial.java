package exemplo01.exercicios;

public class ContaEspecial extends Conta{
    
    private float limite;

    public ContaEspecial(int num,float saldo, float limite){
        super(num, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(float valor){
        if (valor < (getSaldoConta()+limite)){
            super.sacar(valor);
        }
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        this.limite = limite;
    }

    @Override
    public String obterDados(){
        return super.obterDados()+"\nLimite: "+limite;
    }
    

}