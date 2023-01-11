package kosta.mission3.mission3_04;

public class Main {
    public static void main(String[] args) {
        // 1. 주문요청 2. 주문처리  3. 매출액 총액  4. 종료
        // 입력 1 -> Food(foodName, price), Order(Food, amount) 생성 => 자료 구조 추가
        // 입력 2 -> 자료구조에 있는 주문처리 (주문된 내용 출력)
        // 입력 3 -> 주문처리된 메뉴에 대한 합계 출력

        Store.openStore();

        DeliveryManager deliveryManager = new DeliveryManager();

        deliveryManager.receive(new Order());
        deliveryManager.receive(new Order());
        deliveryManager.receive(new Order());
        deliveryManager.receive(new Order());
        deliveryManager.receive(new Order());

        deliveryManager.handleOrder();
    }
}
