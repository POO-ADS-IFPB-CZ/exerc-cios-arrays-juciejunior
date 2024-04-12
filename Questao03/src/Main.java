import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int numAlunos = 10;
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[numAlunos];
        double soma = 0;

        for(int i = 0; i < numAlunos; i++){
            System.out.println("Informe a nota do " + (i+1) + " aluno:");
            notas[i] = scanner.nextDouble();
            scanner.nextLine();
            soma += notas[i];
        }

        double media = soma/numAlunos;
        int abaixo = 0;
        int acima = 0;
        int igual = 0;

        for(double i: notas){
            if (i < media){
                abaixo++;
            }
            else if(i>media){
                acima++;
            }
            else{
                igual++;
            }

        }

        System.out.println("A média das notas foi: " + media);
        System.out.println(igual + " alunos estão com nota igual a média, " + acima + " alunos estão com notas acima da média, "
                + abaixo + " alunos estão com notas abaixo da média.");


    }




}