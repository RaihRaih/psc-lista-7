/*4. Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus
vendedores com base em comissões. O vendedor recebe $200 por semana
mais 9 por cento de suas vendas brutas daquela semana.
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana
recebe $200 mais 9 por cento de $3000, ou seja, um total de $470.
Escreva um programa (usando um array de contadores) que determine
quantos vendedores receberam salários nos seguintes intervalos de valores:
$200 - $299
$300 - $399
$400 - $499
$500 - $599
$600 - $699
$700 - $799
$800 - $899
$900 - $999
$1000 em diante */

import java.util.ArrayList;
import java.util.Scanner;

public class Questao04{
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);

    // Entrada de vendas brutas de cada vendedor
    while (true) {
        System.out.print("Digite as vendas brutas do vendedor (ou -1 para parar): ");
        double vendas = scanner.nextDouble();
        
        if (vendas == -1) {
            break;
        }

        lista.add((int) vendas);
    }

    // Contadores para cada intervalo de salário
    int[] intervalos = new int[9];

    // Calculando o salário de cada vendedor e contando nos intervalos correspondentes
    for (double vendas : lista) {
        double salario = 200 + (0.09 * vendas);
        if (salario >= 200 && salario <= 299) {
            intervalos[0]++;
        } else if (salario >= 300 && salario <= 399) {
            intervalos[1]++;
        } else if (salario >= 400 && salario <= 499) {
            intervalos[2]++;
        } else if (salario >= 500 && salario <= 599) {
            intervalos[3]++;
        } else if (salario >= 600 && salario <= 699) {
            intervalos[4]++;
        } else if (salario >= 700 && salario <= 799) {
            intervalos[5]++;
        } else if (salario >= 800 && salario <= 899) {
            intervalos[6]++;
        } else if (salario >= 900 && salario <= 999) {
            intervalos[7]++;
        } else {
            intervalos[8]++;
        }
    }

    // Mostrando os resultados
    int inicioIntervalo = 200;
    for (int i = 0; i < intervalos.length; i++) {
        int fimIntervalo = inicioIntervalo + 99;
        if (i == intervalos.length - 1) {
            fimIntervalo = 1000;
        }
        System.out.printf("$%d - $%d: %d%n", inicioIntervalo, fimIntervalo, intervalos[i]);
        inicioIntervalo += 100;
    }

    scanner.close();
    }
}