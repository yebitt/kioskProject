package Lv1;

import Lv2.MenuItem;
import Lv3.Kiosk;
import Lv4.Menu;
import Lv5.Discount;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // List 선언 및 객체 삽입 - MenuItem클래스
        // Burger
        List<MenuItem> burger = new ArrayList<>();
        burger.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        burger.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        burger.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        burger.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        // Drinks
        List<MenuItem> drinks = new ArrayList<>();
        drinks.add(new MenuItem("coke", 0.5, "시원한 코카콜라"));
        drinks.add(new MenuItem("soda", 0.8, "달달한 소다"));

        // Desserts
        List<MenuItem> desserts = new ArrayList<>();
        desserts.add(new MenuItem("cake", 2.0, "달달한 딸기케이크"));

        // List 선언 및 객체 삽입 - Menu클래스
        List<Menu> menus = new ArrayList<>();
        menus.add(new Menu(burger, "Burger"));
        menus.add(new Menu(drinks, "Drinks"));
        menus.add(new Menu(desserts, "Desserts"));

        Kiosk kiosk = new Kiosk(menus);
        kiosk.start();

    }
}