package org.dimigo.oop;

import java.util.*;

public class ShoppingBasket {
    private int count;
    private int price;
    private String paymentMethod;
    private String readerbility;
    private String productName[];
    private String company;
    Scanner scanner = new Scanner(System.in);

    public void purchase(String productName[]) {
        for (int i = 0; i < productName.length; i++) {
            System.out.println(productName[i] + "을 구입하셧습니다");
        }
    }

    public void addShoppingcart(String productName[], int count) {
            productName[count] = scanner.next();
            System.out.println(productName[count] + "를 장바구니에 추가했습니다.");
            count++;
    }

    public void productList(String productName[]) {
        for(String i: productName){
            System.out.println(i);
        }
    }

    public void cancellation(String productName[], int count) {
        count--;
        System.out.println(productName[count] + "를 장바구니에서 삭제했습니다.");
    }


    public void payment(String paymentMethod, int price) {
        System.out.println(paymentMethod + "로" + price + "원을 결제하셨습니다.");
    }
}