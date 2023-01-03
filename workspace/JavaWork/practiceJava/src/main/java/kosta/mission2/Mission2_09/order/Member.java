package kosta.mission2.Mission2_09.order;

public class Member {
    private String name;
    private String address;
    private Item item;
    private int orderCounts;
    private double orderPrice;


    public Member(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void order(Item item, int orderCounts, double orderPrice){
        this.item = item;
        this.orderCounts = orderCounts;
        this.orderPrice = orderPrice;
    }

    public void show(){
        System.out.println(
                String.format("""
                        회원이름 : %s
                        회원주소 : %s
                        주문항 상품 : %s
                        주문한 상품 가격 : %f
                        주문 수량 : %s
                        주문 금액 : %s
                    
                        """, name, address, item.getModelName(), item.getPrice(), orderCounts, orderPrice)

        );
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Item getItem() {
        return item;
    }

    public int getOrderCounts() {
        return orderCounts;
    }

    public double getOrderPrice() {
        return orderPrice;
    }
}
