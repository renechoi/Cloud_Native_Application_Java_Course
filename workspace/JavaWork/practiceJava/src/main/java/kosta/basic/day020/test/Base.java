package kosta.basic.day020.test;

public class Base {
    public void service(String state) {

        if (state.equals("낮")) {
            day();
            return;
        }

        if (state.equals("오후")) {
            afterNoon();
            return;
        }

        if (state.equals("밤")) {
            night();
        }
    }

    private void night() {
        System.out.println("night");
    }

    private void day() {
        System.out.println("낮에는 열심히 일하자 !");
    }

    private void afterNoon() {
        System.out.println("오후도 낮과 마찬가지로 일해야 합니다.");
    }
}
