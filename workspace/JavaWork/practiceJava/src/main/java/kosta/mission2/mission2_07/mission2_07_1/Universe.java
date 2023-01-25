package kosta.mission2.mission2_07.mission2_07_1;

public class Universe extends PhoneInfo{

    private String major; //전공
    private String year;  //학번

    public Universe(){}

    public Universe(String name, String phoneNo, String birth, String major, String year) {
        super(name, phoneNo, birth);
        this.major = major;
        this.year = year;
    }

    @Override
    public void show() {
        super.show();
        System.out.println("전공: " + major);
        System.out.println("학번: " + year);
    }


    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
