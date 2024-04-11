import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tamanho = 30;
        int[] serieFibonacci = new int[tamanho];
        serieFibonacci[0] = 1;
        serieFibonacci[1] = 1;


        for(int i = 2; i < tamanho; i++){
            serieFibonacci[i] = serieFibonacci[i--] + serieFibonacci[i-2];
        }

        for(int i = 0; i < tamanho; i++){
            System.out.println(serieFibonacci[i]);
        }

    }
}