import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("Informe o tipo de combustível:\n A-álcool\n G-gasolina");
        String tipoCombustivel = entradaDoUsuario.next();

        System.out.println("Informe a quantidade de combustível em litros");
        int quantidade = entradaDoUsuario.nextInt();

        double valorAlcool = 1.90;
        double valorGasolina = 2.50;

        //variáveis para atribuir valores de acordo com a condição
        double valorSemDesconto = 0;
        double desconto = 0;

        if (tipoCombustivel.equals("A") && quantidade <= 20) {
            valorSemDesconto = quantidade * valorAlcool;
            desconto = quantidade * 0.03;

        } else if (tipoCombustivel.equals("A") && quantidade > 20) {
            valorSemDesconto = quantidade * valorAlcool;
            desconto = quantidade * 0.05;

        } else if (tipoCombustivel.equals("G") && quantidade <= 20) {
            valorSemDesconto = quantidade * valorGasolina;
            desconto = (quantidade * valorGasolina) * 0.04;

        } else if (tipoCombustivel.equals("G") && quantidade > 20) {
            valorSemDesconto = quantidade * valorGasolina;
            desconto = (quantidade * valorGasolina) * 0.06;
        }
        double valorFinal = valorSemDesconto - desconto;

        if (tipoCombustivel.equalsIgnoreCase("A")) {
            System.out.println("O valor a ser pago é R$" + valorFinal);
        } else if (tipoCombustivel.equalsIgnoreCase("G")) {
            System.out.println("O valor a ser pago é R$" + valorFinal);
        } else {
            System.out.println("Tipo de combustível inválido.");
        }
    }
}