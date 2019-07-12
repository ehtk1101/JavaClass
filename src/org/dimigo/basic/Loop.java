package org.dimigo.basic;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        // for문
        // 구구단 출력하기
        for(int i = 2; i < 10; i++){
            for(int j = 1; j < 10; j++){
                System.out.printf("%d * %d = %d\t ",i,j,i*j);
            }
            System.out.printf("\n");
        }

        // for-each문
        int[] arr = {1, 2, 3, 4, 5};
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int data : arr){
            System.out.print(data + " ");
        }
        System.out.println();

        // 빅뱅 멤버 출력
        String[] idol = {"승리", "태양", "TOP", "GD", "대성"};
        // for-each문으로 멤버 출력
        for(String m: idol){
            System.out.print(m + " ");
        }

        // do~while
        // 메뉴 처리
        Scanner scanner = new Scanner(System.in);
        int menu = 0;

        do{
            System.out.println("<< 아이돌 선택 >>");
            System.out.println("1. 트와이스");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 아이즈원");
            System.out.println("9. 종료");
            System.out.print("메뉴 선택 => ");

            menu = scanner.nextInt();

            switch(menu){
                case 1: // 트와이스 선택
                    System.out.println("트와이스를 선택하셨네요");
                    break;
                case 2:
                    System.out.println("블랙핑크를 선택하셨네요");
                    break;
                case 3:
                    System.out.println("아이즈원을 선택하셨네요");
                    break;
                case 9: // Bye 하고 종료
                    System.out.println("Bye");
                    scanner.close();
                    break;
                default:
                    System.out.println("없는 메뉴입니다");
            }
        } while(menu != 9);
    }
}
