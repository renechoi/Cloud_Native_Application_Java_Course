package kosta.mission2.Mission2_08;

public class VideoMain {
    public static void main(String[] args) {

        Video video1 = new Video("트랜스포머3", new Actor("서봉수"));
        GeneralMember generalMember = new GeneralMember("hong", "홍길동", "동탄", video1);

        System.out.println(generalMember);

        generalMember.watchVideo(video1);

        Video video2 = new Video("트랜스포머4", new Actor("김봉수"));
        GeneralMember generalMember2 = new GeneralMember("kim", "김길동", "서울", video2);

        System.out.println(generalMember2);

        Video drama = Video.valueOf("별그대", new Actor("전지현"),"drama");
        System.out.println(drama);

        Video movie = Video.valueOf("별그대", new Actor("전지현"), "movie");
        System.out.println(movie);

        generalMember.watchVideo(movie);
    }
}
