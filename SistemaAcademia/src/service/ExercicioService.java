package service;

import domain.Exercicio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ExercicioService {

    public Exercicio cadastraExercicio() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);

        Exercicio exercicio = new Exercicio();

        System.out.print("Informe o nome do exercício: ");
        exercicio.setNome(in.readLine());

        System.out.print("Digite a quantidade de séries: ");
        exercicio.setSeries(sc.nextInt());

        return exercicio;
    }

}
