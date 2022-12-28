package kosta.oop.day007.mammothCoffee;

public class MammothCoffee {
    // 아메리카노, 카페라떼

    // 커피를 준다

    String beverage;


//    MammothCoffee(String beverage){
//        this.beverage = beverage;
//        handleOrder(beverage);
//    }


    public void order(String beverage){

        System.out.printf("%s는 %d 원입니다\n", beverage, Menu.valueOf(beverage).getPrice());
    }



}
