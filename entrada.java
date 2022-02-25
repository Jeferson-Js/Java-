import java.util.Scanner;

public class entrada {
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        int n1 = 0;
        int n2 = 0;
        int resultado = 0;

        System.out.println("Digite um numero: ");
        n1=teclado.nextInt();

        System.out.println("Digite outro numero: ");
        n2=teclado.nextInt();

        System.out.printf("A soma de %d com %d é igual a %d", n1, n2, resultado);

    }
}