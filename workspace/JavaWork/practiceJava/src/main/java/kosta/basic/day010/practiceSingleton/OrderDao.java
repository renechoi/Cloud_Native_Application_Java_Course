package kosta.basic.day010.practiceSingleton;

public class OrderDao {

    private static OrderDao dao = new OrderDao();

    public static OrderDao getInstance(){
        return dao;
    }
}
