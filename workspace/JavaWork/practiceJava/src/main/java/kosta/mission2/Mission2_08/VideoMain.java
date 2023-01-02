package kosta.mission2.Mission2_08;

public class VideoMain {
    public static void main(String[] args) {

        Video video1 = new Video("트랜스포머3", new Actor("서봉수"));
        GeneralMember generalMember = new GeneralMember("aaa", "홍길동", "동탄", video1);

        System.out.println(generalMember);

        Video video2 = new Video("트랜스포머4", new Actor("김봉수"));
        GeneralMember generalMember2 = new GeneralMember("bbb", "김길동", "서울", video2);

        System.out.println(generalMember2);
    }
}
