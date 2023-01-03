package kosta.mission2.Mission2_09.order;

public class Main {
    public static void main(String[] args) {
        Item galaxy23 = new Item("갤럭시23", 100);

        Member member = new Member("홍길동", "가산");
        member.order(galaxy23, 10, 1000);

        member.show();

        Order order = new Order(member, galaxy23, "1", 1000);
        order.show();
    }
}
