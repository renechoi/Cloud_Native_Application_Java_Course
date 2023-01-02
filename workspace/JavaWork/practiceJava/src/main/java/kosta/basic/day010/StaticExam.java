package kosta.basic.day010;

public class StaticExam {

    int total;
    static int grandTotal;

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

}
