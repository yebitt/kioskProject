package Lv3;

import Lv2.MenuItem;
import Lv4.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private List<Menu> menus; // 카테고리

    public Kiosk(List<Menu> menus){
        this.menus = menus;
    }

    public void start(){
        int menuInput1 = 1;
        int menuInput2 = 1;

        while(true) {
            // 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            int i=0;
            for(Menu menu : menus){
                System.out.println(++i + ". " + menu.getCategory());
            }
            System.out.println("0. 종료      | 종료");
            System.out.print("> ");
            menuInput1 = scanner.nextInt();

            // 메뉴판 출력 // for문으로 바꿔보기
            Menu menu;
            if(menuInput1 == 1){
                menu = menus.get(0);
            } else if(menuInput1 == 2){
                menu = menus.get(1);
            } else if(menuInput1 == 3){
                menu = menus.get(2);
            } else if(menuInput1 == 0){
                System.out.println("시스템을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }
            menu.printMenuItem();
            menuInput2 = scanner.nextInt();

            if(menuInput2 == 0){
                continue;
            } else if(0 < menuInput2 && menuInput2 <= menu.getMenuItems().size()){
                MenuItem item = menu.getMenuItems().get(menuInput2-1);
                System.out.print("선택한 메뉴 : ");
                System.out.println(menuInput2 + ". " + item.getName()+ "   | W " + item.getPrice() + " | " + item.getExplain());
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

        }
    }
}