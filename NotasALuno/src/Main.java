import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mediaMelhorAluno = -1, mediaPiorAluno = 11;
        String nomeMelhorAluno = "", nomePiorAluno = "";


        for (int qtdAluno = 0; qtdAluno < 3; qtdAluno++) { //intera pedido de nome de aluno


            System.out.printf("Nome do %d° Aluno: ", qtdAluno + 1); //imprime pedido nome do aluno
            String nomeAluno = input.nextLine(); //recebe nome aluno
            double somaMedia = 0;
            for (int i = 0; i < 4; i++) { // intera pedido de 4 notas para cada aluno
                

                System.out.printf("%d° Nota: ", i + 1);//imprimi pedido de nota
                double nota = input.nextDouble();//recebe nota
                while (nota < 0 || nota > 10) { //enquanto entrada do usuario nao estiver entre 0 e 10 incluso vai solicitar uma nova nota
                    System.out.println("Nota Invalida!\n"); // informa que valor anteriro foi invalido    
                    System.out.printf("%d° Nota: ", i + 1); //imprimi pedido de nota
                    nota = input.nextDouble(); //recebe nota
                }
                input.nextLine(); //consome buff
                somaMedia += nota;    
            }
            double media = somaMedia / 4; //calcula media e armazena na variavel

            //informa qual a situação do aluno
            if (media > 0 && media < 6) { 
                System.out.printf("Aluno %s Reprovado com %.2f.\n", nomeAluno, media);
                System.out.println();
            }else if(media >= 6 && media< 8){
                System.out.printf("Aluno %s em RECUPERAÇÃO com %.2f.\n", nomeAluno, media);
                System.out.println();
            }else if( media >= 8 && media <= 10){
                System.out.printf("Aluno %s APROVADO com %.2f.\n", nomeAluno, media);
                System.out.println();
            }

            //atribui media e nome se atender aos requisitos
            if(media > mediaMelhorAluno){
                mediaMelhorAluno = media;
                nomeMelhorAluno = nomeAluno;
            }else if (media < mediaPiorAluno){
                mediaPiorAluno = media;
                nomePiorAluno = nomeAluno;
            }else {
                break;
            }
        }

        //Imprime melhor e pior aluno com susas notas
        System.out.printf("O melhor aluno foi %s com %.2f.\n",nomeMelhorAluno, mediaMelhorAluno);
        System.out.printf("O pior aluno foi %s com %.2f.",nomePiorAluno, mediaPiorAluno);
    }
}        