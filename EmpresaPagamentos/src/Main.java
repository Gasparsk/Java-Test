import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> funcionarios = new ArrayList<>();

        System.out.print("Digite o número de funcionários: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Funcionário #" + i + " dados:");
            System.out.print("Terceirizado (s/n)? ");
            char tipo = sc.next().charAt(0);
            sc.nextLine();  // Consumir a quebra de linha para evitar problemas com a entrada de texto
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Horas trabalhadas: ");
            int horas = sc.nextInt();
            System.out.print("Valor por hora: ");
            double valorHora = sc.nextDouble();

            if (tipo == 's' || tipo == 'S') {
                System.out.print("Despesa adicional: ");
                double despesaAdicional = sc.nextDouble();
                Funcionario funcionario = new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional);
                funcionarios.add(funcionario);
            } else {
                Funcionario funcionario = new Funcionario(nome, horas, valorHora);
                funcionarios.add(funcionario);
            }
        }

        System.out.println("\nPAGAMENTOS:");
        for (Funcionario funcionario : funcionarios) {
            System.out.println(funcionario.getNome() + " - R$ " + String.format("%.2f", funcionario.pagamento()));
        }

        sc.close();
    }
}
