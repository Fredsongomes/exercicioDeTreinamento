package com.poo.ex05_aluno_calculo_media;

public class AlunoCalculaMediaTeste {
    static void main(String[] args) {
        AlunoCalculaMedia alunoAprovadoDireto = new AlunoCalculaMedia("2026001", "Pedro Alves", 8.0, 7.5, 9.0);
        AlunoCalculaMedia alunoVaiParaExame = new AlunoCalculaMedia("2026002", "Julia Reis", 4.0, 5.0, 6.0);
        AlunoCalculaMedia alunoReprovadoDireto = new AlunoCalculaMedia("2026003", "Marcos Dias", 1.0, 2.0, 1.5);

        imprimirResultado(alunoAprovadoDireto);
        imprimirResultado(alunoVaiParaExame);
        imprimirResultado(alunoReprovadoDireto);
    }

    private static void imprimirResultado(AlunoCalculaMedia aluno) {
        System.out.println("Aluno: " + aluno.getNome() + " (matrícula " + aluno.getMatricula() + ")");
        System.out.printf("  Média: %.2f%n", aluno.media());
        System.out.println("  Situação: " + aluno.situacao());
        System.out.printf("  Nota necessária no exame final: %.2f%n", aluno.notaNecessariaNoExameFinal());
        System.out.println();
    }
}
