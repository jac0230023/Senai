import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaMelhorAluno = -1, mediaPiorAluno = 11, somaMedia = 0, nota = 0;
        String nomeMelhorAluno = "", nomePiorAluno = "";

        for (int qtdAluno = 0; qtdAluno < 10; qtdAluno++) {


            System.out.printf("Nome do %d° Aluno: ", qtdAluno + 1);
            String nomeAluno = input.nextLine();

            for (int i = 0; i < 4; i++) {
                System.out.printf("%d° Nota: ", i + 1);
                nota = input.nextDouble();
                while (nota < 0 || nota > 10) {
                    System.out.println("Nota Invalida!\n");
                    System.out.printf("%d° Nota: ", i + 1);
                    nota = input.nextDouble();
                }
                somaMedia += nota;
            }
            double media = somaMedia / 4;

            if (media > 0 && media < 5) {
                System.out.printf("Aluno %f Aprovado com %d", nomeAluno, media);
            }

        }

    }
}