import java.util.Locale;
import java.util.Scanner;

class SistemaBeneficios {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Diga seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Idade: ");
        int idade = entrada.nextInt();

        System.out.print("Salário (R$): ");
        double salario = entrada.nextDouble();

        System.out.print("Tempo de empresa (em anos): ");
        int tempoEmpresa = entrada.nextInt();

        System.out.print("Quantidade de filhos: ");
        int filhos = entrada.nextInt();

        System.out.print("Modalidade de trabalho (presencial / home office): ");
        String modalidade = entrada.nextLine();

        System.out.print("Utiliza veículo próprio? (sim / nao): ");
        String veiculoProprio = entrada.nextLine();

        boolean valeAlimentacao = salario <= 5000.00;
        boolean auxilioCreche = filhos > 0 && idade < 50;
        boolean planoSaude = tempoEmpresa >= 1 || idade >= 18;
        boolean auxilioHomeOffice = modalidade.equalsIgnoreCase("home office");
        boolean auxilioCombustivel = modalidade.equalsIgnoreCase("presencial") && veiculoProprio.equalsIgnoreCase("sim");
        boolean plr = tempoEmpresa >= 1;
        boolean bolsaEstudos = salario < 7000.00 && tempoEmpresa >= 2;

        System.out.println("\n=================================");
        System.out.println(" RELATÓRIO DE BENEFÍCIOS: " + nome.toUpperCase());
        System.out.println("=================================");
        System.out.println("Vale-Alimentação: " + (valeAlimentacao ? "Direito Concedido" : "Não Elegível"));
        System.out.println("Auxílio-Creche: " + (auxilioCreche ? "Direito Concedido" : "Não Elegível"));
        System.out.println("Plano de Saúde: " + (planoSaude ? "Elegível" : "Não Elegível"));
        System.out.println("Auxílio Home Office: " + (auxilioHomeOffice ? "Direito Concedido" : "Não Elegível"));
        System.out.println("Auxílio Combustível: " + (auxilioCombustivel ? "Direito Concedido" : "Não Elegível"));
        System.out.println("Participação na PLR: " + (plr ? "Elegível" : "Não Elegível"));
        System.out.println("Bolsa de Estudos: " + (bolsaEstudos ? "Elegível" : "Não Elegível"));
        System.out.println("=================================");

    }
}