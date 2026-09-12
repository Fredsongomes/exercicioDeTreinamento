package com.poo.ex06_invoice_getters_setters;

public class InvoceTest {
    public static void main(String[] args) {


        Invoice invoice1 = new Invoice(101, "Teclado mecânico", 5, 250.0);
        Invoice invoice2 = new Invoice(102, "Mouse sem fio", -3, -50.0);

        System.out.println("--- Fatura 1 ---");
        System.out.println("Item: " + invoice1.getDescricao());
        System.out.println("Quantidade: " + invoice1.getQuantidade());
        System.out.println("Preço unitário: R$ " + invoice1.getPrecoUnitario());
        System.out.println("Valor total: R$ " + invoice1.getInvoiceAmount());

        System.out.println("\n--- Fatura 2 (valores inválidos ajustados para 0) ---");
        System.out.println("Item: " + invoice2.getDescricao());
        System.out.println("Quantidade: " + invoice2.getQuantidade());
        System.out.println("Preço unitário: R$ " + invoice2.getPrecoUnitario());
        System.out.println("Valor total: R$ " + invoice2.getInvoiceAmount());
    }
}
