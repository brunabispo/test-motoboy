package com.brunabispo;

import java.util.Scanner;

class Motoboy {
    String motoboy_num;
    double price_delivery;
    String stores;
    double amount_to_receive;
    String num_delivery;
    String which_store;

    public Motoboy(String motoboy_num, double price_delivery, String stores, String num_delivery) {
        this.motoboy_num = motoboy_num;
        this.price_delivery = price_delivery;
        this.stores = stores;
        this.num_delivery = num_delivery;
    }

    public double getPrice_delivery() {
        return price_delivery;
    }

    public String toString() {
        String s = "Mototboy " + motoboy_num + "\n" +
                "Loja: " + which_store + "\n" +
                "Quantos Pedidos: " + num_delivery + "\n" +
                "Total a Ganhar: R$" + amount_to_receive + "\n";

        return s;
    }
}

class Loja {
    String store_num;
    int amount_orders;
    double order_1;
    double order_2;
    double order_3;
    double order_4;
    double amount_pay;

    public Loja(String store_num, int amount_orders, double order_1, double order_2, double order_3, double amount_pay) {
        this.store_num = store_num;
        this.amount_orders = amount_orders;
        this.order_1 = order_1;
        this.order_2 = order_2;
        this.order_3 = order_3;
        this.amount_pay = amount_pay;
    }

    public Loja(String store_num, int amount_orders, double order_1, double order_2, double order_3, double order_4, double amount_pay) {
        this.store_num = store_num;
        this.amount_orders = amount_orders;
        this.order_1 = order_1;
        this.order_2 = order_2;
        this.order_3 = order_3;
        this.order_4 = order_4;
        this.amount_pay = amount_pay;
    }

    public double getOrder_1() {
        return order_1;
    }

    public double getOrder_2() {
        return order_2;
    }

    public double getOrder_3() {
        return order_3;
    }

    public double getOrder_4() {
        return order_4;
    }

    public double getAmount_pay() {
        return amount_pay;
    }
}

public class Main {

    public static double getAmount(double store_order, double store_pay, double motoboy_price) {
        return store_order * store_pay / 100 + motoboy_price;
    }

    public static void main(String[] args) {
	    Motoboy motoboy_1 = new Motoboy("1", 2, "todas as lojas", "2");
        Motoboy motoboy_2 = new Motoboy("2", 2, "todas as lojas", "2");
        Motoboy motoboy_3 = new Motoboy("3", 2, "todas as lojas", "2");
        Motoboy motoboy_4 = new Motoboy("4", 2, "apenas loja 1", "2");
        Motoboy motoboy_5 = new Motoboy("5", 3, "todas as lojas", "2");

        Loja loja_1 = new Loja("1", 3, 50, 50, 50, 5);
        Loja loja_2 = new Loja("2", 4, 50, 50, 50, 50, 5);
        Loja loja_3 = new Loja("3", 3, 50, 50, 100, 15);

        motoboy_1.which_store = "2";
        motoboy_1.amount_to_receive = getAmount(loja_2.getOrder_1(), loja_2.getAmount_pay(), motoboy_1.getPrice_delivery());
        motoboy_1.amount_to_receive += getAmount(loja_2.getOrder_2(), loja_2.getAmount_pay(), motoboy_1.getPrice_delivery());

        motoboy_2.which_store = "2";
        motoboy_2.amount_to_receive = getAmount(loja_2.getOrder_3(), loja_2.getAmount_pay(), motoboy_2.getPrice_delivery());
        motoboy_2.amount_to_receive += getAmount(loja_2.getOrder_4(), loja_2.getAmount_pay(), motoboy_2.getPrice_delivery());

        motoboy_3.which_store = "3";
        motoboy_3.amount_to_receive = getAmount(loja_3.getOrder_2(), loja_3.getAmount_pay(), motoboy_3.getPrice_delivery());
        motoboy_3.amount_to_receive += getAmount(loja_3.getOrder_3(), loja_3.getAmount_pay(), motoboy_3.getPrice_delivery());

        motoboy_4.which_store = "1";
        motoboy_4.amount_to_receive = getAmount(loja_1.getOrder_1(), loja_1.getAmount_pay(), motoboy_4.getPrice_delivery());
        motoboy_4.amount_to_receive += getAmount(loja_1.getOrder_2(), loja_1.getAmount_pay(), motoboy_4.getPrice_delivery());

        motoboy_5.which_store = "1 e 3";
        motoboy_5.amount_to_receive = getAmount(loja_1.getOrder_3(), loja_3.getAmount_pay(), motoboy_5.getPrice_delivery());
        motoboy_5.amount_to_receive += getAmount(loja_3.getOrder_1(), loja_1.getAmount_pay(), motoboy_5.getPrice_delivery());

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Motoboy number: ");

        String userInput = input.nextLine();

        switch (userInput) {
            case "1":
                System.out.println(motoboy_1.toString());
                break;
            case "2":
                System.out.println(motoboy_2.toString());
                break;
            case "3":
                System.out.println(motoboy_3.toString());
                break;
            case "4":
                System.out.println(motoboy_4.toString());
                break;
            case "5":
                System.out.println(motoboy_5.toString());
                break;
            default:
                System.out.println(motoboy_1.toString());
                System.out.println(motoboy_2.toString());
                System.out.println(motoboy_3.toString());
                System.out.println(motoboy_4.toString());
                System.out.println(motoboy_5.toString());

        }
    }
}




























