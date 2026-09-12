package com.poo.ex05_aluno_calculo_media;

public class AlunoCalculaMedia {
    private static final double PESO_PROVA = 2.5;
    private static final double PESO_TRABALHO = 2.0;
    private static final double SOMA_DOS_PESOS = PESO_PROVA + PESO_PROVA + PESO_TRABALHO;

    private static final double MEDIA_APROVACAO_DIRETA = 7.0;
    private static final double MEDIA_MINIMA_PARA_TER_DIREITO_AO_EXAME = 3.0;
    private static final double MEDIA_MINIMA_PARA_PASSAR_APOS_EXAME = 5.0;

    private String matricula;
    private String nome;
    private double notaProva1;
    private double notaProva2;
    private double notaTrabalho;

    public AlunoCalculaMedia(String matricula, String nome, double notaProva1, double notaProva2, double notaTrabalho) {
        this.matricula = matricula;
        this.nome = nome;
        this.notaProva1 = notaProva1;
        this.notaProva2 = notaProva2;
        this.notaTrabalho = notaTrabalho;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public double media() {
        double somaPonderada = (notaProva1 * PESO_PROVA)
                + (notaProva2 * PESO_PROVA)
                + (notaTrabalho * PESO_TRABALHO);

        return somaPonderada / SOMA_DOS_PESOS;
    }

    public double notaNecessariaNoExameFinal() {
        double mediaAtual = media();

        boolean aprovadoDireto = mediaAtual >= MEDIA_APROVACAO_DIRETA;
        boolean reprovadoSemDireitoAExame = mediaAtual < MEDIA_MINIMA_PARA_TER_DIREITO_AO_EXAME;

        if (aprovadoDireto || reprovadoSemDireitoAExame) {
            return 0;
        }

        return (2 * MEDIA_MINIMA_PARA_PASSAR_APOS_EXAME) - mediaAtual;
    }

    public String situacao() {
        double mediaAtual = media();

        if (mediaAtual >= MEDIA_APROVACAO_DIRETA) {
            return "Aprovado direto";
        }

        if (mediaAtual < MEDIA_MINIMA_PARA_TER_DIREITO_AO_EXAME) {
            return "Reprovado (sem direito a exame final)";
        }

        return "Precisa fazer o exame final";
    }
}
