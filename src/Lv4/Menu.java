package Lv4;

import Lv2.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private List<MenuItem> menuItems;
    private String category;

    public Menu(List<MenuItem> menuItems, String category){
        this.menuItems = menuItems;
        this.category = category;
    }

    // 메뉴판 출력
    // List에 들어있는 MenuItem을 순차적으로 보여주는 함수
    public void printMenuItem(){
        System.out.println("[ " + category + " MENU ]");
        int i=0;
        for(MenuItem menuItem : menuItems){
            System.out.println(++i + ". " + menuItem.getName() + "   | W " + menuItem.getPrice() + " | " + menuItem.getExplain());
        }
        System.out.println("0. 뒤로가기");
        System.out.print("> ");
    }

    // getter
    // 카테고리 이름 반환
    public String getCategory(){
        return category;
    }

    public List<MenuItem> getMenuItems(){
        return menuItems;
    }
}