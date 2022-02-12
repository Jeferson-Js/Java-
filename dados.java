import java.util.Scanner;

public class dados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome1, nome2;
        double salario1, salario2;
        int idade;
        char sexo;

        System.out.print("Digite o nome da primeira pessoa: ");
        nome1 = sc.nextLine();
        System.out.print("Digite o salario da primeira pessoa: ");
        salario1 = sc.nextDouble();

        System.out.print("Digite o nome da segunda pessoa: ");
        sc.nextLine();
        nome2 = sc.nextLine();
        System.out.print("Digite o salario da segunda pessoa: ");
        salario2 = sc.nextDouble();

        System.out.print("Digite uma idade: ");
        sc.nextLine();
        idade = sc.nextInt();
        System.out.print("Digite um sexo (F/M): ");
        sexo = sc.next().charAt(0);

        System.out.println("nome 1 = " + nome1);
        System.out.println("salario 1 = " + String.format("%.2f", salario1));
        System.out.println("nome 2 = " + nome2);
        System.out.println("salario 2 = " + String.format("%.2f", salario2));
        System.out.println("idade = " + idade);
        System.out.println("sexo = " + sexo);

        sc.close(); // Para desalocar todos os recursos que eu aloquei.
    }
}