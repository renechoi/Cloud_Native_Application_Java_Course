package kosta.mission2.mission2_07;

public class Main {
    public static void main(String[] args) {
        // TODO : 전화번호부 관리 프로그램을 구현하자
        // 객체 : 한 사람의 전화 내역을 가진다
        //  => 상태 : 이름(name), 전화번호(phoneNo), 생년월일(birth)
        //  => 기능 : 전화번호 내역을 출력(show)
        //
        // 클래스 : PhoneInfo

        // 1. 해당 클래스를 구현하고 객체를 생성하고 사용해보자
        // 2. 키보드로부터 메뉴를 입력 받아 각 케이스를 선택하도록 하자 : 1.추가 2.출력 3. 종료
        // 3. manager 클래스를 생성해서 각각의 기능을 구현하도록 하자
        // 4. 각각 추가, 출력에 대한 기능을 구현

        InputView inputView = new InputView();

        Controller controller = new Controller(inputView);
        controller.run();
    }
}
