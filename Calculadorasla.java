/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.techinfo.calculadorasla;

import java.util.Scanner;

public class Calculadorasla {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ")
        double nota3 = input.nextDouble();

        double media = nota1 + nota2 + nota3 / 3;

        if (medida >= 7.0) {
            System.out.println("Parabéns! Aluno aprovado com média: " + media);
        } else {
            System.out.println("Poxa... Aluno reprovado com média: " + media);
        }

        inpt.close();
    }
}