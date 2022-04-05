package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Nota;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Nota nota = new Nota();

        System.out.println("Nota1: ");
        nota.nota1 = sc.nextDouble();

        System.out.println("Nota2: ");
        nota.nota2 = sc.nextDouble();

        System.out.println("Nota3: ");
        nota.nota3 = sc.nextDouble();

        System.out.println("Média = " + nota.Media());
        sc.close();
    }
}