package kosta.basic.day010;

public class StaticExam {

    int total;
    static int grandTotal;
    final int num = 10;

    public static void main(String[] args) {
        StaticExam staticExam1 =  new StaticExam();
        StaticExam staticExam2 =  new StaticExam();

        staticExam1.add();
        staticExam2.add();

        System.out.println(staticExam1.total);
        System.out.println(grandTotal);
        System.out.println("-".repeat(20));

        System.out.println(staticExam2.total);
        System.out.println(grandTotal);
        System.out.println("-".repeat(20));
    }

    public void add(){
        total += 10;
        grandTotal +=10;
    }

    public static void staticExample(){
        Integer.parseInt("1");
        Math.random();

    }

}
