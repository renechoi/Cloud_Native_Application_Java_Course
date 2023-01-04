package kosta.mission2.Mission2_08;

public class VideoMain {
    public static void main(String[] args) {

        Video video1 = new Video("트랜스포머3", new Actor("범블비"));
        Member member = new Member("hong", "홍길동", "동탄", video1);

        System.out.println(member);

        member.watchVideo(video1);

        Video video2 = new Video("술도녀", new Actor("이선빈"));
        Member member2 = new Member("kim", "김길동", "서울", video2);

        System.out.println(member2);

        Video drama = Video.valueOf("별그대", new Actor("전지현"),"drama");
        System.out.println(drama);

        Video movie = Video.valueOf("아이언맨", new Actor("로다주"), "movie");
        System.out.println(movie);

        member.watchVideo(movie);

        SpecialMember specialMember = new SpecialMember("special", "스페셜", "서울", movie, 10);

        System.out.println(specialMember);

        member.watchVideo(movie);
        member.watchVideo(movie);
        member.watchVideo(movie);
        member.watchVideo(movie);
        member.watchVideo(movie);
        member.watchVideo(movie);
        member.watchVideo(movie);
        System.out.println(member);


        System.out.println("-".repeat(50));
        System.out.println("-".repeat(50));

        Member[] members = {
                new SpecialMember("casting exercise1", "배열안의객체1", "집", movie, 10),
                new SpecialMember("casting exercise2", "배열안의객체2", "집", drama, 20),
                new SpecialMember("casting exercise3", "배열안의객체3", "집", video1, 30),
        };

        for (Member memberCast : members){
            System.out.println(memberCast);
            System.out.println("-".repeat(10));
        }
    }
}
