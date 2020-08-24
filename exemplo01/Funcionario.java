package exemplo01;

/**
 * Funcionario
 */
public class Funcionario {

    protected String nome; // Protected: pode acessar diretamente da classe derivada ou de classes no mesmo
                           // pacote
    private double salario;

    public Funcionario() { // construtor default
        salario = 0;
    }

    // Overload - MESMO nome, mas PELO MENOS um parâmetro deve ser diferente
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // convenção
    /*
     * Para obter o valor de um atributo, dou o nome para o método iniciando com get
     * seguido do nome do atributo com o uso do CamelCase Para alterar o valor de um
     * atributo inicia o método com o nome set seguido do nome do atributo com o uso
     * do CamelCase
     */

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    public String imprimir() {
        return "Funcionario: " + nome + " salario: " + String.format("%.2f", salario);
    }

    public void aumentarSalario(double perc) {
        // salario = salario + salario * perc;
        // salario = salario * (1 + perc);
        salario *= (1 + perc);
    }

}