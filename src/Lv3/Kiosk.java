package Lv3;

import Lv2.MenuItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private List<MenuItem> menuItems = new ArrayList<>();

    public Kiosk(List<MenuItem> item){
        this.menuItems = item;
    }

    public void start(){
        int menuInput = 1;
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
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }
        }
    }
}
