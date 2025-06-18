import java.util.Scanner;

 class SistemaEscolar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaração das variáveis
        double[] notas = new double[8];
        double mediaBimestre1, mediaBimestre2, mediaSemestre1;
        double mediaBimestre3, mediaBimestre4, mediaSemestre2;
        double mediaFinal;

        // Entrada das notas
        System.out.println("Digite as 8 notas anuais:");

        for (int i = 0; i < 8; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Cálculo das médias bimestrais
        mediaBimestre1 = (notas[0] + notas[1]) / 2;
        mediaBimestre2 = (notas[2] + notas[3]) / 2;
        mediaSemestre1 = (mediaBimestre1 + mediaBimestre2) / 2;

        mediaBimestre3 = (notas[4] + notas[5]) / 2;
        mediaBimestre4 = (notas[6] + notas[7]) / 2;
        mediaSemestre2 = (mediaBimestre3 + mediaBimestre4) / 2;

        // Cálculo da média final
        mediaFinal = (mediaSemestre1 + mediaSemestre2) / 2;

        // Exibição dos resultados
        System.out.println("\nResultados:");
        System.out.println("1º Bimestre: " + mediaBimestre1);
        System.out.println("2º Bimestre: " + mediaBimestre2);
        System.out.println("1º Semestre: " + mediaSemestre1);
        System.out.println("----------------------");
        System.out.println("3º Bimestre: " + mediaBimestre3);
        System.out.println("4º Bimestre: " + mediaBimestre4);
        System.out.println("2º Semestre: " + mediaSemestre2);
        System.out.println("----------------------");
        System.out.println("Média Final: " + mediaFinal);

        // Fechando o scanner
        scanner.close();
    }
}
