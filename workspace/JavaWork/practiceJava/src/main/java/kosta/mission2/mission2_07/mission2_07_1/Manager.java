package kosta.mission2.mission2_07.mission2_07_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    List<PhoneInfo> list = new ArrayList<>();
    int count = 0;
    public void addPhoneInfo() { // 1.추가

        System.out.println("이름을 입력해주세요:");
        String name = DataInput.sc.nextLine();

        System.out.println("전화번호를 입력해주세요: ");
        String phoneNo = DataInput.sc.nextLine();

        System.out.println("생년월일을 입력해주세요");
        String birth = DataInput.sc.nextLine();

        list.add(new PhoneInfo(name, phoneNo, birth));

        System.out.println("추가되었습니다!");
        System.out.println();
    }

    public void listPhoneInfo() { //2.출력

        for (int i = 0; i < list.size(); i++) {
            PhoneInfo info = list.get(i);
            info.show();
         }
        }

    public void searchPhoneInfo() { //3.검색
        System.out.println("검색할 이름을 입력해주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < list.size(); i++) {
            PhoneInfo info = list.get(i);
            if(info.getName().equals(name)){
                info.show();
                idx = i;
            }
        }

        if (idx == -1) {
            System.out.println("대상을 찾을 수 없어요");
            System.out.println();
        }
    }

    public void updatePhoneInfo() { //4.수정
        System.out.println("이름을 검색하여 수정할 대상을 찾아주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < list.size(); i++) {
            PhoneInfo info = list.get(i);
            if(info.getName().equals(name)){
                System.out.println("전화번호: ");
                String phoneNo = DataInput.sc.nextLine();
                info.setPhoneNo(phoneNo);
                idx = i;
            }
        }

        if (idx == -1){
            System.out.println("전화번호가 없어요");
        }
    }

    public void deletePhoneInfo() { //5.삭제

        System.out.println("이름을 검색하여 삭제할 대상을 찾아주세요: ");
        String name = DataInput.sc.nextLine();
        int idx = -1;

        for (int i = 0; i < list.size(); i++) {
            PhoneInfo info = list.get(i);
            if(info.getName().equals(name)){
                list.remove(info);
                idx = i;
            }
        }
    }

    public void save(){ // 직렬화

        ObjectOutputStream oos = null;

        try {
            oos = new ObjectOutputStream(new FileOutputStream("PhoneInfo.ser"));
            oos.writeObject(list);

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                oos.close();
            }catch (Exception e2){}
        }
    }

    public void load(){ // 역 직렬화

        ObjectInputStream ois = null;

        try {
            ois = new ObjectInputStream(new FileInputStream("PhoneInfo.ser"));
            list = (List<PhoneInfo>) ois.readObject();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                ois.close();
            }catch (Exception e2){}
        }
    }



}
