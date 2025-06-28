import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] alunos = new String[3]; //declaracao de matriz
        Double[][] notas = new Double[3][3]; //declaracao de matrizBi

        for (int l = 0; l < alunos.length; l++){ //intera sobre matriz aluno
            System.out.printf("Nome do %d° Aluno: ", l+1); //imprime pedido de nome do aluno
            alunos[l] = input.nextLine(); //recebe nome do aluno

            for (int c = 0; c < notas.length; c++){ //intera sobre matriz de notas
                //quando chegar no ultimo indice adiciona media
                if (c < notas.length - 1){
                    System.out.printf("%d° Nota: ", c + 1);
                    notas[l][c] = input.nextDouble();
                }else {
                    input.nextLine();
                    notas[l][c] = (notas[l][0] + notas[l][1]) / 2;
                    System.out.println();
                }
            }
        }
        //intera sobre aluno e notas com cabecalho,
        System.out.println(" NOME ALUNO | 1°NOTA | 2°NOTA | MEDIA ");
        for (int l = 0; l < alunos.length; l++){
            System.out.printf("%-11s",alunos[l]);//formatacao com 11char alinhamento a esquerda
            for(int c = 0; c < notas.length; c++){
                System.out.printf(" |  %-5.2f", notas[l][c]);//formatacao com 5char alinhamento a esqueta e duas casa decimal
            }
            System.out.println();
        }


    }
}