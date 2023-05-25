import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("CALCULADORA DE FOLHA DE PAGAMENTO");
        System.out.println("Quanto você recebe por hora?");
        double salarioHora = entradaDoUsuario.nextDouble();

        System.out.println("Quantas horas você trabalhou esse mês?");
        double horasMensais = entradaDoUsuario.nextDouble();

        // cálculo do salário bruto
        double salarioBruto = salarioHora * horasMensais;

        //variavel para receber o desconto da IR
        double ir = 0;
        //variavel para receber e imprimir a % referente a IR
        double irPorcentagem = 0;

        if (salarioBruto <= 900) {
            ir = 0;
            irPorcentagem = 0;
        } else if (salarioBruto <= 1500) {
            ir = (salarioBruto * 5) / 100;
            irPorcentagem = 5;
        } else if (salarioBruto <= 2500) {
            ir = (salarioBruto * 10) / 100;
            irPorcentagem = 10;
        } else if (salarioBruto > 2500) {
            ir = (salarioBruto * 20) / 100;
            irPorcentagem = 20;
        }

        //calculo INSS
        double inss = (salarioBruto * 10) / 100;

        //FGTS
        double fgts = (salarioBruto * 11) / 100;

        //calculo do total de descontos
        double totalDescontos = ir + inss;

        //calculo do salario liquido
        double salarioLiquido = salarioBruto - ir - inss;

        System.out.printf("Salário bruto: (%.2f * %.2f) : R$ %.2f%n", salarioHora, horasMensais, salarioBruto);
        System.out.printf("(-) IR (%.0f%%) : R$ %.2f%n", irPorcentagem, ir);
        System.out.printf("(-) INSS (10%%) : R$ %.2f%n", inss);
        System.out.printf("FGTS (11%%) : R$ %.2f%n", fgts);
        System.out.printf("Total de descontos : R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido : R$ %.2f%n", salarioLiquido);

    }
}
