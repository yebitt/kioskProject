package Challenge.Lv1;

import Lv2.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    private static List<MenuItem> orderItems = new ArrayList<>();

    //사용자가 선택한 메뉴를 장바구니에 추가 기능
    public void add(MenuItem menuItem){
        orderItems.add(menuItem);
        System.out.println(menuItem.getName() + " 이 장바구니에 추가되었습니다.");
    }

    // [ Total ] 출력 메서드
    // 총합 메서드
    public double total() {
        double sum = 0;
        for(MenuItem menuItem : orderItems){
            sum += menuItem.getPrice();
        }
        return sum;
    }

    // [ Orders ] 출력 메서드
    public void printOrders(){
        for(MenuItem item : orderItems){
            System.out.println("-" + item.getName() + " | W " + item.getPrice() + " | " + item.getExplain());
        }
    }

    // getter
    public List<MenuItem> getOrderItems(){
        return orderItems;
    }
}
