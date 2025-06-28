import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Operacoes math = new Operacoes();
        System.out.print("Insira o numero a ser Fatorado: ");
        int number = input.nextInt();

        for(int i = number - 1; i > 0; i--) {
            System.out.printf("%5d X %d = ", number, i);
            number = math.multiplicacao(number, i);
            System.out.println(number);

        }
    }
}