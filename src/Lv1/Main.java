package Lv1;

import Lv2.MenuItem;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuInput = 1;
        List<MenuItem> menuItems = new ArrayList<>();
        // List에 메뉴 삽입
        menuItems.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItems.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        while(menuInput != 0) {
            // 메뉴판 출력
            // (반복문을 통해 List 안에 있는 MenuItem을 하나씩 출력)
            System.out.println("[ SHAKESHACK MENU ]");
            int i=0;
            for(MenuItem menuItem : menuItems){
                System.out.println(++i + ". " + menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getExplain());
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("> ");
            menuInput = scanner.nextInt();

            if(menuInput == 1){

            } else if(menuInput == 2){

            } else if(menuInput == 3){

            } else if(menuInput == 4){

            } else if(menuInput == 0){
                System.out.println("프로그램을 종료합니다.");
            } else {
                throw new IllegalArgumentException("잘못된 입력");
            }
        }


    }
}
