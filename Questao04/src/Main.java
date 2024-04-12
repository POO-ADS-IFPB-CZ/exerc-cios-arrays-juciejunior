import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] num =  new int[100];
        int quantidadeNum = 0;
        int soma = 0;

        while(true){

            System.out.println("Digite um número inteiro maior ou igual a 0: ");
            num[quantidadeNum] = scanner.nextInt();
            scanner.nextLine();

            if(num[quantidadeNum] < 0) {
                break;
            }

            soma+=num[quantidadeNum];
            quantidadeNum++;

        }



        if(quantidadeNum > 0){
            double media = (double) soma/quantidadeNum;
            System.out.println("Quantidade de números digitados: " + quantidadeNum);
            System.out.println("Média dos números digitados: " + media);
        }
        else{
            System.out.println("Nenhum número válido foi digitado.");
        }

    }
}