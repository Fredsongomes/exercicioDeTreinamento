package com.poo.ex08_data_comparacao;

public class DataTeste {
    public static void main(String[] args) {
        Data data1 = new Data(15, 6, 2026);
        Data data2 = new Data(31, 2, 2026);
        Data data3 = new Data(15, 6, 2026);

        System.out.println("Data 1: " + data1);
        System.out.println("Data 2 (inválida): " + data2);
        System.out.println("Data 3: " + data3);

        System.out.println("\nDia: " + data1.getDia());
        System.out.println("Mês: " + data1.getMes() + " (" + data1.getMesExtenso() + ")");
        System.out.println("Ano: " + data1.getAno());
        System.out.println("É bissexto? " + data1.isBissexto());

        System.out.println("\nComparando data1 com data3: " + data1.compara(data3));

        Data data4 = new Data(1, 1, 2030);
        System.out.println("Comparando data1 com data4 (data1 menor): " + data1.compara(data4));
        System.out.println("Comparando data4 com data1 (data4 maior): " + data4.compara(data1));

        Data clone = data1.clone();
        System.out.println("\nClone de data1: " + clone);
        System.out.println("São iguais (compara)? " + (data1.compara(clone) == 0));
    }
}
