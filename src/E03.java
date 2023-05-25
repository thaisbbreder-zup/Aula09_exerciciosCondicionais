import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        Scanner entradaDoUsuario = new Scanner(System.in);

        System.out.println("********** RESPONDA SIM OU NÃO PARA AS QUESTÕES ABAIXO **********");

        System.out.println("Telefonou para a vítima?");
        String resposta1 = entradaDoUsuario.next();

        System.out.println("Esteve no local do crime?");
        String resposta2 = entradaDoUsuario.next();

        System.out.println("Mora perto da vítima?");
        String resposta3 = entradaDoUsuario.next();

        System.out.println("Devia para a vítima?");
        String resposta4 = entradaDoUsuario.next();

        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = entradaDoUsuario.next();

        int respostaPositiva = 0;

        if (resposta1.equalsIgnoreCase("SIM")) {
            respostaPositiva += 1;
        }
        if (resposta2.equalsIgnoreCase("SIM")) {
            respostaPositiva += 1;
        }
        if (resposta3.equalsIgnoreCase("SIM")) {
            respostaPositiva += 1;
        }
        if (resposta4.equalsIgnoreCase("SIM")) {
            respostaPositiva += 1;
        }
        if (resposta5.equalsIgnoreCase("SIM")) {
            respostaPositiva += 1;
        }

        if (respostaPositiva == 2) {
            System.out.println("Atenção! Essa pessoa é suspeita.");
        } else if (respostaPositiva >= 3 && respostaPositiva <= 4) {
            System.out.println("Investigue mais! Essa pessoa pode ser cúmplice.");
        } else if (respostaPositiva == 5) {
            System.out.println("Cuidado! Você está lidando com o assassino.");
        } else {
            System.out.println("Possivelmente, essa pessoa é inocente");
        }
    }
}
