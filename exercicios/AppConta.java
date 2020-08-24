package exemplo01.exercicios;

public class AppConta {


import java.util.Scanner;

public class AppConta {
    public static void main(String[] args) {
        int opcao = 0, numConta;
        String entrada;    
        ContaCorrente cc1 = null;

        Scanner in = new Scanner(System.in);

        do{
            System.out.println("1 - Nova conta corrente");
            System.out.println("2 - Nova conta poupança");
            System.out.println("3 - Nova conta especial");
            System.out.println("4 - Mostrar saldo");
            System.out.println("5 - Fazer saque");
            System.out.println("6 - Fazer depósito");
            System.out.println("7 - Sair do sistema");
            
            System.out.println("==> ");
            opcao = in.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("1 - Nova conta corrente");
                    System.out.println("Informe o número da conta:");
                    entrada = (in.nextLine());
                    numConta = Integer.parseInt(entrada);
                    cc1 = new ContaCorrente(numConta, 0);
                    break;
                case 2:
                    System.out.println("2 - Nova conta poupança");
                    break;
                case 3:
                    System.out.println("3 - Nova conta especial");
                    break;
                case 4:
                    System.out.println("4 - Mostrar saldo");
                    if (cc1 != null){
                        System.out.println(cc1.obterDados());
                    }
                    break;
                case 5:
                    System.out.println("5 - Fazer saque");
                    break;
                case 6:
                    System.out.println("6 - Fazer depósito");
                    break;
                case 7:
                    System.out.println("7 - Sair do sistema");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 7);

        
        

    }
}