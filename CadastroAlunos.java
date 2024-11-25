import java.util.Scanner;

public class CadastroAlunos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos alunos deseja cadastrar?");
        int alunos = entrada.nextInt();

        System.out.println("Quantas notas deseja registar para cada aluno?");
        int notas = entrada.nextInt();

        System.out.println("Qual é a média mínima para aprovação?");
        int mediaMinima = entrada.nextInt();

        double boletim[][] = new double[alunos][notas + 1];

        cadastrarAlunos(entrada, boletim, alunos, notas);

        exibirResultados(boletim, alunos, notas, mediaMinima);

        entrada.close();
    }

    public static void cadastrarAlunos(Scanner entrada, double boletim[][], int alunos, int notas){
        for(int i=0; i<alunos; i++ ){
             System.out.printf("Número de matrícula do aluno %d: ", i + 1);
             boletim[i][0] = entrada.nextDouble();

                
        for(int j = 1; j<=notas; j++){
            System.out.printf("Aluno %d nota %d: \n" , (int) boletim[i][0], j );
            boletim[i][j] = entrada.nextDouble();
            }
        }
    }
    
    public static void exibirResultados(double boletim[][], int alunos, int notas, int mediaMinima){
        System.out.println("\n--- Resultados ---");
        for (int i = 0; i < alunos; i++) {
            double soma = 0;

            
            for (int j = 1; j <= notas; j++) {
                soma += boletim[i][j];
            }

            double media = soma / notas;

            
            System.out.printf("Aluno %d (Matrícula %.0f): Média = %.2f - ",
                    i + 1, boletim[i][0], media);

            if (media >= mediaMinima) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
               
        }
    }
        
    }
    

