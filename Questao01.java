/* Raissa Rodrigues - Sistemas de Informação
1. Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista. Após isto, calcule a média anual das temperaturas e
mostre todas as temperaturas acima da média anual, e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ). */
import java.util.ArrayList;
import java.util.Scanner;

public class Questao01 {

    public static void main(String[] args) {
        // Declaracao
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> temperaturasMensais = new ArrayList<>();
        double media = 0.0;

        //----------------------------------------------------------------
        // Solicitando as temperaturas mensais ao usuário e armazenando na lista
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite a temperatura média do mês " + (i + 1) + ": ");
            double temperatura = scanner.nextDouble();
            temperaturasMensais.add(temperatura);
        }
        
        //----------------------------------------------------------------
        // Calculando a média anual das temperaturas
        double soma = 0;
        for (double temperatura : temperaturasMensais) {
            soma += temperatura;
        }

        //----------------------------------------------------------------
        double mediaAnual = soma / 12;
        System.out.printf("Média anual das temperaturas: %.2f\n", mediaAnual);
        System.out.println("Temperaturas acima da média anual:");
        
        //----------------------------------------------------------------
        // Verificando as temperaturas acima da média anual
        for (int i = 0; i < 12; i++) {
            if (temperaturasMensais.get(i) > mediaAnual) {
                // Mostrando o mês
                System.out.println("Mês: " + mesExtenso(i + 1) + " - Temperatura: " + temperaturasMensais.get(i));
            }
        }
      }

    public static String mesExtenso(int mes) {
        switch (mes) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês inválido";
        }
    }
}
