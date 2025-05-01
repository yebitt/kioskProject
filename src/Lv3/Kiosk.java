package Lv3;

import Challenge.Lv1.ShoppingBasket;
import Lv2.MenuItem;
import Lv4.Menu;

import java.util.List;
import java.util.Scanner;

public class Kiosk {
    Scanner scanner = new Scanner(System.in);
    private List<Menu> menus; // 카테고리

    public Kiosk(List<Menu> menus){
        this.menus = menus;
    }

    public void start(){
        ShoppingBasket shoppingBasket = new ShoppingBasket();
        int menuInput1 = 1;
        int menuInput2 = 1;
        int menuInput3 = 1;
        int menuInput4 = 1;

        while(true) {
            // 카테고리 메뉴 출력
            System.out.println("[ MAIN MENU ]");
            int i=0;
            for(Menu menu : menus){
                System.out.println(++i + ". " + menu.getCategory());
            }
            System.out.println("0. 종료      | 종료");
            // 주문내역이 있을 경우 [ ORDER MENU ] 출력
            if(shoppingBasket.getOrderItems() != null && !shoppingBasket.getOrderItems().isEmpty()){
                System.out.println();
                System.out.println("[ ORDER MENU ]");
                System.out.println(++i + ". Orders       | 장바구니를 확인 후 주문합니다.");
                System.out.println(++i + ". Cancel       | 진행중인 주문을 취소합니다.");
            }
            System.out.print("> ");
            menuInput1 = scanner.nextInt();

            // if문 일반화 시키기
            Menu menu;
            if(menuInput1 == 0){
                System.out.println("시스템을 종료합니다.");
                break;
            } else if(0 < menuInput1 && menuInput1 <= menus.size()){
                menu = menus.get(menuInput1-1);
            } else if(menuInput1 == 4){
                System.out.println("아래와 같이 주문 하시겠습니까?");
                System.out.println("[ Orders ]");
                shoppingBasket.printOrders();
                System.out.println("[ Total ]");
                System.out.println("W " + shoppingBasket.total());
                System.out.println();
                System.out.println("1. 주문      2. 메뉴판");
                System.out.print("> ");
                menuInput4 = scanner.nextInt();

                if(menuInput4 == 1){
                    System.out.println("주문이 완료되었습니다. 금액은 W " + shoppingBasket.total() + " 입니다.");
                    // 주문 내역 비우기
                    shoppingBasket.getOrderItems().clear();
                    continue;
                } else if(menuInput4 == 2){
                    continue;
                } else{
                    System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                    continue;
                }

            } else if(menuInput1 == 5){
                continue;
            } else {
                System.out.println("잘못된 입력입니다. 다시 입력하세요.");
                continue;
            }

            // 메뉴판 출력
            menu.printMenuItem();
            menuInput2 = scanner.nextInt();

            List<MenuItem> menuItem = menu.getMenuItems();
            int j;
            if(menuInput2 == 0){
                continue;
            } else if(0 < menuInput2 && menuInput2 <= menuItem.size()){
                j = menuInput2-1;
                System.out.print("선택한 메뉴 : ");
                System.out.println(j+1 + ". " + menuItem.get(j).getName() + "   | W " + menuItem.get(j).getPrice() + " | " + menuItem.get(j).getExplain());
            } else {
                System.out.println("잘못된 입력입니다.");
                continue;
            }

            // 장바구니
            System.out.println();
            System.out.println("\"" + menuItem.get(j).getName() + "   | W " + menuItem.get(j).getPrice() + " | " + menuItem.get(j).getExplain() + "\"");
            System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
            System.out.println("1. 확인        2. 취소");
            System.out.print("> ");
            menuInput3 = scanner.nextInt();

            if(menuInput3 == 1){
                // 확인 - '장바구니 추가' 메서드 호출
                shoppingBasket.add(menuItem.get(j));
                System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
                System.out.println();
            } else if(menuInput3 == 2){
                // 취소
                continue;
            } else {
                // 사용자가 잘못된 선택을 했을 경우 예외를 처리합니다(예: 유효하지 않은 메뉴 번호 입력)
                throw new IllegalArgumentException("잘못된 입력입니다.");
            }


        }
    }
}