package com.poo.ex08_data_comparacao;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        if (isDataValida(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 1;
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1) {
            return false;
        }
        return dia <= diasNoMes(mes, ano);
    }

    private int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && isAnoBissexto(ano)) {
            return 29;
        }

        return diasPorMes[mes - 1];
    }

    private boolean isAnoBissexto(int ano) {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }

    public int compara(Data outraData) {
        if (this.ano != outraData.ano) {
            return this.ano > outraData.ano ? 1 : -1;
        }
        if (this.mes != outraData.mes) {
            return this.mes > outraData.mes ? 1 : -1;
        }
        if (this.dia != outraData.dia) {
            return this.dia > outraData.dia ? 1 : -1;
        }
        return 0;
    }
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public String getMesExtenso() {
        String[] meses = {
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho",
                "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        return meses[mes - 1];
    }

    public int getAno() {
        return ano;
    }

    public boolean isBissexto() {
        return isAnoBissexto(ano);
    }

    public Data clone() {
        return new Data(this.dia, this.mes, this.ano);
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%04d", dia, mes, ano);
    }
}
