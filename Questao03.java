/*3. Faça um programa que leia um número indeterminado de valores,
correspondentes a notas, encerrando a entrada de dados quando for
informado um valor igual a -1 (que não deve ser armazenado).
Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do
outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo
do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem. */

import java.util.ArrayList;
import java.util.Scanner;

public class Questao03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numeros = new ArrayList<>();
    int numero = 0;
    double soma = 0, media = 0, acimaMedia = 0, abaixoSete = 0;

    while (numero != -1) {
      System.out.println("Digite um número: ");
      numero = scanner.nextInt();
      numeros.add(numero);
    }

    // Mostrar a quantidade de valores que foram lidos
    System.out.println("Quantidade de valores lidos: " + numeros.size());

    //soma e media
    soma = soma + numero;
    media = soma / numeros.size();

    // Exibir todos os valores na ordem em que foram informados, um ao lado do outro
    System.out.println("Números digitados:");
    for (int i = 0; i < numeros.size(); i++) {
      System.out.print(numeros.get(i) + " ");
    }

    // Exibir todos os valores na ordem invertida em que foram informados, um ao lado do outro
    System.out.println("Ordem invertida: ");
    for (int i = 0; i == numeros.size() - 1; i--) {
      System.out.print(numeros.get(i) + " ");
    }

    //Exibir soma e madia
    System.out.println("Soma: " + soma);
    System.out.println("Media: " + media);

    // Calcular e mostrar a quantidade de valores acima da média calculada
    for (int valor : numeros) {
      if (valor > media) {
        acimaMedia++;
      }
      if (valor < 7) {
        abaixoSete++;
      }
    }
    System.out.println("Quantidade de valores acima da média: " + acimaMedia);

    // Calcular e mostrar a quantidade de valores abaixo de sete
    System.out.println("Quantidade de valores abaixo de sete: " + abaixoSete);

    System.out.println("Programa encerrado.");
    scanner.close();
  }
}
