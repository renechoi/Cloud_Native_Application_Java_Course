package kosta.basic.java.day010.practiceSingleton;

public class OrderService {
    private OrderDao dao;

    public OrderService(){
        dao = OrderDao.getInstance();
    }
}
