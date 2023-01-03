package kosta.mission2.Mission2_08.solution;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Video video1 = new Video("1", "탑건2", "톰크루즈");
        Video video2 = new Video("2", "아바타2", "who?");
        Video video3 = new Video("3", "해리포터", "헤르미온느");

        GeneralMember generalMember = new GeneralMember("a", "홍길동", "가산");
        generalMember.rentalVideo(video1);
        generalMember.showEach();

        generalMember.rentalVideos(video1, video2, video3);

        Arrays.stream(generalMember.getVideosRented())
                .filter(Objects::nonNull)
                .map(Video::getInfo)
                .forEach(System.out::println);

        generalMember.showAll();
    }

}
