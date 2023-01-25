package kosta.mission2.mission2_07.mission2_07_1;

import java.io.Serializable;

public class PhoneInfo implements Serializable {

    private String name;
    private String phoneNo;
    private String birth;

    public PhoneInfo(){}

    public PhoneInfo(String name, String phoneNo, String birth) { //command + n
        this.name = name;
        this.phoneNo = phoneNo;
        this.birth = birth;
    }

    public void show(){
        System.out.println("<개인별 전화번호부>");
        System.out.println("이름: " + name);
        System.out.println("전화번호: " + phoneNo);
        System.out.println("생년월일: " + birth);

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    public String getBirth() {
        return birth;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }

}
