package kosta.mission2.Mission2_09.order;

public class Order {
    private Member member;
    private Item item;
    private String orderNo;
    private int amount;
    private double totalPrice;

    public Order(Member member, Item item, String orderNo, int amount) {
        this.member = member;
        this.item = item;
        this.orderNo = orderNo;
        this.amount = amount;
        this.totalPrice = amount * item.getPrice();
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
                    
                        """, member.getName(), member.getAddress(), item.getModelName(), item.getPrice(),
                        amount, totalPrice)

        );
    }
}
