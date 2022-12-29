package kosta.mission2.mission2_05.solution2;

public class BookMain {
    public static void main(String[] args) {
        int total = 0;

        Book[] books = {
                new Book("java", 30000),
                new Book("jsp", 20000),
                new Book("oracle", 15000)
        };

        for (Book book : books){
            book.discount();
            book.printEach();
            total+= book.discountedPrice;
        }

        System.out.printf("총금액 : %d원", total);
    }
}
