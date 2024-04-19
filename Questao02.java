/*2. Utilizando listas faça um programa que faça 5 perguntas para uma pessoa
sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da
pessoa no crime. Se a pessoa responder positivamente a 2 questões ela deve
ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente". */
import java.util.ArrayList;
import java.util.Scanner;

public class Questao02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> perguntas = new ArrayList<>();
    int contadorSim = 0;
    int contadorNao = 0;

    System.out.println("Digite sim [S] ou não [N] para as repostas: ");
    perguntas.add("Telefonou para a vítima?");
    perguntas.add("Esteve no local do crime?");
    perguntas.add("Mora perto da vítima?");
    perguntas.add("Devia para a vítima?");
    perguntas.add("Já trabalhou com a vítima?");

    for (String pergunta : perguntas) {
      System.out.println(pergunta);
      char resposta = scanner.next().charAt(0);

      if (resposta == 'S' || resposta == 's') {
        System.out.println("Resposta: Sim");
        contadorSim++;
      } else {
        System.out.println("Resposta: Não");
        contadorNao++;
      }
    }

    // Classificação da participação
    if (contadorSim == 2) {
      System.out.println("Suspeita");
    } else if (contadorSim >= 3 && contadorSim <= 4) {
      System.out.println("Cúmplice");
    } else if (contadorSim == 5) {
      System.out.println("Assassino");
    } else {
      System.out.println("Inocente");
    }

    scanner.close();
  }
}
